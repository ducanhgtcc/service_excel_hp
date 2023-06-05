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
public class TotalKidsArrive extends BaseDTO<String> {
    private Long arriveT2t6;

    private Long arriveT7;

    private Long arriveCn;

    private Long absentCpT2t6;

    private Long absentKpT2t6;

    private Long absentCpT7;

    private Long absentKpT7;

    private Long leaveLater;

    private Long month;

}
