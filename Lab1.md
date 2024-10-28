# Phân tích kiến trúc hệ thống Payroll System

## 1. Phân tích kiến trúc

- **Kiến trúc phù hợp**: Kiến trúc Model – View – Controller (MVC) là lựa chọn phù hợp cho hệ thống Payroll System.
- **Giải thích**: Khi áp dụng kiến trúc MVC vào hệ thống Payroll System sẽ giúp tổ chức code tốt hơn, quản lý dữ liệu nhân viên, tính lương, chấm công hiệu quả. Ngoài ra, hệ thống cũng dễ dàng thêm các chức năng mới (ví dụ: tính thuế, bảo hiểm) và bảo trì hệ thống.

### Ý nghĩa của các thành phần trong MVC

- **Model**: Chứa dữ liệu và logic nghiệp vụ của hệ thống. Trong Payroll System, `Model` sẽ bao gồm các lớp như `Employee`, `Payroll`, `Timecard`, `Project`,... và các logic xử lý liên quan như tính toán lương, quản lý thời gian, v.v.
- **View**: Trình bày dữ liệu cho người dùng. `View` chịu trách nhiệm hiển thị giao diện người dùng, bao gồm các form nhập liệu, bảng biểu, báo cáo,...
- **Controller**: Tiếp nhận yêu cầu từ người dùng, tương tác với `Model` để xử lý dữ liệu và chọn `View` phù hợp để hiển thị kết quả.


![Package diagram](https://www.planttext.com/api/plantuml/png/TPBFJiCm3CRlUOgetFi426th00brOWZ4nD5hJPSjJKhYKarexuwN_bctmI47Ez_F_knauWaSrQKM5MGxA516IuSU3G4fQsGAUtIHl4bLiQ6bCZlv8wGSjDEgqYfhfUyA6nz9y1AgAWGTzkWGJU0EV8pD6No2Rv3JrLlGRpc0XZfvOXteJduGuizUgIrKrjlwGArj4uYsU68DEQlbytgB6RMUCdAQO_QqsY3GXPrPxPL1x_l23AoxLCYSKsDNSo28hWPjgyvdYzTGAr-Nt3Y176ccQxne_bAZsyjxKt2_8Fyw9jhuV-f1QPGBCEoYvESAu2Vd5aL9rnHR7bubpcrZuhjX9MBOpMtiZdFmtTdqudmNFJ-oASQMJrLwFo8iu9GVanCqEV-_Nm00)

 ## 2. Cơ chế phân tích

- **Persistency**: Hệ thống cần lưu trữ thông tin về nhân viên và các bảng chấm công, hóa đơn mua hàng, báo cáo, phương thức thanh toán, v.v., để có thể truy cập và cập nhật dữ liệu một cách đáng tin cậy. Tính bền vững giúp duy trì dữ liệu lâu dài, bảo đảm rằng dữ liệu của nhân viên không bị mất sau khi hệ thống ngừng hoạt động và đảm bảo rằng các bản ghi lương luôn sẵn sàng khi cần.

- **Legacy Interface**: Hệ thống mới cần tích hợp và truy xuất thông tin từ cơ sở dữ liệu quản lý dự án cũ (DB2) trên mainframe IBM mà không làm thay đổi cơ sở dữ liệu hiện tại. Vì lý do chi phí, Acme muốn tận dụng lại hệ thống cũ mà không phải thay thế nó, vì vậy cần một giao diện giúp hệ thống mới tương tác mà không gây ảnh hưởng đến dữ liệu cũ.

- **Security**: Hệ thống phải đảm bảo rằng chỉ nhân viên có quyền mới có thể xem và chỉnh sửa dữ liệu cá nhân của họ. Ngoài ra, cần ngăn chặn truy cập trái phép để bảo vệ thông tin nhạy cảm về nhân viên và tiền lương. Bảo mật giúp duy trì quyền riêng tư, tuân thủ các yêu cầu bảo mật nội bộ và tránh các rủi ro về truy cập trái phép.

#  3 Phân tích ca sử dụng Payment

## 3.1. Các lớp phân tích

- **Boundary**: `PaymentForm`, `ProjectManagementDatabase`
- **Control**: `PaymentController`
- **Entity**: `Employee`

## 3.2. Nhiệm vụ của từng lớp phân tích

- **PaymentForm**: Hiển thị giao diện người dùng (UI) và các trường input để người dùng nhập thông tin thanh toán.
- **ProjectManagementDatabase**: Truy xuất thông tin theo phương thức thanh toán hiện tại để hiển thị lên giao diện người dùng.
- **PaymentController**: Xử lý các yêu cầu thanh toán.
- **Employee**: Đại diện cho nhân viên, chứa các thông tin và phương thức liên quan đến nhân viên.

 ## 3.3. ![Class Diagram](https://www.planttext.com/api/plantuml/png/TLFBReCm4BpdAtniHV83A8gI0fLGIuBQz5mji4bf_Q2sYOIY_7kNHnu4UhHdrZExiruQ2zgMWazI3iQm62g1qZuhBTXydgXIPg2hnO8T9umvBCjDmQ7gM9l2vagQXyS6swFjxYEqNoeBPL7Q6ckW27AUo_qgopGQqyUUGFwiqfJ4x0LWJgVbARdBjO1QgWS4MYiTqMEmHm9EatuBL6UruXmrDPAsXtCVfDa8UQNMHEtPRZKEmFCCBDuODN304MPPrBnxuEf6gszCgNr9DckA3nOIC3WotiRMJdNDziq5ek2gGXmgd15wa7YvlQQ57HBwp6MvjFMb185qCbPJ6WshkBL-WTWn3hsNZtZAebNuEcL--1Pusqy_Y3VluVRKL2QKsthm7hH9hakHqEolaCD4RmTwLGOvJMamNkT-gTh6RxTqDXj9t6KQVqiqTNH3j2xvDnQNKPv0zUGDQGt6woz3Trcx02IqH9dHJ_e3) <br>
 ## 3.4. ![Sequence Diagram](https://www.planttext.com/api/plantuml/png/dPHDJiCm48NtESKiGO8Bi43z0wcBIXM80qpZQJ5rxE1nAkNsZFFJEZIHABlQdlVvUUQbCmxeGrMOZ8_QWdTC6UR1UNWfIkDg8a263oQVxLnb5VeQjbWNPCEhyqMMEnkyC_tUibqQAPUL3lK08xypXG5to0HRxxue3nkqUA2eNVKdKhbQP5cy51wVq-lW2Txeko8E3C51LGgDe6mBeA3mwLIqhqznF_MPGYxCYrqX-vPyTtz5I5vrBHJQQY7o0uMrtGiVWtPsMNalTLrvtuHDup2zGHugwWb7iLTYAtXD9pGYKvGAHxqCkzNP-DKYq1UZANFokNtRcf4ymKfpQR3cCzQL4SKZhARv4wDy9oC1uDuKMWLoI9u7_luxJfb7jzrsVMtBIeRx40ysg8ssXxbIdfZJamNQuppF9UgXsxuv3MDcP7mwPhLdZWeb9LBAJLS6rbCJyHkAXNticAPhp-5goUtdSXMZZZPcMnPxxGlkfAam-lX305KRbGxKJ7HeuERCvGbgAd0piah-qtu0)

## 4. Phân tích ca sử dụng Maintain Timecard <br>
   ### 4.1. Các lớp phân tích: <br>
     Boundary: TimecardForm, ProjectManagementDatabase 
     Control: TimecardController 
     Entity: Employee, Timecard 
   ### 4.2. Nhiệm vụ của từng lớp phân tích: <br>
     TimecardForm: Hiển thị UI và các trường input để người dùng nhập 
     ProjectManagementDatabase: Truy xuất thông tin theo timecard method hiện tại để hiển thị lên UI 
     TimecardController: Xử lí các request timecard 
     Employee: Đại diện cho employee, chứa các thông tin và phương thức liên quan đến employee 
     Timecard: Đại diện cho timecard, chứa các thông tin và phương thức liên quan đến timecard 
   ### 4.3  ![Class Diagram](https://www.planttext.com/api/plantuml/png/ZLF1QiCm3BtdAtJRTcXPhwMKmhhT1cFi1zHORRpQLf2SZJBsxtFZ9AHTEnO82TAptdkIlDA84Xll2jtR0C9AnGsiQMi3mOQRO50EK3fK9ItQBxnPJoMAUMBni5ZqgEKIlWf8Zx5QEpn0x72tTssOQmhTBuL80XKteh1bWR92sH64ncz8j0Dvj26czxoEuWUDOzz5f-j5-9tA-8m1T-GJnneZRb3faiWTnPwsP4EQ2mtMImvHs5rn_f2pBfbOB3heQUL690aubtw1z1XkQeEH_k5pa9TgstXjBabJpW-ISgS_MVPasa2TnbEJM3O3rKXYJmesRFcgng7lZxvsV23wpHlGKnvu3x6PS8DXtrRFz5nQTA2KsdQqbVUWJQ4nGgfPTCM1nabAA-9wFyU1WwTO9Kzjgrx9ORGSjBAr5YTBEvaiByro3hFfT5PSo8mF95WttY5o_yUnwrivFptNeeTUTibYHS4Sh-SF) <br>
   ### 4.4. ![Sequence Diagram](https://www.planttext.com/api/plantuml/png/dPH1ReCm44NtFeMNH6ekq4KLYQPg5gsgghkgYucP9AwmZOOXKcvV0w7WWabITenv_zj_FAnA1kBAv4A0OaToROhSdH15uUjQwG8iomzjK05bJuxCv4BgB9FBSwJ9vQ3uHkuR5R-0XJqQjFm835ieKOZEN2uV0azvBrs1Dbc8e3hugj-0_tQFd5P4NhfRJl2ilCbwZG4pK6hvxcrZTsuIbikOEo5NPALgTo2vos3ATdpEJ9T53gSnBY1d-RcsxBc3gwYKEzykTG3QexILsI9z2UcVM4Hd0wmLdci1NqWR_BMXaqRrxYpPrXQpYi6ngo83nj_0Buf5qxzLADu9vUnEam7MpaQzuoreDvBrBK3RjU4TcJGUiSjVkGpB-VX7DxGXqnfCvfA9ZajC9WvSlBA3m_mZhm1lifgPvnAEVO-ldEk0-JiWLynrpIVNZ71mSMuBeVO8UR7oMTH_s1y0) <br>
## 5. Diagram hợp nhất ca sử dụng
![Sequence Diagram](https://www.planttext.com/api/plantuml/png/bLHHRzem47xFh_1RkwcjrbU4K2caKhJHeeuzJyO-YDlOZivE9pJjly-ndP04CZGaH7BV-UwxZ-_yO2n5MyaYIQx8ewuKftWWhA36W4dyBza82OmYVz8eoNIwZLcp6VcT4FVXmfG5FH0Rywu_-R0kGSL7K1QGvBf2GtOQ2Sifxe6eIcu1JKoIL2ZhliCwXdv0D_OdYRpMz21TvGkqOjPBQOLMJQyzs1XVWSqrprHPsIEseg8GQZ_d7C6O0VX8rVkSCTVETf7ORg7LJg2aTRS-aY9gNBbwT0zXZ2lYiYtgOaJmY1PEk-cKXPTsFCU4i0hHpJ1Kp4D1OgOvD4DN9QSM_bVUIoG6wYm2fPww4VsWXQWPT4_KtS_b1gv3n6kMAYlic4STH_1uIp6uxfV6T-0-K3ghbe12yvP1HxT62IBKJeyArugKohBG1u3JlX2HR4achfZrGKKbk5TZqTchONCSiON8zJfRVFsnlY6hUVRjXYoprtIn-RbCro_ViqrWjNK-V3wfHuCpd_rgzI7PS_M0HgvLiv1z1EfZnz3H7gZVWBbLKSxFzGXBQkcM6ZYtYzudRlFZNh2UIHeDWmQZ5lP__YiKleJ9HMcItirqUpixjpaJSdztTv-SGRe7N5earKQ-_EFO-F2JSAvxD_a39yiKUPq2TNfhgm7x8UXxjU-NcBbIdvFa0HIlB_o_) <br>
  ### 5.1. Các tác nhân tham gia:
  * **Employee**: Ghi nhận thời gian làm việc, tạo đơn hàng bán hàng (nếu có), và chọn phương thức thanh toán.
  * **Payroll Administrato**: Quản lý thông tin nhân viên, thiết lập các thông tin như loại hình thanh toán (theo giờ, cố định, hoặc theo hoa hồng), và tạo báo cáo hành chính.
  * **Project Management Database**: Cơ sở dữ liệu hiện có chứa thông tin về các dự án và mã chi phí, được hệ thống Payroll truy xuất để phục vụ quá trình quản lý chấm công.
  ### 5.2. Các lớp phân tích tham gia:
  - **Boundary Classes**:
    - **TimecardForm**: giao diện cho nhân viên nhập và quản lý bảng chấm công.
    - **PaymentForm**: giao diện cho nhân viên chọn và thay đổi phương thức thanh toán.
    - **ProjectManagementDatabase**: truy xuất thông tin mã chi phí từ cơ sở dữ liệu dự án.
  - **Control Classes**:
    - **TimecardController**: xử lý dữ liệu từ TimecardForm và truy xuất mã chi phí từ ProjectManagementDatabase.
    - **PaymentController**: xử lý việc chọn và cập nhật phương thức thanh toán của nhân viên.
  - **Entity Classes**:
    - **Employee**: chứa thông tin nhân viên bao gồm loại hình thanh toán, phương thức thanh toán, giờ làm, và thông tin ngân hàng.
    - **Timecard**: ghi nhận thời gian làm việc và số giờ làm cho mỗi nhân viên.