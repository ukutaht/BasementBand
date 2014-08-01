public class LoopEffect implements Effect {
    private int times;

    public LoopEffect(int times){
        this.times = times;
    }

    @Override
    public String process(String recording) {
        String newRecording = "";
        for (int i = 0; i < times; i++) {
            newRecording += recording;
        }
        return newRecording;
    }
}
