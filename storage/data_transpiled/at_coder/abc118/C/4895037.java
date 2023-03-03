public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = a [ 0 ] ;
  for ( int i = 1 ;
  i < a . length ;
  i ++ ) {
    if ( ans > a [ i ] ) {
      ans = a [ i ] ;
      a [ i ] = ans ;
    }
    while ( a [ i ] % ans != 0 ) {
      a [ i ] = ans ;
      ans = a [ i ] % ans ;
    }
    if ( ans == 1 ) {
      System . out . println ( 1 ) ;
      break ;
    }
  }
  else {
    System . out . println ( ans ) ;
  }
}
