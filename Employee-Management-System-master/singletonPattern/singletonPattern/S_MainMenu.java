package singletonPattern;
/*************************** MENU OF EMS ****************************/
//change by nouf


class S_MainMenu {
    private static S_MainMenu instance;

    private S_MainMenu() {
    }

    public static S_MainMenu getInstance() {
        if (instance == null) {
            instance = new S_MainMenu();
        }
        return instance;
    }

    public void menu() {
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t\t  EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t\t    --------------------");
        System.out.println("\t\t\t     ~$ Abhinav Dubey");
        System.out.println("\t\t\t    --------------------");
        System.out.println("\n\nPress 1 : To Add an Employee Details");
        System.out.println("Press 2 : To See an Employee Details ");
        System.out.println("Press 3 : To Remove an Employee");
        System.out.println("Press 4 : To Update Employee Details");
        System.out.println("Press 5 : To Exit the EMS Portal");
    }
}
