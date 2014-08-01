public class Runner {
    public static void main(String[] args) {
        BasementBand.makeRecording(new InternalMicrophone(),
                                   new CompositeEffect(new LoopEffect(3), new IncreaseVolumeEffect()),
                                   new InternalSpeakers());
    }
}







