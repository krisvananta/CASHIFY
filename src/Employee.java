class Employee extends User {
    public Employee(int id, String username, String password, Role role) {
        super(id, username, password, role);
    }

    @Override
    public void displayDashboard() {
        // Implementasi spesifik untuk Employee
    }
}