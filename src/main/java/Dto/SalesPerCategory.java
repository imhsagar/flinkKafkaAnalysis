package Dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class SalesPerCategory {
    private Date transaction_date;
    private String category;
    private double total_sales;
}
