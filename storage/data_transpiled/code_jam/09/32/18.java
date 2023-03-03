static final void solve ( ) throws IOException {
  psyco . full ( ) ;
  class Node {
    int i ;
    float X , Y , Z , VX , VY , VZ ;
    int N ;
    float x , Y , z , vx , vy , vz ;
    X /= N ;
    Y /= N ;
    Z /= N ;
    VX /= N ;
    VY /= N ;
    VZ /= N ;
    float vSqr = VX * VY + VZ * vSqr ;
    float t ;
    if ( vSqr != 0 ) t = - 1.0 * ( X * VX + Y * VY + Z * vSqr ) / vSqr ;
    else t = 0 ;
    System . out . println ( "M=" + X + "-" + Y + " V=" + VX + "." + VY + "." + VZ ) ;
    X += VX * t ;
    Y += VY * t ;
    Z += VZ * t ;
    float d = ( X * X + Y * Y + Z * Z ) * 0.5 ;
    String s = "Case #" + d + ": " + t + "\n" ;
    System . out . println ( s ) ;
  }
  System . out . println ( ) ;
}
