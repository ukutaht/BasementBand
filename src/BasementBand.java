public class BasementBand {
    public static void makeRecording(InternalMicrophone inputDevice, Effect effect, InternalSpeakers outputDevice){
        String recording = inputDevice.record();
        String processedRecording = effect.process(recording);
        outputDevice.play(processedRecording);
    }
}