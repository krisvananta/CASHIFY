class Owner extends User {
    public Owner(int id, String username, String password, Role role) {
        super(id, username, password, role);
    }

    @Override
    public void displayDashboard() {
        // Implementasi spesifik untuk Owner
    }
}