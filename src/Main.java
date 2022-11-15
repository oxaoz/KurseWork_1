public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[2] = new Employee("Пушкин Александр Сергеевич ", 57443.15, 2);
        employees[0] = new Employee("Крылов Иван Андреевич", 44607.11, 2);
        employees[8] = new Employee("Толстой Лев Николаевич", 70314.04, 1);
        employees[9] = new Employee("Чехов Антон Павлович", 39860.32, 3);
        employees[4] = new Employee("Лермонтов Михаил Юрьевич", 60043.78, 2);
        employees[3] = new Employee("Гоголь Николай Васильевич", 49437.20, 4);
        employees[6] = new Employee("Достоевский Федор Михайлович", 51781.33, 4);
        employees[5] = new Employee("Тургенев Иван Сергеевич", 52103.07, 5);
        employees[7] = new Employee("Островский Александр Николаевич", 69823.25, 5);
        employees[1] = new Employee("Грибоедов Александр Сергеевич", 67753.47, 1);
        printArray();
        System.out.println("Сумма затрат на зарплаты работников: " + sumSalary());
        System.out.println("Работник с минимальной зарплатой: " + minSalary());
        System.out.println("Работник с максимальной зарплатой: " + maxSalary());
        System.out.printf("Среднее значение зарплат: %.2f\n", averageSalary());
        printFullName();

    }

    public static void printArray() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static double sumSalary() {
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += employees[i].getSalary();
            }
        }
        return result;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        double min = 1_000_000_000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }

    public static Employee maxSalary() {
        Employee result = employees[0];
        double max = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }

    public static double averageSalary() {
        int countElementsWithoutNull = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                countElementsWithoutNull++;
            }
        }
        return sumSalary() / countElementsWithoutNull;
    }

    public static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
}

