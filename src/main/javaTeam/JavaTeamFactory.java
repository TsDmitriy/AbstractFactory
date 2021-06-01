public class JavaTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public QA getQA() {
        return new QAJava();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ProjectManagerJava();
    }
}
