package presenter;

import model.FamilyTreeService;
import view.View;

public class Presenter {
    private View view;
    private FamilyTreeService service;

    public Presenter(View view) {
        service = new FamilyTreeService();
        this.view = view;
    }

    public void addHuman(String name, String gender, String birthDate, long idFather, long idMother) {
        String answer = service.addHuman(name, gender, birthDate, idFather, idMother);
        view.print(answer);
    }

    public void getHumanList() {
        String answer = service.getHumanList();
        view.print(answer);
    }

    public void saveTree(String pathName) {
        view.showResult(core.saveTree(pathName));
    }

    public void getTreeFullInfo() {
        Presenter core;
        view.showResult(core.getTreeFullInfo());
    }

    public void setCurrentItemById(int id) {
        String result = core.setCurrentItemById(id);
        view.showResult(result);
        view.showResult(core.getCurrentItemFullInfo());
    }

    public void getCurrentItemFullInfo() {
        view.showResult(core.getCurrentItemFullInfo());
    }

    public void setBirthDateToCurrItem(int day, int month, int year) {
        String result = core.setBirthDateToCurrItem(day, month, year);
        view.showResult(result);
    }

    public void setDeathDateToCurrItem(int day, int month, int year) {
        String result = core.setDeathDateToCurrItem(day, month, year);
        view.showResult(result);
    }

    public void setParentToCurrItemById(int id) {
        String result = core.setParentToCurrItemById(id);
        view.showResult(result);
    }

    public void addChildToCurrItemById(int id) {
        String result = core.addChildToCurrItemById(id);
        view.showResult(result);
    }
}
