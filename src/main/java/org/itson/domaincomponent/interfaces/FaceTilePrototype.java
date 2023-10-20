/**
 * TileFacePrototype.java
 * Oct 15, 2023 8:22:10 AM
 */
package org.itson.domaincomponent.interfaces;

import org.itson.domaincomponent.domain.FaceTile;

/**
 * Interface for FaceTile prototypes, which defines the clone method for
 * creating copies of FaceTile objects.
 *
 * @author Daniel Armando Pe�a Garcia ID: 229185
 * @author Santiago Boj�rquez Leyva ID: 228475
 * @author Paul Alejandro Vazquez Cervantes ID: 241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public interface FaceTilePrototype {

    /**
     * Creates and returns a new instance of FaceTile, which is a clone of the
     * current instance.
     *
     * @return A new FaceTile instance cloned from the current instance.
     */
    public FaceTile clone();

}
