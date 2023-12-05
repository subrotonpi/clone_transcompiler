public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] lis = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis [ i ] = Integer . parseInt ( input ) ;
  Arrays . sort ( lis ) ;
  if ( n % 2 == 1 ) {
    if ( lis [ 0 ] != 0 ) {
      System . out . println ( "0" ) ;
      exit ( ) ;
    }
    else key = 0 ;
  }
  else key = - 1 ;
  for ( int i = 0 ;
  i < n / 2 ;
  i ++ ) {
    if ( lis [ i * 2 + key + 1 ] != lis [ i * 2 + key ] || lis [ i * 2 + key + 2 ] != 2 * ( i + 1 ) + key ) {
      System . out . println ( "0" ) ;
      exit ( ) ;
    }
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < n / 2 ;
  i ++ ) {
    ans *= 2 ;
    ans %= 10 * 9 + 7 ;
  }
  System . out . println ( ans ) ;
}
