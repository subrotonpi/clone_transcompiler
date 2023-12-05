static final class Rope {
  private static final long serialVersionUID = 1L ;
  private final double A = point1 ;
  private final double B = point2 ;
  public boolean intersects ( Rope rope ) {
    if ( ( ( A - rope . A ) * ( B - rope . B ) ) > 0 ) return false ;
    else return true ;
  }
  public void main ( String [ ] argv ) {
    int n = Integer . parseInt ( argv [ 0 ] ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      int T = Integer . parseInt ( argv [ i ] ) ;
      ArrayList < Rope > ropes = new ArrayList < > ( ) ;
      int intersects = 0 ;
      for ( int j = 0 ;
      j < T ;
      j ++ ) {
        String [ ] line = argv [ j ] . split ( "\\s" ) ;
        Rope thisRope = new Rope ( Integer . parseInt ( line [ 0 ] ) , Integer . parseInt ( line [ 1 ] ) ) ;
        for ( Rope otherRope : ropes ) {
          if ( thisRope . intersects ( otherRope ) ) intersects ++ ;
        }
        ropes . add ( thisRope ) ;
      }
      System . out . println ( ) ;
    }
  }
}
