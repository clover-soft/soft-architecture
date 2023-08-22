package InMemoryModel;

import java.util.List;
import java.util.ArrayList;
import ModelElements.PoligonModel;
import ModelElements.Scene;
import ModelElements.Flash;
import ModelElements.Camera;

public class ModelStore implements IModelCahnger {
    public List<PoligonModel> Models;
    public List<Flash> Flashs;
    public List<Camera> Cameras;
    public List<Scene> Scenes;
    private List<IModelChangedObserver> IModelChangedObservers;

    @Override
    public void NotifyChange(IModelCahnger sender) {
    }

    public ModelStore(List<IModelChangedObserver> changedObservers) {
        IModelChangedObservers = changedObservers;
        Models = new ArrayList<PoligonModel>();
        Flashs = new ArrayList<Flash>();
        Cameras = new ArrayList<Camera>();
        Scenes = new ArrayList<Scene>();
        Models.add(new PoligonModel(null));
        Flashs.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashs, Cameras));
    }

    public Scene getScene(int Id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).Id == Id) {
                return Scenes.get(i);
            }
        }
        return null;
    }
}
