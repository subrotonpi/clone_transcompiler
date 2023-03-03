public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] li = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    li [ i ] = Integer . parseInt ( input ) ;
  }
  int fl = 0 ;
  int ans = 0 ;
  if ( li [ 0 ] != 0 ) {
    fl ++ ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( li [ i ] >= li [ i + 1 ] ) {
      ans += li [ i ] ;
    }
    if ( li [ i + 1 ] - li [ i ] > 1 ) {
      fl ++ ;
    }
  }
  if ( fl > 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( ans + li [ n - 1 ] ) ;
  }
}
