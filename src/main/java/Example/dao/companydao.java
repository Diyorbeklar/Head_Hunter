package Example.dao;

import Example.model.City;
import Example.model.Company;

import java.util.List;

public interface companydao {
    public Company selectCompanyById(Integer id);
    public List<Company> selectAllCompany();
    void insertCompany (Company company);
    void updateCompany(Integer id, Company company);
    void deleteCompany(Integer id);
}
