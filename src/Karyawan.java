public class Karyawan extends User{
    public Karyawan(int id, String username, String password) {
        super(id, username, password, Role.EMPLOYEE);
    }
    public void processOrder() {
        // Implementasi pemrosesan pesanan
    }

    @Override
    public void displayDashboard() {
        System.out.println("Welcome to Employee Dashboard");
    }
}
