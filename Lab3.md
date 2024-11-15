# Tài liệu thiết kế hệ thống Payroll System

## 1. Subsystem context diagrams
BankSystem:  
PayrollController yêu cầu BankSystem thực hiện giao dịch chuyển khoản.  
BankSystemProxy giao tiếp với BankBoundary để gửi yêu cầu chuyển tiền đến hệ thống ngân hàng thực tế.

PrintService:  
PrintController yêu cầu in tài liệu thông qua PrintService.  
PrintServiceProxy giao tiếp với PrinterBoundary để thực hiện in tài liệu.

ProjectManagementDatabase:  
ProjectController yêu cầu lấy thông tin dự án và cập nhật giờ làm việc.  
ProjectManagementProxy giao tiếp với ProjectDatabaseBoundary để truy xuất và cập nhật dữ liệu.

### Biểu đồ ngữ cảnh
![Diagram1](https://www.planttext.com/api/plantuml/png/l5PBRjim5Dpp5Dn50PmSm2YAD3M2Pf72g09qJLFFjXA9LCcdjkxdP5tqIBr2IP6oI4gAYnIjDxRuo9bvmtc2V_tuUQMHAMphYf0pUit4OtxG23NDsutkVX5UCQtfcXsKhAhNKg3z1aM_4ce_2ZwqeD4UlLTCw2se3EgcaWU0su8kQOwg5Bi5PRLi1Pg5cqeoF2VV2Ia5Wjeo3lGseFR0wD5kMb7eZ75kZxzjwutXVXBL2Hu0rqf-FlmrQgZmnRVBovGWv7tbO7lEQHPNsx2A2ME0fuhrTuOoZgKKaNwt5BZhUIBLCTIrAHLC7NtG88fxQIjPmP0TaRfUp-Wxg9ZbqFkoqNGhLT0k6MVXuk9bT8LBschG9Bq3koqIiwHSrdKhIiuGDFrKudxsK6_g2UpGCx_LDhGspM4EwcDfp1w5snPdezrLiqBojeQEV-L_BeoBYCOqRHOzWNjEqnsnU_JccR21P8yO1VoviB76Bk4ZZfwyX-mvkR7EaOLnn18h6DPIwLvBBvlj82-_G8B1PINLdIp6wqq9jX43bI23ciwwB_vXtCFUIPgFBkwHNpvfurknMrDPKwcVFhaQhl4KVZvSRX1w-G0SxvWmxbgSbUbzm_JK17GxnpEm0_Ir5I0hAvqrxZ5u-voxhMrZh0M_-urirTJU1TtRYhkvyPZCwVrlQY8x1Y7HYFrx5KyuuITpIb-YVdWZf8HkNR0w7QjEntkf7g4OpvRhsEj8PsmBoFUsc9btPfVnamCsqo4PPz7Fsvmbn-6Ol3Gt8TFYfoVn5CnnnAxCYyN-TVeD003__mC0)

## 2. Analysis class to design element map

Ánh xạ các lớp phân tích đến các phần tử thiết kế
| **Các lớp phân tích** | **Phần tử thiết kế** |
|---------------------|--------------------|
|Employee            |EmployeeManagementService  |
|Timecard         |TimecardProcessingModule   |
|Paycheck          |PayrollProcessingService |
|PurchaseOrder        |CommissionProcessingModule	   |
|BankSystem     |BankTransactionService |
|ProjectManagement      |ProjectManagementService |
|Document    |PrintService |


## 3. Design element to owning package map
Ánh xạ các phần tử thiết kế vào các gói
| **Phần tử thiết kế** | **Gói** |
|---------------------|--------------------|
|EmployeeManagementService      |EmployeeModule |
|TimecardProcessingModule      |TimecardModule    |
|PayrollProcessingService      |PayrollModule |
|CommissionProcessingModule    |SalesModule   |
|BankTransactionService       |BankingModule |
|ProjectManagementService      |ProjectModule  |
|PrintService    |PrintModule  |
|BankSystem    |InfrastructureLayer  |
|PrinterService     |InfrastructureLayer  |
|ProjectManagementDatabase    |DataAccessLayer  |
|EmployeeDB      |DataAccessLayer  |
|ProjectDB    |DataAccessLayer  |
|TimecardDB    |DataAccessLayer  |
|BankDB    |DataAccessLayer  |


## 4. Design element to owning package map
### Biểu đồ mô tả các layer
![Diagram2](https://www.planttext.com/api/plantuml/png/Z5H1Ri8m4Bpx5HQNdlX0XI98qqEbLge47rZC0YwE4zbEKLJrPJtqIVr2roO1Xn0WbqYxEpixkvFy_VnEhGFZgbmnzi0pN4kDt6sHAwZHM5Q2sC46-MXMbaeASBBG_DNdHdmo2KL9mhyOfqSei9Q_GsqAfPuAxVmRJPmpKhk1JF618ivzinDvMbcQYyhcQ3wbG7jzXEUyL4MD-0QQu3bgr-2YceNCKO1P4J7re_QRVaqAUhSme2q8hxjVq4nzZIT8RiEnfWmSy9dmvFUfoT8-SoVMIke4lGOAnCmlUct0EbC9LncyJkxXyzewpCyreRbZ7rxa4cnGVhINGHLyPBUoj7o9Re-eMyFrxCF7usJueloHLnO9rdLM0CMhFzMT-Qofl7p75iM6-UFfifG044vAe4671SpfM37cikC2u738k7XmwaXI5t6h_-7IX115dbVQV-_qhUsbsxBECe_RFPfW07DxmBvNg5NeJ2CsVTWKzSh_elu1003__mC0)