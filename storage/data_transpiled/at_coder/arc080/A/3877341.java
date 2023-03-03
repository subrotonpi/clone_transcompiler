public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int [ ] ar = new int [ input . length ( ) ] ;
  for ( int i = 0 ;
  i < ar . length ;
  i ++ ) {
    ar [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  int f = 0 ;
  int k = 0 ;
  for ( int r : ar ) {
    if ( r % 4 == 0 ) {
      f ++ ;
    }
    if ( r % 2 == 1 ) {
      k ++ ;
    }
  }
  if ( k + f == a ) {
    if ( k <= f + 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    if ( k <= f ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
