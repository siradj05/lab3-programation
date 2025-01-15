package interfaces;

import base.GameObject;

// Interface for living objects
public interface Living {
    void grow();
    void interact(GameObject other);
}

