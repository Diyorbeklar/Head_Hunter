package Example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vacancy_requirement {
    private Integer id;
    private Integer vacancy_id;
    private Integer requirement_id;

    public Vacancy_requirement(Integer vacancy_id, Integer requirement_id) {
        this.vacancy_id = vacancy_id;
        this.requirement_id = requirement_id;
    }
}
