public class VersionRunner {
    public static void main(String[] args) {

        Project master = new Project(1,"Project Name","Project source");
        System.out.println(master);

        System.out.println("\n==================================================================\n");

        Project masterCopy = (Project) master.copy();
        System.out.println(masterCopy);

        System.out.println("\n==================================================================\n");

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project project = projectFactory.cloneProject();
        System.out.println(project);
    }
}
