package exerciciosjava.listas;

import java.util.List;

public class Employee {

    int hasId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
}
