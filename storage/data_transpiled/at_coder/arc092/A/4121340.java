public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Point > redPoints = new ArrayList < > ( ) ;
  List < Point > bluePoints = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    redPoints . add ( new Point ( Integer . parseInt ( input ) ) ) ;
  }
  Collections . sort ( redPoints , new Comparator < Point > ( ) {
    @ Override public int compare ( Point o1 , Point o2 ) {
      return - o1 . getY ( ) ;
    }
  }
  ) ;
  Collections . sort ( bluePoints , new Comparator < Point > ( ) {
    @ Override public int compare ( Point o1 , Point o2 ) {
      return o1 . getX ( ) - o2 . getX ( ) ;
    }
  }
  ) ;
  int count = 0 ;
  boolean [ ] pointsUsed = new boolean [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( Point blue : bluePoints ) {
      for ( int j = 0 ;
      j < redPoints . size ( ) ;
      j ++ ) {
        Point red = redPoints . get ( j ) ;
        if ( ! pointsUsed [ j ] && red . getX ( ) < blue . getX ( ) && red . getY ( ) < blue . getY ( ) ) {
          count ++ ;
          pointsUsed [ j ] = true ;
          break ;
        }
      }
    }
  }
  System . out . println ( count ) ;
}
