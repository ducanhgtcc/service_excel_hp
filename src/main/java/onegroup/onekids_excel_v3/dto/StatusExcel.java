package onegroup.onekids_excel_v3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import onegroup.onekids_excel_v3.dto.base.BaseDTO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StatusExcel extends BaseDTO<String> {
    private String idGuid;
    private String status;
    private String fileName;

}
