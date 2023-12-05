public static int N = Integer . parseInt ( input ) {
  String [ ] [ ] play = new String [ N ] [ 9 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String X = input . next ( ) ;
    for ( int j = 0 ;
    j < 9 ;
    j ++ ) {
      play [ j ] [ N - i - 1 ] = X . substring ( j , j + 1 ) ;
    }
  }
  int countx = 0 ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( play [ i ] [ j ] . equals ( "x" ) ) {
        countx ++ ;
      }
    }
  }
  int counto = 0 ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    boolean waso = false ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( play [ i ] [ j ] . equals ( "o" ) ) {
        if ( waso ) {
          continue ;
        }
        else {
          counto ++ ;
        }
        waso = true ;
      }
      else {
        waso = false ;
      }
    }
  }
  int count = countx + counto ;
  System . out . println ( count ) ;
  return count ;
}
