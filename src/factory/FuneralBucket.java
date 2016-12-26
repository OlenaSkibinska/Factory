package factory;
import bouquet.Bouquet;
import enums.FlowerColor;
import flower.RomashkaFlower;
import specs.FlowerSpec;

/**
 * Created by cs.ucu.edu.ua on 12/25/2016.
 */
public class FuneralBucket extends Bouquet{
    public FuneralBucket() {
        RomashkaFlower romashka  = new RomashkaFlower(new FlowerSpec(6, false, FlowerColor.GRAY, 12));
        RomashkaFlower romashka1  = new RomashkaFlower(new FlowerSpec(7, true, FlowerColor.GREEN, 7));
        addFlowers(romashka);
        addFlowers(romashka1);

        }

    }
