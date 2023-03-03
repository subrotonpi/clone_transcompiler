public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ) ;
  int [ ] exRed = new int [ 8 ] ;
  int redCnt = 0 ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( 400 * i <= A [ j ] && A [ j ] < 400 * ( i + 1 ) ) {
        exRed [ i ] ++ ;
      }
    }
  }
  int n = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( 3200 <= A [ i ] ) {
      n ++ ;
    }
  }
  int notRedColor = 0 ;
  int c = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( exRed [ i ] > 0 ) {
      notRedColor ++ ;
    }
  }
  int maxAns = 0 ;
  int minAns = 0 ;
  System . out . println ( minAns + " " + maxAns ) ;
}
