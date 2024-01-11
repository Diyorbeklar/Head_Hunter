package Example.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Requirement {
    private Integer id;
    private String name;
    public Requirement(String name) {
        this.name = name;
    }
}
