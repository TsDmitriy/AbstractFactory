public class WebAplicationForJava {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new JavaTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        QA qa = projectTeamFactory.getQA();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("start poject");
        developer.createCode();
        qa.testCode();
        projectManager.controlProject();

    }
}
