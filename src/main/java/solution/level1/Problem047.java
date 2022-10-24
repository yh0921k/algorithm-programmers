package solution.level1;

import java.util.Hashtable;

/*
 * 완주하지 못한 선수
 */
public class Problem047 {
  public String solution(String[] participant, String[] completion) {
    Hashtable<String, Integer> hashtable = new Hashtable<>();
    for (String person : completion) {
      if (hashtable.containsKey(person)) {
        hashtable.put(person, hashtable.get(person) + 1);
        continue;
      }
      hashtable.put(person, 1);
    }

    String result = "";
    for (String person : participant) {
      if (!hashtable.containsKey(person)) {
        result = person;
        break;
      }

      if (hashtable.get(person) == 0) {
        result = person;
        break;
      }

      hashtable.put(person, hashtable.get(person) - 1);
    }

    return result;
  }
}
