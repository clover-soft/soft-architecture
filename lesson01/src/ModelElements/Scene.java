package ModelElements;

import java.util.List;

public class Scene {
    public int Id;
    public List<PoligonModel> Models;
    public List<Flash> Flashs;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonModel> models, List<Flash> flashs, List<Camera> cameras)
            throws IllegalArgumentException {
        if (models.size() < 1) {
            throw new IllegalArgumentException("Models cannot be empty");
        }
        if (cameras.size() < 1) {
            throw new IllegalArgumentException("Cameras cannot be empty");
        }
        Id = id;
        Models = models;
        Flashs = flashs;
        Cameras = cameras;
    }
    
}
