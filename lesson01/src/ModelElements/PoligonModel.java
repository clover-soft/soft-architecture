package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class PoligonModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonModel(List<Texture> textures) {
        Textures = textures;
        Poligons = new ArrayList<>();
        Poligons.add(new Poligon(new ArrayList<Point3D>()));
    }

}
