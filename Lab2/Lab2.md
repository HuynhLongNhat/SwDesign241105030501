## 1. Phân tích ca sử dụng CreateEmployee
### 1.1. Lớp phân tích:
- **Boundary**: `CreateEmployeeForm`, `ProjectManagementDatabase`
- **Control**: `EmployeeController`
- **Entity**: `Employee`

### 1.2. Biểu đồ Sequence:
![Sequence](https://www.planttext.com/api/plantuml/png/b5HBRXin3Dth54JMzGKCk0YGk1-W0O8uGDUqnB6LQgG1nGdWitNH8_KAfUONE_Oug5TZIU-ZHuf_V_-vpO8iRHqCMaaCwxe9wK1ajgcD3la0JzGabY-9QsDJ54vXMBhh_mLYGr6yZ4UDGy4jPe97JYzavG4ZxgZMG_V3ZZ6h5TmneT2aEA0Bo5BEi5ePC-qjFX_vW2LiA2WnS0-HGqEVGFc9mHLEnhWZSuIOy6-cEvReHWxBNk4UZS4WevTd9GQVuUOv2GRubbhEy3FnBt9GQLeuNl76WFxE95HsDWFLVo9XJwy4mMU1L87T8-y8ObjlYNF7EOzVNBxKZtckI_vEOhttkGbukERdevASG8vKFof3xk2Qwoc1RXapxrlHNoaITqNlLqes3b9yg-XmT2QlORSqxHMXTm7rMdslJ8dOVKgPCaY2Z5fLsO-cBkGmePQbn7KZNKD5h0bGumZ9edYznK1sFNjbUFMEpk7_Ku1YsKTrKR-7pYI_AOZn2QhDXgolF1sfKyXqdazCSZsZ6JqDtoAFBxPl3PqZQpM_aT81EZAKMmdzRj_rxpJDlbUGMrlcIjM6fLcCfFgsRJU6N1TRQefj3E7GkNC5ryPJv9fP2rNhWZv8S7r3wD75DBdKM2xkoaN9tEfNcQ__0000__y30000)

### 1.3. Nhiệm vụ của từng lớp:
- **Boundary**:
  - **User Interface Class**: `CreateEmployeeForm` – Cung cấp giao diện người dùng để nhập thông tin nhân viên mới và gửi thông tin này đến `EmployeeController` để xử lý.
  - **System Interface Class**: `ProjectManagementDatabase` – Tương tác với cơ sở dữ liệu để lưu trữ thông tin nhân viên và trả về kết quả thành công hoặc thất bại.
- **EmployeeController**: Xử lý nghiệp vụ liên quan đến nhân viên, kiểm tra tính hợp lệ của dữ liệu, tạo đối tượng `Employee`, yêu cầu `ProjectManagementDatabase` lưu trữ dữ liệu và trả kết quả về giao diện người dùng.
- **Entity**: `Employee` – Lưu trữ thông tin của nhân viên, bao gồm các thuộc tính như tên, mã số nhân viên, chức vụ và các thông tin liên quan khác.

### 1.4. Một số thuộc tính và quan hệ của lớp phân tích:

#### **Lớp `Employee`**

- **Thuộc tính**:
  - `id`: Mã nhân viên. Kiểu dữ liệu là số nguyên (int) hoặc chuỗi (string), dùng để nhận diện nhân viên trong hệ thống.
  - `name`: Tên nhân viên. Kiểu dữ liệu là chuỗi (string).
  - `employeeId`: Mã nhân viên, có thể là số nguyên (integer) hoặc chuỗi (string), tùy theo cách quản lý của hệ thống.
  - `bankInfo`: Thông tin ngân hàng. Kiểu dữ liệu có thể là một lớp riêng biệt (class) chứa các thông tin chi tiết như số tài khoản ngân hàng, hoặc có thể là chuỗi (string).
  - `socialSecurityNumber`: Mã số an sinh xã hội của nhân viên. Kiểu dữ liệu là chuỗi (string).
  - `address`: Địa chỉ của nhân viên. Kiểu dữ liệu là chuỗi (string).
  - `phoneNumber`: Số điện thoại của nhân viên. Kiểu dữ liệu là chuỗi (string).
  - `email`: Địa chỉ email của nhân viên. Kiểu dữ liệu là chuỗi (string).
  - `paymentMethod`: Phương thức thanh toán cho nhân viên, có thể là kiểu liệt kê (enum) hoặc chuỗi (string), ví dụ: chuyển khoản ngân hàng, tiền mặt, v.v.

- **Quan hệ**:
  - **Liên kết với `EmployeeController`**: `EmployeeController` tạo và quản lý đối tượng `Employee` trong quá trình xử lý thông tin nhân viên.
  - **Liên kết với `ProjectManagementDatabase`**: `Employee` có thể được lưu trữ vào hoặc truy xuất từ `ProjectManagementDatabase` để cập nhật hoặc lấy thông tin nhân viên.
#### **Lớp `CreateEmployeeForm`**
- **Quan hệ**:
  - **Liên kết với `EmployeeController`**: Khi người dùng hoàn thành thông tin và nhấn nút submitButton, CreateEmployeeForm sẽ gửi dữ liệu đến EmployeeController để xử lý việc tạo mới nhân viên.
#### **Lớp `EmployeeController`**
- **Quan hệ**:
  - `Liên kết với CreateEmployeeForm`: EmployeeController nhận dữ liệu từ CreateEmployeeForm, xử lý nghiệp vụ và trả kết quả về giao diện người dùng.
  - `Liên kết với ProjectManagementDatabase`: Sau khi xử lý và xác thực dữ liệu, EmployeeController yêu cầu ProjectManagementDatabase lưu trữ thông tin nhân viên mới
#### **Lớp `ProjectManagementDatabase`**
- **Quan hệ**:
  - `Liên kết với EmployeeController`: ProjectManagementDatabase nhận yêu cầu từ EmployeeController để lưu trữ, truy xuất thông tin nhân viên.
### 1.5. Biểu đồ lớp:
![Class](https://www.planttext.com/api/plantuml/png/T95DQiCm48NtEeNm9cqWeRb1e26h54f23p2H1tk2VencH0Yb9-kYH-eLAWlNJGtMHZozzsRuqFVdrvO5eYHdbJ8McFKXDEJt8JhzhdGvDN5duLQCauc8_k5ni3YT7Kbnyjl7lndFmKiCrc8S9q6I5hsG0S4tndZVUOtXWaPUm4E3BgTs8706nh7Te4nBlHxzb8K7XuFiSk0QOjsd5_g85eI2vvOwrbUILhjaXJfBXeIGrHzujQdqQbMk2OcQajr5Pm7KFDfl_MczNbQ5PdP3Zco6YDgYh_il-m400F__0m00)
## 2. Phân tích ca sử dụng Maintain Purchase Order
### 2.1. Lớp phân tích:
- **Boundary**: `SelectFunctionForm`,`CreateForm`,`UpdateForm`, `ProjectManagementDatabase`
- **Control**: `SelectFunctionController`, `CreateController`, `UpdateController`, `DeleteController`
- **Entity**: `PurchaseOrder`, `Employee`

### 2.2. Biểu đồ Sequence:
![Sequence](https://www.planttext.com/api/plantuml/png/j5RBRi8m4BpdA_O81yGTYGg9WDe3QbNK3p3nqhfoREeu8BwjXtvIVw5EdBSTI0xbWCHwTpmxCqJv_VvP9PeedSOy896M2jOoZbcIC2cGRk8JbrV4u21JGOcwmXuvHdgRYaYRZgrKSNssLaWqjcjl9rhMWaWAhIJlOAnjbQEg6YoGvy2YUGv20zawGA6PliABaf_chXqHv1rZKmo99WUIODMGgkZ3_7vMr4m5ooNi21EmvV824qiKIgPJM2u3dpmmU_08ioXgS2oACB6BpUqQSqjw6hYZBc2zMWOhA2JvCT8AFGW8ruLqrLfWzmBpwSFBxkeAle178YZ74axXLug9pd6wlVMyNJfaoOcJCWsGMv_FzGZNdDq8RG1F9NcPaGUAcZ2UD2ul9N9fxzD3p7JlO9jrRpWC3ZaZ2BpuXEmTWvcNqolgL8dkLa_X83Nt7oQ8Bf5itAJ0UcxZDDRpxd-fyho0QthUxQtdsvuNetSzRyvQpztrwdjBkrt6XTsjxi4U6ryKmxDNkDiUkqGAZztS3LNEazW1skqaPKVVy43Xqlo0tcLyGqL_-AfiscVSs6ns7-TLDWkurlEeHoSNurRIkjt_bXsNLczsV9nysovCLHoPyPhc4oDbyGoFLCDlSfw1bVdEtYt-0000__y30000)

### 2.3. Nhiệm vụ của từng lớp

#### Boundary
- **SelectFunctionForm**: Giao diện cho phép **Commissioned Employee** chọn chức năng Tạo, Cập nhật hoặc Xóa đơn hàng.
- **CreateForm**: Giao diện nhập thông tin cho chức năng Tạo đơn hàng.
- **UpdateForm**: Giao diện nhập mã đơn hàng và chỉnh sửa thông tin cho chức năng Cập nhật đơn hàng.
- **ProjectManagementDatabase**: Cơ sở dữ liệu lưu trữ thông tin dự án và đơn hàng.

#### Control
- **SelectFunctionController**: Nhận yêu cầu từ `SelectFunctionForm` và chuyển đến các bộ điều khiển chức năng tương ứng.
- **CreateController**: Xử lý yêu cầu tạo mới đơn hàng và lưu đơn hàng vào `ProjectManagementDatabase`.
- **UpdateController**: Xử lý yêu cầu cập nhật thông tin đơn hàng và lưu thay đổi vào `ProjectManagementDatabase`.
- **DeleteController**: Xử lý yêu cầu xóa đơn hàng từ `ProjectManagementDatabase`.

#### Entity
- **PurchaseOrder**: Lớp lưu trữ thông tin đơn hàng mua, bao gồm mã đơn hàng, thông tin khách hàng, sản phẩm, và trạng thái.
- **Employee**: Lớp lưu trữ thông tin nhân viên, chỉ cho phép nhân viên xem và chỉnh sửa đơn hàng của chính họ.

### 2.4. Các thuộc tính và quan hệ của lớp phân tích

#### Lớp `PurchaseOrder`
- **Thuộc tính**:
  - `id`: Mã định danh đơn hàng.
  - `customerContact`: Liên hệ khách hàng.
  - `billingAddress`: Địa chỉ thanh toán của khách hàng.
  - `productList`: Danh sách sản phẩm mua.
  - `date`: Ngày đặt hàng.
  - `status`: Trạng thái đơn hàng (đang xử lý, hoàn thành, hủy, v.v.).

- **Quan hệ**:
  - Liên kết với `Employee`: Mỗi đơn hàng gắn với một nhân viên.
  - Liên kết với các lớp Control (`CreateController`, `UpdateController`, `DeleteController`): Được quản lý bởi các bộ điều khiển này.

#### Lớp `Employee`
- **Thuộc tính**:
  - `employeeId`: Mã định danh nhân viên.
  - `name`: Tên nhân viên.
  - `commissioned`: Trạng thái hoa hồng của nhân viên.

#### Lớp `SelectFunctionForm`
- **Quan hệ**:
  - Tương tác với `SelectFunctionController` để chọn chức năng.

#### Lớp `CreateForm`, `UpdateForm`
- **Quan hệ**:
  - Gửi và nhận dữ liệu từ `CreateController`, `UpdateController` để tạo và cập nhật đơn hàng.

#### Lớp `ProjectManagementDatabase`
- **Quan hệ**:
  - Lưu trữ và cung cấp thông tin dự án và đơn hàng cho các lớp Control.
## 2.5. Biểu đồ lớp   
![Class](https://www.planttext.com/api/plantuml/png/Z5NBJXin5DtxAwniMb11PJihQ08I4gYe2B5sx9kCApz6zdLHXFYoBlYa_a8zataoTa8saUxZ-9phUpp__hvVUcGEWrRa2rt1HXgWM0BzOOCHpEqeLynxyAJvfu-WWEDDC1obDJVMQVfAQFFpazJN4_96sgQb0uOmAGQ3u1w2uoNpyDC9SBTcOyTDJvL8DksBHIpT1xKLShCx2FNWxEz8xPuPjWKTKLOCsJfM3zpHEfXWzFWEq4duaycAA1fdkNZoP9XBQz1PTN2MROq2rxCgcH4A7e_CDT78cqI2rNYqYRxG9B9zgqPieYyzXL5goGo7s28ImxasAF7Zdasm-dEaw0I6U6CQNCs5SMoZQwcKDDih8HnutmOhPqNWU2TzLrPhxE-TOV23mcjTARk3OJ6W3Tns9nkcksPkjPRUnqk1Bhi5d33tdTvVe5XzVRwKbQThm1S0qsccBn9BwYDr1LG7XR9IaakKSHm9moqkpiyl5lJiBBz1nToD8nCE0BCDAlBE71bo09YjKl71fTyE69Ha-UyFI1DCB_Tng0JLzBuVXvePeSXOWCpun-uQvdHnu5Kgqk_HJC3di78Fs4p4v-0oGlCjDUptFUp4rArAJwRXMDwxiA3H7vRBA5iyHuyGSWb6rD-g_m000F__0m00)
## 3. Phân tích ca sử dụng Login
### 3.1. Lớp phân tích:
- **Boundary**: `LoginForm`, `ProjectManagementDatabase`
- **Control**: `LoginController`
- **Entity**: `User`
### 3.2. Biểu đồ Sequence:
![Sequence](https://www.planttext.com/api/plantuml/png/j5D1JiCm4Bpx5Vi08kwHWYf1aIe1gbJ1VMjlKYF7hjOELT_6WIVn1JPnIYBH7CcbgJqpExix-VxyMiM4dBhMAOKw1ORNIApseVC6-GnFeR7-CN2hTF29Wyidz_cF4oZvPDCvqmmct6Cas79u9vsUqMD3hK0UnXkbgYfBz1XDCK9LgPuCnTrK3KfO-oI77bi2z0QE6ECfi54JvaAOp0XjHm9UOCs0mbtqA2flwAmqGw2PJDyXkYW3SYdVm8iKkDsEub0ga6TPhxZgTAnXWuVOwNuKTUS6fJzcXJ-Cg1n7D-5lu4HE1sctbGCfhCX9nOt_-0-VDLf7Pj7ZV7sxGpW1CKkYBiv-QPVjZJs9eVQO80LWIf8veMZqcfnaomo1MSigTwdVXuJ51_bbsnmIX3hdRbFFHbAg8YlR22uq3HcmleTq_Zf816V0OkPHBfaY3TxGEUc8gP29yLaDCHCdQYLl_UVp0m00__y30000)

## 3.3. Nhiệm vụ của từng lớp
### Boundary
- **User Interface Class**: `LoginForm` – Cung cấp giao diện cho người dùng để nhập thông tin đăng nhập (tên đăng nhập và mật khẩu) và nhận kết quả xác thực.
- **System Interface Class**: `ProjectManagementDatabase` – Tương tác với cơ sở dữ liệu để truy cập thông tin người dùng, phục vụ cho quá trình xác thực.
### Control
- **LoginController**: Chịu trách nhiệm điều phối quá trình đăng nhập. Khi nhận được thông tin đăng nhập từ `LoginForm`, `LoginController` sẽ gọi `ProjectManagementDatabase` để truy vấn thông tin và xác thực qua User trước khi trả kết quả.
### Entity
- **User**: Đại diện cho thông tin người dùng trong hệ thống, bao gồm tên đăng nhập, mật khẩu và các thuộc tính khác như vai trò. `User` xác thực thông tin được gửi đến từ `LoginController`.
## 3.4. Một số thuộc tính và quan hệ của lớp phân tích
### Lớp `User`
- **Thuộc tính**:
  - `username`: Tên đăng nhập của người dùng, kiểu chuỗi (string).
  - `password`: Mật khẩu của người dùng, kiểu chuỗi (đã mã hóa).
  - `role`: ai trò của người dùng, kiểu int (ví dụ: 1 : nhân viên, 2: quản trị viên).
- **Quan hệ**:
  - **Liên kết với `LoginController `**: để xác thực thông tin đăng nhập.
### Lớp `LoginForm`
- **Quan hệ**:
  - **Liên kết với `LoginController`**: `LoginForm` gửi thông tin đăng nhập đến `LoginController` khi người dùng nhấn nút xác nhận.
### Lớp `LoginController`
- **Quan hệ**:
  - **Liên kết với `LoginForm `**: để nhận thông tin đăng nhập và trả kết quả.
  - **Liên kết với `ProjectManagementDatabase`**: để truy vấn thông tin người dùng..

### Lớp `ProjectManagementDatabase`
- **Quan hệ**:
  - **Liên kết với `LoginController`**: `ProjectManagementDatabase` để cung cấp thông tin xác thực người dùng khi được yêu cầu.
## 3.5. Biểu đồ lớp :
![Class]( https://www.planttext.com/api/plantuml/png/T55BQiCm4Dth5CAR9eM4vWQ1bAvIA2qzm4GUx2dw6Cs8K4fFbaMEr2jK5ewJ6ApDyFJUcz4R_PtEMnQ8afnLobXWrllGa7y9qUaVfSkfYJiBtuNuC17HBvO3nUdWI0gJxtxlUko2bnYinJXsWYGjUY43Wf-CyTRp5iCN6da53mswh7e6WGCmZku6PMhgySYd33mu762N1SSGwm7cfs1lVD3lQ44eU6wfOtqaQRLBLgYpP4W8MLrtK6qglLgLCWcbfY5lfBDPr7pAY_rflNwiIh3P2Lco6IHgYxxkV-yV003__mC0)

## 4. Phân tích ca sử dụng Create Administrative Report <br>
   ### 4.1. Các lớp phân tích: <br>
     Boundary: AdministrativeReportForm, ProjectManagementDatabase 
     Control: AdministrativeReportController 
     Entity: Report 
   ### 4.2. Nhiệm vụ của từng lớp phân tích: <br>
     AdministrativeReportForm: Hiển thị UI và các trường input để người dùng nhập 
     ProjectManagementDatabase: Truy xuất thông tin các employee và report
     AdministrativeReportController: Xử lí các Administrative Report 
     Report: Đại diện cho report, chứa các thông tin và phương thức liên quan đến report
   ### 4.3. <br> ![Class Diagram](https://www.planttext.com/api/plantuml/png/Z99DJiGm38NtEONL5I3DWXiCwi0EX10NC9sdAf2VoZ4ZZH0dOy6Hk09fKggYOKPa4_d5p_PdvUlZSvsKHL-zCoQzs40I4unHgmxK2bX1LrjlWqqgh7O7Ui0GHMb5hUEKQ6Ev5_R6T2NydLnpRw9uUZEKFLA4n_q0Ad7flXcxb11XkmZyuE8Uk6EFB13rq5gm5QiGosVdHERzLEis1fNe7AGCGDGLflfOxAEOU3TBDOj31pTBSuk9lRBe8SKIuf1XBdClyHcTtdBW7XvXzF8J9qn3Pj3hXR5ES7IppML3grMvJg_WpnAB3VqKkcWcqFyQydKKoUIppYl9N-mR003__mC0)
   ### 4.4. ![Squence Diagram](https://www.planttext.com/api/plantuml/png/f5DBJiCm4Dtx5BCi4Rr05wYq0NK15G9nW6aoQWs97Pn9KTOiEGKh9AHAhCc2HINkaHDm1PnFLJS2jH8Rnv7VctdpdlrTV0vJHiDP70cHtai5HgSa14kE2CQ6a0bEmrWgcR91bak2QqgqOUZ33Jraf082N-BSO2m41gmDtAPan4ndAaIJTzWD-LoR6325wYi2hTZew5VWk3cBo5JmxPyWPINchHOH8kCCKu8he-yeu4jKEAVOWlpDYQNx8o4gRT0_gJl30AQBycEL0ClrMmR1Ohs2sVf5Gs0NKKCirD4mWA2sf6dRCur68vcCnADgVBci77E4EcnRon_P6dFYipY9T4uqnPXw3j5Aj91-joivS16I2z-jtsOp0CzJzEXvFSuJEeOwOsk5tP8AsurJqr7GEhe9kQl4xTv2NGLRPoUoB9uKyA8idXrJ7RfZKZUMYw_tR5yIAIvtSpZ4VyUVYcyD-jVeXqqpAOlNVE_5GlkIedQW_QDig_ybGWnjrFPT_m000F__0m00)
## 5. Phân tích ca sử dụng Maintain Employee Information <br>
   ### 5.1. Các lớp phân tích: <br>
     Boundary: SelectFunctionForm, AddEmployeeForm, UpdateEmployeeForm, ProjectManagementDatabase 
     Control: SelectFunctionController, AddEmployeeController, UpdateEmployeeController, DeleteEmployeeController
     Entity: Employee
   ### 5.2. Nhiệm vụ của từng lớp phân tích: <br>
     SelectFunctionForm: Hiển thị UI cho người dùng chọn chức năng thêm sửa hoặc xoá employee
     ProjectManagementDatabase: Truy xuất thông tin các employee
     AddEmployeeForm: Form để thêm employee mới
     UpdateEmployeeForm: Form để cập nhật employee được chỉ định
     SelectFunctionController: Điều hướng user đến hành động tương ứng
     AddEmployeeController: Controller xử lí việc thêm employee
     UpdateEmployeeController: Controller xử lí việc cập nhật employee
     DeleteEmployeeController: Controller xử lí việc xoá employee
     Employee: Đại diện cho employee, chứa các thuộc tính và phương thức liên quan đến employee
   ### 5.3. ![Class Diagram](https://www.planttext.com/api/plantuml/png/p9HBJiCm48RtFeNL5I1rmPOLY52f4eMAmW46UqWCVaJs114XJiQ28t45t3pQf4sWIo95IVpFv_6CV-Vxy-iy47WgZ6Oil2ZBlGl862dIo1UWBCMRNvbSknAHp-sJymP8ESkd_59323nHa7emZ8dgSuKQ1SqAAzPHinZEtncFbrGXrr3UvjLuenyTiu-Ml92oJRJ1fjo2mUe56-s-pEi10qehcqRCOmZLK712WLwXABoYygOmZ-XhWS1AyF8UtXAKHPMxHXnbw7V6yinPxD2PAxmkxu3gn04q-FAiUXVE61L2H3VoElfQ6KNRqXvo6TM1wjgYvd8TFDZ2IsV9EwtHDuqCFNcaWtiKRBM8rFFG4agHeNX9KAjNzEK2ANEoEsL_vNkp5Zsv2yOfyHTGzkHcHGAiG9qCIIbQz37LJ5dGxRAx-JOUtMliltRHdoQgRPOFRXJVbh_qxZcwOW4MKZHeAG62HmZOz3j5wk_Im3cTd4xuT5eznYp8TWzfXnbq7nkmVeSPizVk-Zh-wT2ZHRFXat0GEkhuW-XHsnz4i_5jRFcJoTRgZ9sZbV7d_GC00F__0m00)
   ### 5.4. ![Sequence Diagram](https://www.planttext.com/api/plantuml/png/d5PBZgCm5Dnp2YkhH4fV88jH8mXI5cWYjJY00w_Jde3DsAPRETiivaXpXNbs-DWq92WBBu1wzJvLjldtv--hqbJgfYg3G5qO9r8e20BDT0aafOnhN6HVrQMu0f03VnUoefe9Jbx86_nkWET0OaRFabP1G7Cj95aTwLMAiYHXKJ7Eb9OKNwy8LUGO1ZNcOpchATV8K4AkauRdXZ91RWDwIv8xg4XmRTX1th2HXmsBegksemltoHp4vmhtFbTM5rJ3c2uRqVaedp4RCSROoHms7c6FKlp2jbFAwHagu3gccfwe0Zl7DFR0lKBuRPy6mJ4aBp_C87UaOAekwVLdRKVS3d6zCLgnJwpSZXkN2JY6Ew8-n1SH5gt86eUrRLlSjkLlWWAyO3URibgH5SRrHQqcSw5o7RoloW_xbiXvY90cCZIeRj_ZUXGH3H761BYw9Xcl6qsWcneRVEqocA2sEPj6DQUApOHDPK93xGWTxBRk8esKct4cvo521jiTwZpDuEXdl83BmFVfZkGIp5iENuCh6CTjZZlLJMd2sYosJWKQzst-0Va5TMQV8Ayfw0zHh5SroozDZNguLJMUx-SAcqve96WriuNs4pt4_bIYINFT_FYClyQHYooMBREOEHYoMOlvdMM3ix8fPo5wYZSpGiqC_b1inXcSXmWf1ktEe2VZfpnbSqhGZNGk0d4oPzDOtJQ5Ew-7UomRDBPnj-uUxB758zcIsIrtTq1FcNkwAy-vjnFq6UUE8nSvzw4F3RQlCxhlGuStDaCllCjipeVU5Z5tNFoa3-FbFeo7KoON_9tXnMsB7Lal7aIovD-mKtLRv1auu4yD98pJiZir7PUuFSwCQR6LR9Mlm0lyIViF003__mC0)
## 6. Phân tích ca sử dụng Run Payroll <br>
   ### 6.1. Các lớp phân tích: <br>
     Boundary: PayrollUI, ProjectManagementDatabase
     Control: PayrollController
     Entity: Printer, BankSystem, Timecard, Employee
   ### 6.2. Nhiệm vụ của từng lớp phân tích: <br>
     PayrollUI: Hiển thị UI payroll
     PayrollController: Controller xử lí cho các phương thức liên quan đến payroll
     Printer: Đại diện cho printer, dùng để in bảng lương
     ProjectManagementDatabase: Truy xuất thông tin các employee
     BankSystem: Đại diện cho bank system, chứa các thuộc tính và các phương thức liên quan đến bank system
     Timecard: Đại diện cho timecard, chứa các thuộc tính và các phương thức liên quan đến timecard
     Employee: Đại diện cho employee, chứa các thuộc tính và các phương thức liên quan đến employee
   ### 6.3. <br> ![Class Diagram](https://www.planttext.com/api/plantuml/png/X5DBJiCm4Dtx55PN1QaBRj10MR0eL7p4UkfC6rD_el5u4I5Ene8ZSGKSuxQXfP2DP-Qzf_dcy_rZ6XY8epL2X8rsadn08LYpGNaVdLn0HzuOEP5N1aAGCmrh0Yk4ocw1dsxagv3fgtLe3NGbV8-j9nwVIIdU3XHNtd7_8XKbHLUWAhAtm5gDppAoHeS4Z0bM3QfD2Il25Bm4jtaaS04KQ-yA5j3LloCAZ8ec2H_007Kfkgki5pnqWT6MahXNhv3ctk4FveAqurtbRUyDYXlG_0igdeE3DLfqF0E69GGimZLoPSorROtl48VARImJ9nABUpFBhWEBsGYvXsmkqv1MchFTGjTdcoCtllv6KskLKZuwlersYRHFzQWjAg3wCDMtiF6HmhEd3TQ3lYAf9hLnHtKPmf7Ezr1b-uIzRdyceukHd4poStG9ulWs1lJzUlxcbUNyHpgn6d5wQLlv-MYt7x5Rr03SJlHNyCViX13JTAdfx_i2003__mC0)
   ### 6.4. ![Seuence Diagram](https://www.planttext.com/api/plantuml/png/T5JBZjim3BphAtZS7l83EHIxTb9W3m6Cs8kUkJBNKIrBhaItyBVrq4_gBvIA7tNTRO0SDEPmPYZQltxyV8oCWOVEAXLRuo3uI4gnOKjm7HmKE0PlBHoWfAy3EKrmCjW4x9H2pJv0EKQcBhTUju0Hj7hrWwinZ0ltvJdXByzAUyS2B7W-7Is5zBp8DyJWlv3c2pfig2F79sHynKYfy9GfGGoFSEvwwqUwe-VBWbQc8usXJcYLBsWHZEDPwRg06Rfsif_mh5HAm-6ZM3r25KpJI7sG6VJp31u-1LFZ21BQOcJuxeECh071FgHXc6_8b89AOcbJvCT4dzC-3UmxPACVDhKIkiXJxIaxGaFyPEqIQbicaK_Psf9u20wi4GV-RHr2L3Lj2TRx7jx4gg2tjKg1_2R9y-KkcMuZZHWkn3TVtmlMFZBLT3vVTkBlS3RgCskIgV99vkQ743_Bn6Yd8NUKpbM-qzWJDW8pfLWf6gqUh3mgqSe2oUpk4dQV3ao43erDLzWRtHw6_bwvwNOzGfzsHOZwHhgTU_rbMJPePLqN3_rCcEYpwPtncKXMLlbVPxK9ilLIt_jeU6yinGmaNTBMLW5TJ6szsnYSAhFo295S_V-wrO-i_89bvQB2VpYInMkAyVqqCrkaLFfFwkdbgKtiBOxpvbybJs2HtmuYtvxabL6Fqa8-Gxy1003__mC0)




