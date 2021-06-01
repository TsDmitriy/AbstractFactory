public class PHPTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public QA getQA() {
        return new QAPHP();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ProjectManagerPHP();
    }
}
