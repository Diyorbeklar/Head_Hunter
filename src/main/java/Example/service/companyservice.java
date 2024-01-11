package Example.service;

import Example.model.Company;

import java.util.List;

public interface companyservice {
    Company getCompanyById(Integer id);
    List<Company> getCompanyList();
    void createCompany(Company company);
    void updateCompany(Integer id, Company company);
    void deleteCompany(Integer id);
}
