package myApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SchedulePageDto {

    private List<ScheduleDto> data;
//    private int currentPage;
//    private int totalPage;
//    private boolean hasNext;
//    private boolean hasPrevious;
}
