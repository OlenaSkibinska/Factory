package factory;
import bouquet.Bouquet;
import enums.FlowerColor;
import flower.CactusFlower;
import flower.RomashkaFlower;
import specs.CactusSpec;
import specs.FlowerSpec;

/**
 * Created by cs.ucu.edu.ua on 12/25/2016.
 */
public class WeddingBucket extends Bouquet{
    public WeddingBucket(){
        CactusFlower cactus1 = new CactusFlower(new CactusSpec(1, true, FlowerColor.RED, true));
        CactusFlower cactus2 = new CactusFlower(new CactusSpec(1, true, FlowerColor.GREEN, true));
        RomashkaFlower romashka  = new RomashkaFlower(new FlowerSpec(6, false, FlowerColor.GRAY, 12));
        addFlowers(cactus1);
        addFlowers(cactus2);
        addFlowers(romashka);

    }
}
