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
public class BirthdayBucket extends Bouquet {
    public BirthdayBucket() {
        RomashkaFlower romashka  = new RomashkaFlower(new FlowerSpec(6, false, FlowerColor.GRAY, 12));
        RomashkaFlower romashka1  = new RomashkaFlower(new FlowerSpec(7, true, FlowerColor.GREEN, 7));
        CactusFlower cactus = new CactusFlower(new CactusSpec(1, true, FlowerColor.GREEN, true));
        addFlowers(romashka);
        addFlowers(romashka1);
        addFlowers(cactus);

    }

}
