package Example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vacancy {
    private Integer id;
    private String title;
    private Integer company_id;
    private Integer salary;
    private String description;

}
