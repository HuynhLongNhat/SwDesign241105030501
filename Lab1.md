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

## 3.1. Các lớp phân tích

- **Boundary**: `PaymentForm`, `ProjectManagementDatabase`
- **Control**: `PaymentController`
- **Entity**: `Employee`

## 3.2. Nhiệm vụ của từng lớp phân tích

- **PaymentForm**: Hiển thị UI và các trường input để người dùng nhập
- **ProjectManagementDatabase**: Truy xuất thông tin theo payment method hiện tại để hiển thị lên UI
- **PaymentController**: Xử lí các request payment
- **Employee**: Đại diện cho employee, chứa các thông tin và phương thức liên quan đến employee

 3.3. ![Class Diagram](https://www.planttext.com/api/plantuml/png/TLFBReCm4BpdAtniHV83A8gI0fLGIuBQz5mji4bf_Q2sYOIY_7kNHnu4UhHdrZExiruQ2zgMWazI3iQm62g1qZuhBTXydgXIPg2hnO8T9umvBCjDmQ7gM9l2vagQXyS6swFjxYEqNoeBPL7Q6ckW27AUo_qgopGQqyUUGFwiqfJ4x0LWJgVbARdBjO1QgWS4MYiTqMEmHm9EatuBL6UruXmrDPAsXtCVfDa8UQNMHEtPRZKEmFCCBDuODN304MPPrBnxuEf6gszCgNr9DckA3nOIC3WotiRMJdNDziq5ek2gGXmgd15wa7YvlQQ57HBwp6MvjFMb185qCbPJ6WshkBL-WTWn3hsNZtZAebNuEcL--1Pusqy_Y3VluVRKL2QKsthm7hH9hakHqEolaCD4RmTwLGOvJMamNkT-gTh6RxTqDXj9t6KQVqiqTNH3j2xvDnQNKPv0zUGDQGt6woz3Trcx02IqH9dHJ_e3) <br>
   3.4. ![Sequence Diagram](https://www.planttext.com/api/plantuml/png/dPHDJiCm48NtESKiGO8Bi43z0wcBIXM80qpZQJ5rxE1nAkNsZFFJEZIHABlQdlVvUUQbCmxeGrMOZ8_QWdTC6UR1UNWfIkDg8a263oQVxLnb5VeQjbWNPCEhyqMMEnkyC_tUibqQAPUL3lK08xypXG5to0HRxxue3nkqUA2eNVKdKhbQP5cy51wVq-lW2Txeko8E3C51LGgDe6mBeA3mwLIqhqznF_MPGYxCYrqX-vPyTtz5I5vrBHJQQY7o0uMrtGiVWtPsMNalTLrvtuHDup2zGHugwWb7iLTYAtXD9pGYKvGAHxqCkzNP-DKYq1UZANFokNtRcf4ymKfpQR3cCzQL4SKZhARv4wDy9oC1uDuKMWLoI9u7_luxJfb7jzrsVMtBIeRx40ysg8ssXxbIdfZJamNQuppF9UgXsxuv3MDcP7mwPhLdZWeb9LBAJLS6rbCJyHkAXNticAPhp-5goUtdSXMZZZPcMnPxxGlkfAam-lX305KRbGxKJ7HeuERCvGbgAd0piah-qtu0)
