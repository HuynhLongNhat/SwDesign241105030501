# THIẾT KẾ CÁC HỆ THỐNG CON TRONG HỆ THỐNG PAYROLL SYSTEM
---
## I. Các hệ thống con chính:
### 1. Employee Management Subsystem
   - Quản lý thông tin nhân viên: thêm, sửa, xóa thông tin nhân viên.  
   - Theo dõi các loại hợp đồng của nhân viên.  

### 2. Timekeeping Subsystem
   - Lưu trữ và xử lý dữ liệu về thời gian làm việc của nhân viên.  
   - Cung cấp chức năng "Maintain Timecard".  

### 3. Payroll Calculation Subsystem 
   - Tính toán lương dựa trên thông tin thời gian làm việc, lương cơ bản, và các khoản phụ cấp.  
   - Hỗ trợ các loại thanh toán khác nhau như tiền mặt, ngân hàng, hoặc séc.  

### 4. Payment Distribution Subsystem
   - Xử lý các phương thức thanh toán và phân phối lương.  
   - Hỗ trợ kiểm tra, quản lý thanh toán lỗi.  

### 5. Report Generation Subsystem
   - Tạo báo cáo cho các giao dịch lương, danh sách nhân viên, và thông tin thời gian làm việc.  
   - Cung cấp báo cáo theo yêu cầu hoặc định kỳ.  

### 6. System Administration Subsystem 
   - Quản lý tài khoản người dùng hệ thống.  
   - Quản lý các cấu hình và thông số hệ thống.  
---

### Biểu đồ hệ thống con (Subsystem Diagram):  
![bIểu đồ](https://www.planttext.com/api/plantuml/png/X9H1Ri8m44NtEOMLLRkW1wXG109K5gs4eAXhOqzJ2yUER8SggZXP5prIhr0xjaCe94JAndxZ-Vxpaz_lduasM9cgu4c9oHxdWD8LhfNa76rgRQ18qLUI8DJkBegIone0lM1X5meG1csgdMvXP1_2iTQeHSVZbiYoWBXdIcbaxkxRrMr9iO4h6sievE7_nh7JS2Q5KPYOtePUSyGw9npFxlZA2jW3b4paVNTp2C6A3hHYmjWtWcVt85BHDwdsji5ILahtAecpc65EAeuDaw9FKKJx1CKZO8CvLdL7pxGiUJq7MX5t_g2OPjnpferYk-g6ceRjKxDIae3M0Uk8MM91EOJrXL9om9qrb58Pz0G2rA0t0UmJ4mw0OA6dEvhYVfpb6N0fotyuDjq54ywgGMaURjWRiTrgK5D2P2MCxeYpQNvdUQN0dxG1OsoiBanhFyRHA3kbzz6PwDAeqQVF8_fmWKnjHGkvYfWkMs17Ts0KhbH4A1Gq0V05RjQsGZVH2sYpxT0m7Ki-ormZQvZGs6VHeLs77XwoqqriWNT68qnSXsjqHtZhb1KIN4gJv9XCG53t1_m3003__mC0)
