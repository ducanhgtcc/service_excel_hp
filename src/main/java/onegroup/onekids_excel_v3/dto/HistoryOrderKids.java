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
public class HistoryOrderKids extends BaseDTO<String> {
    private Double collectedMoney;

    private Double cashMoney;

    private Double transferMoney;

    private String parentPay;

    private String noteHistory;

    OrderKidsExcelT01 orderKidsExcelT01;

    OrderKidsExcelT02 orderKidsExcelT02;

    OrderKidsExcelT03 orderKidsExcelT03;

    OrderKidsExcelT04 orderKidsExcelT04;

    OrderKidsExcelT05 orderKidsExcelT05;

    OrderKidsExcelT06 orderKidsExcelT06;

    OrderKidsExcelT07 orderKidsExcelT07;

    OrderKidsExcelT08 orderKidsExcelT08;

    OrderKidsExcelT09 orderKidsExcelT09;

    OrderKidsExcelT10 orderKidsExcelT10;

    OrderKidsExcelT11 orderKidsExcelT11;

    OrderKidsExcelT12 orderKidsExcelT12;

}
