package hw12_museum;

public class Main {
    public static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();
        Museum museum = new Museum();

        museum.setCurrentExhibit(manuscript);
        museum.showHistory();
        museum.manageExhibit();

        museum.setCurrentExhibit(sculpture);
        museum.showHistory();
        museum.manageExhibit();
    }
}
