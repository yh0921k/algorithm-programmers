package solution.level1;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * 신고 결과 받기
 */
public class Problem037 {
  public int[] solution(String[] id_list, String[] report, int k) {
    Persons persons = new Persons(id_list);

    for (int i = 0; i < report.length; i++) {
      String[] splitBySpace = report[i].split(" ");

      String reporterName = splitBySpace[0];
      String targetName = splitBySpace[1];

      Person reporter = persons.findByName(reporterName);
      Person target = persons.findByName(targetName);

      reporter.report(target);
    }

    int totalPerson = persons.size();
    int[] result = new int[totalPerson];
    for (int i = 0; i < totalPerson; i++) {
      Person reporter = persons.get(i);
      result[i] = reporter.getMailCount(k);
    }

    return result;
  }
}

class Persons {
  private final List<Person> personList;

  public Persons(String[] idList) {
    personList = new LinkedList<>();

    for (int i = 0; i < idList.length; i++) {
      personList.add(new Person(idList[i]));
    }
  }

  public Person findByName(String name) {
    return this.personList.stream()
        .filter((person) -> person.getName().equals(name))
        .findFirst()
        .get();
  }

  public int size() {
    return personList.size();
  }

  public Person get(int i) {
    return this.personList.get(i);
  }
}

class Person {
  private final String name;
  private final Set<Person> targets;

  private final Set<Person> reporters;
  private int reportedCount;

  public Person(String name) {
    this.name = name;
    this.targets = new LinkedHashSet<>();
    this.reporters = new LinkedHashSet<>();
    this.reportedCount = 0;
  }

  public void report(Person target) {
    this.targets.add(target);
    target.receive(this);
  }

  public void receive(Person reporter) {
    this.reporters.add(reporter);
    this.reportedCount = reporters.size();
  }

  public String getName() {
    return name;
  }

  public int getReportedCount() {
    return reportedCount;
  }

  public int getMailCount(int boundary) {
    int count = 0;
    for(Person target : targets) {
      if(target.getReportedCount() >= boundary) {
        count++;
      }
    }
    return count;
  }
}
