package onegroup.onekids_excel_v3.dto.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseDTO<T> {
    private Long id;

    //id người tạo, lấy tự động
    private Long idCreated;

    //tên người tạo, người dùng tự thêm vào
    private String createdBy;

    //thời gian tạo, lấy tự động
    private LocalDateTime createdDate;

    //id người sửa, lấy tự động
    private Long idModified;

    //tên người tạo, người code tự thêm nếu muốn
    private T lastModifieBy;

    //thời gian sửa, lấy tự động, thời gian sửa sẽ trùng với thời gian tạo trong trường hợp tạo
    private LocalDateTime lastModifieDate;

    //1 là hiển thị ra, 0 là ko hiển thị ra
    private boolean delActive = true;
}
