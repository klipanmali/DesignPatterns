package headfirst.combined.djview;
  
public class DJTestDrive {

    public static void main (String[] args) {
//        BeatModelInterface model = new BeatModel();        
//		ControllerInterface controller = new BeatController(model);
		
        HeartModelInterface heartRateModel = new HeartModel();
		ControllerInterface controller = new BeatController(new HeartAdapter(heartRateModel));

    }
}
