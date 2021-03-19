import java.io.Serializable;
import java.util.*;

class AutoMap implements Serializable {

    private HashMap<Integer, Auto> autoMap = new HashMap<>();

    public AutoMap() {

    }


    @Override
    public String toString() {
        return "AutoMap{" +
                "autoMap=" + autoMap +
                '}';
    }

    public HashMap<Integer, Auto> getAutoMap() {
        return autoMap;
    }

    public void setAutoMap(HashMap<Integer, Auto> autoMap) {
        this.autoMap = autoMap;
    }

    public AutoMap(HashMap<Integer, Auto> autoMap) {
        this.autoMap = autoMap;
    }

    public void addAuto(Integer key, Auto auto) {
        autoMap.put(key, auto);

    }

    public void addAuto(Auto auto) {
        autoMap.put(getNextKey(), auto);

    }

    public void removeAuto(Integer key) {
        autoMap.remove(key);
    }

    public Auto getAuto(Integer key) {
        return autoMap.get(key);
    }

    public Set getKeys() {
        return autoMap.keySet();
    }

    public Integer getNextKey() {
        Integer biggest = 0;
        Set<Integer> set = getKeys();
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            Integer res = i.next();
            if (res > biggest) {
                biggest = res;
            }

        }
        return biggest + 1;

    }
}