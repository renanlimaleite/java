package composicao.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
  private String name;
  private WorkLevelEnum workLevel;
  private Double baseSalary;

  private Departament departament;
  private List<HourContrat> contracts = new ArrayList<>();

  public Worker() {}

  public Worker(String name, WorkLevelEnum workLevel, Double baseSalary, Departament departament) {
    this.name = name;
    this.workLevel = workLevel;
    this.baseSalary = baseSalary;
    this.departament = departament;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkLevelEnum getWorkLevel() {
    return workLevel;
  }

  public void setWorkLevel(WorkLevelEnum workLevel) {
    this.workLevel = workLevel;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public Departament getDepartament() {
    return departament;
  }

  public void setDepartament(Departament departament) {
    this.departament = departament;
  }

  public List<HourContrat> getContracts() {
    return contracts;
  }

  public void addContract(HourContrat contract) {
    this.contracts.add(contract);
  }

  public void removeContract(HourContrat contract) {
    this.contracts.remove(contract);
  }

  public double income(int year, int month) {
    double sum = this.baseSalary;
    Calendar cal = Calendar.getInstance();
    for (HourContrat c : this.contracts) {
      cal.setTime(c.getDate());
      int c_year = cal.get(Calendar.YEAR);
      int c_month = cal.get(Calendar.MONTH);
      if (year == c_year && month == c_month) {
        sum += c.totalValue();
      }
    }
    return sum;
  }
}
