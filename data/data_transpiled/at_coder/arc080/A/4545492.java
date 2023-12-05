public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int x = 0 ;
  int y = 0 ;
  for ( int a : A ) {
    if ( a % 2 == 0 ) {
      if ( a % 4 == 0 ) {
        x ++ ;
      }
      else {
        y ++ ;
      }
    }
  }
  if ( x + y / 2 >= n / 2 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
