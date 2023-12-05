public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int M = Collections . max ( A ) ;
  int m = Collections . min ( A ) ;
  if ( M - m >= 2 ) {
    System . out . println ( "No" ) ;
  }
  else if ( M - m == 1 ) {
    int x = 0 ;
    int y = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( A [ i ] == m ) {
        x ++ ;
      }
      else {
        y ++ ;
      }
    }
    if ( x < M && 2 * ( M - x ) <= y ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    if ( 2 * M <= N || M == N - 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
