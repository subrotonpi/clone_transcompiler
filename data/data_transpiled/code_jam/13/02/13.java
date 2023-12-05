public static Lawn Lawn ( int rows , int cols , int [ ] [ ] board ) {
  int [ ] lines = new int [ rows ] ;
  int [ ] cols = new int [ cols ] ;
  int [ ] [ ] board = new int [ rows ] [ cols ] ;
  boolean [ ] cleared = null ;
  int [ ] [ ] canBeTrimmed = new int [ cols ] [ cols ] ;
  for ( int r = 0 ;
  r < cols ;
  r ++ ) {
    int h = board [ r ] [ c ] ;
    if ( Arrays . binarySearch ( board [ r ] [ i ] , h ) <= 0 ) {
      for ( int i : xrange ( cols ) ) {
        cleared [ r ] [ i ] = true ;
        return true ;
      }
    }
    if ( Arrays . binarySearch ( board [ i ] [ c ] , h ) <= 0 ) {
      for ( int i : xrange ( rows ) ) {
        cleared [ i ] [ c ] = true ;
        return true ;
      }
    }
  }
  return new Lawn ( ) {
    public boolean canBeTrimmed [ ] [ ] ;
  }
  ;
}
