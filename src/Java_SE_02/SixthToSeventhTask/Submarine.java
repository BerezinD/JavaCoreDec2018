package Java_SE_02.SixthToSeventhTask;

public class Submarine {

    private class EngineForSubmarine{
        private void runEngine(){
            System.out.println("Engines are ready to go");
        }
    }

    public void sail(){
        EngineForSubmarine mainEngine = new EngineForSubmarine();
        mainEngine.runEngine();
        System.out.println("Here we go!!!");
    }

    public static void main(String[] args) {
        Submarine mSubmarine = new Submarine();
        mSubmarine.sail();
    }
}
