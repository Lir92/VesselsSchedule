package myApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SailedPageDto {

    private List<ScheduleDto> data;
//    private int currentPage;
//    private int totalPage;
//    private boolean hasNext;
//    private boolean hasPrevious;
}
