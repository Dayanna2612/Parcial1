import java.util.Arrays;

// Clase que representa a un estudiante
class Student {
    int age;
    int semester;
    int socioEconomicStratum;
    int coursesCompleted;
    int coursesPending;
    String program;
    int programId;

    // Constructor para inicializar los datos del estudiante
    Student(int age, int semester, int socioEconomicStratum, int coursesCompleted,
            int coursesPending, String program, int programId) {
        this.age = age;
        this.semester = semester;
        this.socioEconomicStratum = socioEconomicStratum;
        this.coursesCompleted = coursesCompleted;
        this.coursesPending = coursesPending;
        this.program = program;
        this.programId = programId;
    }

    // Para mostrar la información de manera legible
    public String toString() {
        return "Program ID: " + programId + ", Program: " + program + ", Age: " + age +
               ", Semester: " + semester + ", Stratum: " + socioEconomicStratum +
               ", Courses Completed: " + coursesCompleted + ", Courses Pending: " + coursesPending;
    }
}

// Algoritmos de ordenamiento
class SortingAlgorithms {

    // Ordenar por edad usando Bubble Sort (ascendente)
    static void bubbleSortByAge(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].age > students[j + 1].age) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // Ordenar por semestre usando Selection Sort (descendente)
    static void selectionSortBySemesterDesc(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].semester > students[maxIdx].semester) {
                    maxIdx = j;
                }
            }
            Student temp = students[maxIdx];
            students[maxIdx] = students[i];
            students[i] = temp;
        }
    }
}

// Algoritmos de búsqueda
class SearchingAlgorithms {

    // Búsqueda lineal por programId
    static Student linearSearchByProgramId(Student[] students, int programId) {
        for (Student s : students) {
            if (s.programId == programId) {
                return s;
            }
        }
        return null;
    }

    // Búsqueda binaria por edad (requiere lista ordenada)
    static Student binarySearchByAge(Student[] students, int age) {
        int left = 0, right = students.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (students[mid].age == age) {
                return students[mid];
            } else if (students[mid].age < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Lista de estudiantes con datos de ejemplo
        Student[] students = {
            new Student(19, 2, 3, 8, 12, "Computer Science", 100001),
            new Student(22, 6, 4, 20, 8, "Mechanical Engineering", 100002),
            new Student(18, 1, 2, 5, 15, "Mathematics", 100003),
            new Student(25, 9, 5, 30, 2, "Medicine", 100004),
            new Student(21, 5, 3, 18, 6, "Law", 100005),
            new Student(20, 3, 2, 10, 10, "Architecture", 100006),
            new Student(23, 7, 6, 25, 3, "Psychology", 100007),
            new Student(27, 10, 4, 35, 1, "Economics", 100008),
            new Student(24, 8, 5, 28, 2, "Civil Engineering", 100009),
            new Student(26, 9, 3, 32, 2, "Biology", 100010)
        };

        // Mostrar la lista original
        System.out.println("=== Original List ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Ordenamiento por edad
        SortingAlgorithms.bubbleSortByAge(students);
        System.out.println("\n=== Sorted by Age (Bubble Sort, Ascending) ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Ordenamiento por semestre
        SortingAlgorithms.selectionSortBySemesterDesc(students);
        System.out.println("\n=== Sorted by Semester (Selection Sort, Descending) ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Búsqueda lineal
        Student found1 = SearchingAlgorithms.linearSearchByProgramId(students, 100007);
        System.out.println("\n=== Linear Search (Program ID: 100007) ===");
        System.out.println(found1 != null ? found1 : "Student not found");

        // Búsqueda binaria (primero ordenamos por edad otra vez)
        SortingAlgorithms.bubbleSortByAge(students);
        Student found2 = SearchingAlgorithms.binarySearchByAge(students, 21);
        System.out.println("\n=== Binary Search (Age: 21) ===");
        System.out.println(found2 != null ? found2 : "Student not found");
    }
}
