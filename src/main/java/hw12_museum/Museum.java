package hw12_museum;

public class Museum {
    private Exhibit currentExhibit;

    public void setCurrentExhibit(Exhibit exhibit) {
        this.currentExhibit = exhibit;
    }

    public void manageExhibit() {
        currentExhibit.preserve();
    }

    public void showHistory() {
        currentExhibit.showHistory();
    }
}
