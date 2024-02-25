package Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class SalesPerDay {
    private Date transaction_date;
    private Double total_sales;
}
