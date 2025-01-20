public enum RootUser {
    INSTANCE;

    private final int UID = 0;
    private final int GID = 0;
    private final String userName = "root";
    private final String name = "Super user";
    private final String home = "/root";
    private final String shell = "/bin/sh";

    @Override
    public String toString() {
        return new StringBuilder(userName)
            .append("(").append(name).append(")")
            .append(" ").append(UID).append(":").append(GID)
            .append(" home: ").append(home).append(" ")
            .append("shell: ").append(shell)
            .toString();
    }
}