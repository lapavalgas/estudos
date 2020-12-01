/**
 * Is a class java representation of an interface. To example an extends interface.
 */
interface Interface_IVheicleMovement {
    public void moveOnX();
    public void moveOnY();
}
/**
 * But is important remember to just extends when all methods can be full be tapped.
 */
interface Interface_IVheicleMovement3D extends Interface_IVheicleMovement {
    public void moveOnZ();
}