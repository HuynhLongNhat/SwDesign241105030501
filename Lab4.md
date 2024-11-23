### 1. Create Administrative Report
**Brief Description** <br>
Trường hợp sử dụng này cho phép Payroll Administrator tạo một báo cáo "Tổng số giờ làm việc" hoặc "Trả lương đến nay". <br>
**Flow of Events** <br>
**Basic Flow** <br>
Trường hợp sử dụng bắt đầu khi Payroll Administrator yêu cầu hệ thống tạo báo cáo quản trị. <br>
1. Hệ thống yêu cầu Payroll Administrator chỉ định các tiêu chí báo cáo sau: <br>
Loại báo cáo (tổng số giờ làm việc hoặc trả lương đến nay), <br>
Ngày bắt đầu và ngày kết thúc cho báo cáo, <br>
Tên nhân viên. <br>
2. Khi Payroll Administrator cung cấp thông tin được yêu cầu, hệ thống sẽ cung cấp cho Payroll Administrator một báo cáo đáp ứng các tiêu chí báo cáo. <br>
3. Payroll Administrator sau đó có thể yêu cầu hệ thống lưu báo cáo. Tại thời điểm đó, hệ thống yêu cầu Payroll Administrator cung cấp tên và vị trí để lưu báo cáo. <br>
4. Khi Payroll Administrator cung cấp thông tin được yêu cầu và xác nhận quyết định lưu báo cáo, hệ thống sẽ lưu báo cáo vào tên và vị trí đã chỉ định. <br>
5. Nếu Payroll Administrator không chọn lưu báo cáo, báo cáo sẽ bị hủy. <br>

**Alternative Flows** <br>
&nbsp; &nbsp; **Requested Information Unavailable** <br>
&nbsp; &nbsp; Nếu trong Luồng cơ bản, thông tin được yêu cầu không có sẵn, hệ thống sẽ hiển thị thông báo lỗi. Payroll Administrator có thể chọn quay lại đầu Luồng cơ bản hoặc hủy thao tác, tại thời điểm đó trường hợp sử dụng kết thúc. <br>
&nbsp; &nbsp; **Invalid Format or Insufficient Information** <br>
&nbsp; &nbsp; Nếu trong Luồng cơ bản, Payroll Administrator chưa chỉ định đủ thông tin để tạo báo cáo đã chọn, hệ thống sẽ nhắc tác nhân về thông tin bị thiếu. Payroll Administrator có thể nhập thông tin bị thiếu hoặc chọn hủy thao tác, tại thời điểm đó trường hợp sử dụng kết thúc. <br>
**Special Requirements** <br>
Không có. <br>
**Pre-Conditions** <br>
Payroll Administrator phải đăng nhập vào hệ thống để trường hợp sử dụng này bắt đầu. <br>
**Post-Conditions** <br>
Trạng thái hệ thống không thay đổi bởi trường hợp sử dụng này. <br>
**Extension Points** <br>
Không có. <br>

### 2. Login
**Brief Description** <br>
Trường hợp sử dụng này mô tả cách một người dùng đăng nhập vào hệ thống Payroll. <br>
**Flow of Events** <br>
**Basic Flow** <br>
1. Trường hợp sử dụng bắt đầu khi actor muốn đăng nhập vào hệ thống Payroll.
2. Actor nhập tên và mật khẩu.
3. Hệ thống xác thực tên và mật khẩu đã nhập và đăng nhập actor vào hệ thống.
   
**Alternative Flows** <br>
&nbsp; &nbsp; Invalid Name/Password <br>
&nbsp; &nbsp; Nếu trong Luồng cơ bản, actor nhập tên và/hoặc mật khẩu không hợp lệ, hệ thống sẽ hiển thị thông báo lỗi. Actor có thể chọn quay lại đầu Luồng cơ bản hoặc hủy đăng nhập, lúc đó trường hợp sử dụng sẽ kết thúc. <br>
**Special Requirements** <br>
Không có. <br>
**Pre-Conditions** <br>
Hệ thống đang ở trạng thái đăng nhập và hiển thị màn hình đăng nhập. <br>
**Post-Conditions** <br>
Nếu trường hợp sử dụng thành công, actor sẽ được đăng nhập vào hệ thống. Nếu không, trạng thái hệ thống không thay đổi. <br>
**Extension Points** <br>
Không có. <br>

### 3. Run Payroll
**Brief Description** <br>
Trường hợp sử dụng này mô tả cách chạy bảng lương mỗi Thứ Sáu và ngày làm việc cuối cùng của tháng. <br>
**Flow of Events** <br>
**Basic Flow** <br>
1. Trường hợp sử dụng bắt đầu khi đến thời gian chạy bảng lương. Bảng lương được chạy tự động vào mỗi Thứ Sáu và ngày làm việc cuối cùng của tháng. <br>
2. Hệ thống truy xuất tất cả nhân viên cần được trả lương vào ngày hiện tại. <br>
3. Hệ thống tính toán tiền lương sử dụng các bảng chấm công, đơn đặt hàng, thông tin nhân viên (ví dụ: lương, phúc lợi, v.v.) và tất cả các khoản khấu trừ hợp pháp. <br>
4. Nếu phương thức nhận lương là qua thư hoặc nhận trực tiếp, hệ thống sẽ in séc lương. <br>
5. Nếu phương thức nhận lương là chuyển khoản trực tiếp, hệ thống sẽ tạo giao dịch ngân hàng và gửi nó đến hệ thống ngân hàng để xử lý. <br>
6. Trường hợp sử dụng kết thúc khi tất cả nhân viên nhận lương cho ngày mong muốn đã được xử lý. <br>
   
**Alternative Flows** <br>
&nbsp; &nbsp; **Bank System Unavailable** <br>
&nbsp; &nbsp; Nếu hệ thống ngân hàng không hoạt động, hệ thống sẽ cố gắng gửi lại giao dịch ngân hàng sau một khoảng thời gian nhất định. Hệ thống sẽ tiếp tục cố gắng gửi lại cho đến khi hệ thống ngân hàng hoạt động trở lại. <br>
&nbsp; &nbsp; **Deleted Employees** <br>
&nbsp; &nbsp; Sau khi bảng lương của một nhân viên được xử lý, nếu nhân viên đó đã được đánh dấu để xóa (xem trường hợp sử dụng "Maintain Employee"), hệ thống sẽ xóa nhân viên đó. <br>
**Special Requirements** <br>
Không có. <br>
**Pre-Conditions** <br>
Không có. <br>
**Post-Conditions** <br>
Các khoản thanh toán cho từng nhân viên đủ điều kiện được trả vào ngày hiện tại đã được xử lý. <br>
**Extension Points** <br>
Không có. <br>

### 4. Maintain Employee Information
**Brief Description** <br>
Trường hợp sử dụng này cho phép Payroll Administrator quản lý thông tin nhân viên. Điều này bao gồm thêm, thay đổi hoặc xóa thông tin nhân viên khỏi hệ thống. <br>
**Flow of Events** <br>
**Basic Flow** <br>
1. Hệ thống yêu cầu Payroll Administrator chỉ định chức năng mà họ muốn thực hiện (Thêm nhân viên, Cập nhật nhân viên hoặc Xóa nhân viên). <br>
2. Sau khi Payroll Administrator cung cấp thông tin yêu cầu, một trong các luồng phụ sau sẽ được thực thi: <br>
Nếu Payroll Administrator chọn "Add an Employee", luồng phụ "Add an Employee" sẽ được thực thi. <br>
Nếu Payroll Administrator chọn "Update an Employee", luồng phụ "Update an Employee" sẽ được thực thi. <br>
Nếu Payroll Administrator chọn "Delete an Employee", luồng phụ "Delete an Employee" sẽ được thực thi. <br>

**Add an Employee** <br>
1. Hệ thống yêu cầu Payroll Administrator nhập thông tin nhân viên, bao gồm: <br>
- Tên <br>
- Loại nhân viên (lương theo giờ, hưởng lương cơ bản, hoặc hưởng hoa hồng) <br>
- Địa chỉ gửi thư <br>
- Số an sinh xã hội <br>
- Các khoản khấu trừ thuế tiêu chuẩn <br>
- Các khoản khấu trừ khác (401k, bảo hiểm y tế) <br>
- Số điện thoại <br>
- Mức lương theo giờ (cho nhân viên theo giờ) <br>
- Mức lương cơ bản (cho nhân viên hưởng lương cơ bản và hưởng hoa hồng) <br>
- Tỷ lệ hoa hồng (cho nhân viên hưởng hoa hồng) <br>
- Giới hạn giờ làm việc (một số nhân viên có thể không được làm thêm giờ). <br>
2. Sau khi Payroll Administrator cung cấp đầy đủ thông tin, hệ thống sẽ tạo một mã nhân viên duy nhất và gán nó cho nhân viên. Phương thức nhận lương mặc định sẽ được đặt là "nhận trực tiếp". Nhân viên được thêm vào hệ thống. <br>
3. Hệ thống cung cấp mã nhân viên mới cho Payroll Administrator. <br>

**Update an Employee** <br>
1. Hệ thống yêu cầu Payroll Administrator nhập mã nhân viên. <br>
2. Payroll Administrator nhập mã nhân viên. Hệ thống hiển thị thông tin nhân viên. <br>
3. Payroll Administrator thực hiện các thay đổi mong muốn đối với thông tin nhân viên. Điều này bao gồm bất kỳ thông tin nào được chỉ định trong luồng phụ "Add an Employee". <br>
4. Sau khi Payroll Administrator cập nhật thông tin cần thiết, hệ thống sẽ cập nhật hồ sơ nhân viên với thông tin đã thay đổi. <br>

**Delete an Employee** <br>
1. Hệ thống yêu cầu Payroll Administrator chỉ định mã nhân viên. <br>
2. Payroll Administrator nhập mã nhân viên. Hệ thống hiển thị thông tin nhân viên. <br>
3. Hệ thống yêu cầu Payroll Administrator xác nhận việc xóa nhân viên. <br>
4. Payroll Administrator xác nhận việc xóa. <br>
5. Hệ thống đánh dấu hồ sơ nhân viên để xóa. Lần tiếp theo khi bảng lương được chạy, hệ thống sẽ tạo một phiếu lương cuối cùng cho nhân viên đã bị xóa và loại bỏ nhân viên đó khỏi hệ thống. <br>
   
**Alternative Flows** <br>
&nbsp; &nbsp; **Employee Not Found** <br>
&nbsp; &nbsp; Trong các luồng phụ "Update an Employee" hoặc "Delete an Employee", nếu nhân viên với mã đã chỉ định không tồn tại, hệ thống sẽ hiển thị thông báo lỗi. Payroll Administrator có thể nhập một mã khác hoặc hủy thao tác, lúc này trường hợp sử dụng kết thúc. <br>
&nbsp; &nbsp; **Delete Cancelled** <br>
&nbsp; &nbsp; Trong luồng phụ "Delete an Employee", nếu Payroll Administrator quyết định không xóa nhân viên, thao tác sẽ bị hủy và luồng cơ bản sẽ được khởi động lại từ đầu. <br>
**Special Requirements** <br>
Không có. <br>
**Pre-Conditions** <br>
Payroll Administrator phải đăng nhập vào hệ thống trước khi trường hợp sử dụng này bắt đầu. <br>
**Post-Conditions** <br>
Nếu trường hợp sử dụng thành công, thông tin nhân viên đã được thêm, cập nhật hoặc xóa khỏi hệ thống. Nếu không, trạng thái của hệ thống không thay đổi. <br>
**Extension Points** <br>
Không có. <br>

### 5. Select Payment Method 
**Brief Description** <br>
Use case này cho phép Employee lựa chọn một phương thức thanh toán. Phương thức thanh toán sẽ quyết định cách mà Employee được trả lương. Employee có thể chọn một trong ba cách: nhận trực tiếp , nhận qua thư , hoặc gửi trực tiếp vào tài khoản ngân hàng. <br>
**Flow of Events** <br>
**Basic Flow**  <br>
Use case này bắt đầu khi Employee muốn chọn một phương thức thanh toán. <br>
1. Hệ thống yêu cầu Employee chỉ định phương thức thanh toán mong muốn (một trong các lựa chọn: "pick up", "mail", hoặc "direct deposit").  <br>
2. Employee chọn phương thức thanh toán mong muốn.  <br>
3.  
&nbsp; &nbsp;- Nếu Employee chọn phương thức "pick-up", không cần thêm thông tin nào.  <br>
&nbsp; &nbsp;- Nếu Employee chọn phương thức "mail", hệ thống yêu cầu Employee cung cấp địa chỉ nhận paycheck qua thư.  <br>
&nbsp; &nbsp;- Nếu Employee chọn phương thức "direct deposit", hệ thống yêu cầu Employee cung cấp tên ngân hàng và số tài khoản.  
4. Sau khi Employee cung cấp thông tin được yêu cầu, hệ thống cập nhật thông tin của Employee để phản ánh phương thức thanh toán đã chọn. <br>
  
**Alternative Flows** <br>
&nbsp; &nbsp; **Employee Not Found**  <br>
&nbsp; &nbsp; Nếu trong Basic Flow, hệ thống không tìm thấy thông tin của Employee, hệ thống sẽ hiển thị thông báo lỗi và kết thúc use case. <br>
**Special Requirements** <br>
Không có. <br>
**Pre-Conditions** <br>
Employee phải đăng nhập vào hệ thống trước khi use case này bắt đầu. <br>
**Post-Conditions** <br>
- Nếu use case thành công, phương thức thanh toán của Employee được cập nhật trong hệ thống.  <br>
- Nếu không, trạng thái hệ thống không thay đổi.  <br>

**Extension Points**  <br>
Không có. <br>

### 6. Maintain Timecard
**Brief Description**  <br>
Use case này cho phép Employee cập nhật và gửi thông tin bảng chấm công. Employee giờ công và Employee hưởng lương cần gửi bảng chấm công hàng tuần để ghi nhận số giờ làm việc mỗi tuần và các dự án mà giờ làm việc được tính. Một Employee chỉ có thể thực hiện thay đổi đối với bảng chấm công cho kỳ trả lương hiện tại và trước khi bảng chấm công đã được gửi. <br>
**Flow of Events** <br>
**Basic Flow**  <br>
Use case này bắt đầu khi Employee muốn nhập giờ làm việc của họ vào bảng chấm công hiện tại. <br>
1. Hệ thống truy xuất và hiển thị bảng chấm công hiện tại của Employee. Nếu bảng chấm công không tồn tại cho kỳ trả lương hiện tại của Employee, hệ thống sẽ tạo một bảng mới. Ngày bắt đầu và ngày kết thúc của bảng được hệ thống thiết lập và không thể thay đổi bởi Employee.  <br>
2. Hệ thống truy xuất và hiển thị danh sách các số charge có sẵn từ cơ sở dữ liệu Quản lý Dự án.  <br>
3. Employee chọn số charge phù hợp và nhập số giờ làm việc cho bất kỳ ngày nào mong muốn (trong khoảng thời gian của bảng chấm công).  <br>
4. Sau khi Employee nhập xong thông tin, hệ thống lưu lại bảng chấm công.  <br>

**Submit Timecard**  <br>
1. Bất kỳ lúc nào, Employee có thể yêu cầu hệ thống gửi bảng chấm công.  <br>
2. Lúc đó, hệ thống sẽ gán ngày hiện tại vào bảng chấm công làm ngày gửi và thay đổi trạng thái của bảng thành “submitted.” Không có thay đổi nào được phép đối với bảng chấm công sau khi nó đã được gửi.  <br>
3. Hệ thống xác nhận bảng chấm công bằng cách kiểm tra số giờ làm việc được nhập cho từng số charge. Tổng số giờ làm việc được nhập trên tất cả các số charge phải không vượt quá giới hạn tối đa được thiết lập cho Employee (ví dụ: Employee có thể không được phép làm thêm giờ).  <br>
4. Hệ thống trả về tổng số giờ làm việc cho từng số charge trong bảng chấm công.  <br>
5. Hệ thống lưu bảng chấm công.  <br>
6. Hệ thống đặt bảng chấm công ở chế độ chỉ đọc (read-only), và không thay đổi nào khác được phép sau khi bảng đã được gửi.<br>
   
**Alternative Flows**<br>
&nbsp; &nbsp; **Invalid Number of Hours**  <br>
&nbsp; &nbsp; - Nếu trong Basic Flow, một số giờ không hợp lệ được nhập cho một ngày (ví dụ: >24), hoặc số giờ được nhập vượt quá số giờ tối đa được phép cho Employee, hệ thống sẽ hiển thị thông báo lỗi hoặc nhắc Employee nhập một số giờ hợp lệ.  <br>
&nbsp; &nbsp; - Employee phải nhập lại một số giờ hợp lệ, hoặc hủy thao tác, trong trường hợp này use case sẽ kết thúc.  
&nbsp; &nbsp; **Timecard Already Submitted**  <br>
&nbsp; &nbsp; Nếu trong Basic Flow, bảng chấm công hiện tại của Employee đã được gửi, hệ thống sẽ hiển thị thông báo xác nhận và thông báo Employee rằng bảng đã được gửi trước đó, vì vậy không có thay đổi nào có thể được thực hiện. Hệ thống ghi nhận thông báo và kết thúc use case.  <br>
&nbsp; &nbsp; **Project Management Database Not Available**  <br>
&nbsp; &nbsp; Nếu trong Basic Flow, Project Management Database không khả dụng, hệ thống sẽ hiển thị thông báo lỗi cho biết danh sách các số charge có sẵn không khả dụng.  <br>
&nbsp; &nbsp; Employee xác nhận lỗi và có thể chọn tiếp tục (mà không có số charge có thể chọn) hoặc hủy (mọi thay đổi trên bảng chấm công sẽ bị loại bỏ và use case kết thúc).  <br>
&nbsp; &nbsp; **Lưu ý:**  <br>
&nbsp; &nbsp; Nếu không có số charge có thể chọn, Employee có thể thay đổi số giờ làm việc cho một số charge đã được liệt kê trên bảng chấm công, nhưng không thể thêm số giờ cho một số charge chưa có trong danh sách.  <br>
**Special Requirements** <br>
Không có  <br>
**Pre-Conditions** <br>
Employee phải đăng nhập vào hệ thống trước khi use case bắt đầu.  <br>
**Post-Conditions** <br>
- Nếu use case thành công, thông tin bảng chấm công của Employee được lưu vào hệ thống.  <br>
- Ngược lại, trạng thái của hệ thống không thay đổi. <br>
  
**Extension Points**<br>
Không có <br>

### 7. Create Employee Report
**Brief Description** <br>
Use case này cho phép Employee tạo một báo cáo về: "Tổng số giờ làm việc", "Tổng số giờ làm việc cho một dự án", "Nghỉ phép/ốm đau", hoặc "Tổng lương tính đến thời điểm hiện tại". <br>
**Flow of Events** <br>
**Basic Flow** <br>
Use case bắt đầu khi Employee muốn tạo một báo cáo về: "Tổng số giờ làm việc", "Tổng số giờ làm việc cho một dự án", "Nghỉ phép/ốm đau", hoặc "Tổng lương tính đến thời điểm hiện tại". <br>
1. Hệ thống yêu cầu Employee cung cấp các thông tin sau: <br>
&nbsp; &nbsp; - Employee chọn loại báo cáo muốn tạo (Tổng số giờ làm việc, Tổng số giờ làm việc cho một dự án, Nghỉ phép/ốm đau, hoặc Tổng lương tính đến thời điểm hiện tại). <br>
&nbsp; &nbsp; - Employee chọn khoảng thời gian muốn báo cáo. <br>
2. Nếu Employee chọn loại báo cáo "Tổng số giờ làm việc cho một dự án", hệ thống sẽ hiển thị danh sách các dự án có sẵn và yêu cầu Employee chọn một dự án. <br>
3. Sau khi Employee cung cấp đầy đủ thông tin, hệ thống sẽ tạo và hiển thị báo cáo theo yêu cầu. <br>
4. Employee có thể chọn lưu báo cáo lại. Nếu chọn lưu, hệ thống sẽ yêu cầu Employee đặt tên và chọn vị trí lưu. <br>
5. Sau khi Employee xác nhận thông tin lưu, hệ thống sẽ lưu báo cáo vào vị trí đã chọn. <br>
6. Nếu Employee không chọn lưu, báo cáo sẽ bị hủy bỏ. <br>

**Alternative Flows** <br>
&nbsp; &nbsp; **Requested Information Unavailable** <br>
&nbsp; &nbsp; - Nếu Employee không cung cấp đủ thông tin hoặc thông tin cung cấp không hợp lệ, hệ thống sẽ thông báo lỗi và yêu cầu Employee kiểm tra lại. <br>
&nbsp; &nbsp; - Employee có thể chọn quay lại bước nhập liệu hoặc hủy bỏ thao tác. <br>
&nbsp; &nbsp; **Invalid Format or Insufficient Information** <br>
&nbsp; &nbsp; - Nếu trong quá trình thực hiện các bước cơ bản để tạo báo cáo, Employee chưa cung cấp đầy đủ thông tin cần thiết, hệ thống sẽ yêu cầu Employee nhập thêm thông tin còn thiếu. <br>
&nbsp; &nbsp; - Employee có thể chọn nhập thêm thông tin hoặc hủy bỏ việc tạo báo cáo. Khi đó, quá trình tạo báo cáo sẽ kết thúc. <br>
**Special Requirements** <br>
Không có. <br>
**Pre-Conditions** <br>
Employee phải đăng nhập vào hệ thống trước khi bắt đầu tạo báo cáo. <br>
**Post-Conditions** <br>
Việc tạo báo cáo không làm thay đổi trạng thái của hệ thống. <br>
**Extension Points** <br>
Không có. <br>

### 8. Maintain Purchase Order
**Brief Description** <br> 
Use case này cho phép Employee được ủy quyền ghi nhận và quản lý các đơn hàng mua. Điều này bao gồm việc thêm, sửa đổi và xóa các đơn hàng mua. Employee được ủy quyền phải ghi nhận tất cả các đơn hàng mua của mình để nhận được hoa hồng.
**Flow of Events** <br> 
**Basic Flow** <br> 
Use case bắt đầu khi Employee được ủy quyền muốn thêm, sửa đổi hoặc xóa thông tin đơn hàng mua từ hệ thống. <br>
1. Hệ thống yêu cầu Employee được ủy quyền chỉ định chức năng muốn thực hiện: <br> 
&nbsp; &nbsp; - Tạo đơn hàng mua mới. <br> 
&nbsp; &nbsp; - Cập nhật đơn hàng mua. <br>
&nbsp; &nbsp; - Xóa đơn hàng mua. <br> 
2. Sau khi Employee được ủy quyền cung cấp thông tin yêu cầu, một trong các luồng con sau sẽ được thực hiện: <br> 
&nbsp; &nbsp; - **Tạo đơn hàng mua mới**: hệ thống thực hiện luồng con tạo đơn hàng mua mới. <br>  
&nbsp; &nbsp; - **Cập nhật đơn hàng mua**: hệ thống thực hiện luồng con cập nhật đơn hàng mua. <br>  
&nbsp; &nbsp; - **Xóa đơn hàng mua**: hệ thống thực hiện luồng con xóa đơn hàng mua. <br>  
**Sub-flows**  
**Create a Purchase Order** <br> 
1. Hệ thống yêu cầu Employee được ủy quyền nhập thông tin đơn hàng mua, bao gồm: <br>  
&nbsp; &nbsp; - Thông tin liên hệ của khách hàng.  <br>
&nbsp; &nbsp; - Địa chỉ thanh toán của khách hàng.  <br>
&nbsp; &nbsp; - Sản phẩm đã mua.  <br>
&nbsp; &nbsp; - Ngày.  <br>
2. Sau khi Employee được ủy quyền cung cấp đầy đủ thông tin, hệ thống: <br>  
&nbsp; &nbsp; - Tự động tạo và gán một mã đơn hàng duy nhất cho đơn hàng đó.  <br>
&nbsp; &nbsp; - Thêm đơn hàng vào hệ thống của Employee được ủy quyền.  <br>
3. Hệ thống hiển thị mã đơn hàng mới tạo cho Employee được ủy quyền. <br> 

**Update a Purchase Order** <br> 
1. Hệ thống yêu cầu Employee được ủy quyền nhập mã của đơn hàng muốn cập nhật. <br>  
2. Hệ thống tìm kiếm và hiển thị thông tin chi tiết của đơn hàng tương ứng với mã vừa nhập. <br>  
3. Hệ thống kiểm tra: <br>  
&nbsp; &nbsp; - Đơn hàng có thuộc quyền quản lý của Employee được ủy quyền hay không. <br> 
&nbsp; &nbsp; - Đơn hàng có đang ở trạng thái mở (có thể cập nhật) hay không. <br>  
4. Hệ thống hiển thị đầy đủ thông tin đơn hàng để Employee được ủy quyền xem xét. <br>  
5. Employee được ủy quyền thực hiện các thay đổi cần thiết đối với thông tin đơn hàng. <br>  
6. Sau khi Employee hoàn tất sửa đổi, hệ thống cập nhật thông tin của đơn hàng với thay đổi mới nhất. <br>  

**Delete a Purchase Order**  <br>
1. Hệ thống yêu cầu Employee được ủy quyền nhập mã của đơn hàng muốn xóa. <br>  
2. Hệ thống tìm kiếm và hiển thị thông tin chi tiết của đơn hàng tương ứng với mã vừa nhập. <br>  
3. Hệ thống kiểm tra: <br>  
&nbsp; &nbsp; - Đơn hàng có thuộc quyền quản lý của Employee được ủy quyền hay không. <br>  
&nbsp; &nbsp; - Đơn hàng có đang ở trạng thái mở (có thể xóa) hay không. <br>  
4. Hệ thống hiển thị thông tin đơn hàng để Employee được ủy quyền xác nhận lại. <br>  
5. Hệ thống yêu cầu Employee được ủy quyền xác nhận việc xóa đơn hàng.  <br>
6. Sau khi Employee xác nhận, hệ thống xóa vĩnh viễn đơn hàng khỏi hệ thống. <br>  

**Alternative Flows**  
* **Purchase Order Not Found**  <br>
  Nếu hệ thống không tìm thấy đơn hàng có mã số đã nhập, hệ thống hiển thị thông báo lỗi. Employee được ủy quyền có thể nhập lại mã đơn hàng khác hoặc hủy bỏ thao tác.  <br>
* **Invalid Access to a Purchase Order**  <br>
  Nếu Employee được ủy quyền cố gắng truy cập hoặc sửa đổi một đơn hàng không thuộc quyền quản lý của mình, hệ thống hiển thị thông báo lỗi. Employee có thể nhập lại mã đơn hàng khác hoặc hủy thao tác.  <br>
* **Purchase Order is Closed** <br> 
  Nếu Employee được ủy quyền cố gắng cập nhật hoặc xóa một đơn hàng đã được đóng, hệ thống hiển thị thông báo lỗi. Employee có thể nhập mã đơn hàng khác hoặc hủy thao tác.  <br>
* **Delete Cancelled**  <br>
  Nếu trong quá trình xóa đơn hàng, Employee được ủy quyền quyết định không xóa nữa, thao tác xóa bị hủy và hệ thống quay lại bước đầu của luồng cơ bản.  <br>
  
**Special Requirements**  <br>
Không có  <br>
**Pre-Conditions** <br> 
- Employee được ủy quyền phải đăng nhập vào hệ thống trước khi thực hiện use case. <br>
  
**Post-Conditions**  <br>
- Nếu use case thực hiện thành công, thông tin đơn hàng sẽ được thêm, cập nhật hoặc xóa khỏi hệ thống.  <br>
- Nếu không thành công, trạng thái của hệ thống không thay đổi. <br>
  
**Extension Points** <br> 
Không có  <br>