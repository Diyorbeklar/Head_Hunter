package Example.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Company {
    private Integer id;
    private String name;
    private Integer city_id;
    private String description;
    private String tel;
    private String email;


}
