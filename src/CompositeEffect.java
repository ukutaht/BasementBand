/**
 * Created by ukutaht on 7/11/14.
 */
public class CompositeEffect implements Effect {

    private Effect[] effects;

    public CompositeEffect(Effect ... effects){
        this.effects = effects;
    }

    @Override
    public String process(String recording) {
        String result = recording;
        for(Effect effect : effects){
            result = effect.process(result);
        }
        return result;
    }
}
