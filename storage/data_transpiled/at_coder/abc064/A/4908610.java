public static int [ ] [ ] a , int [ ] b , int [ ] c ) {
  int [ ] [ ] a = new int [ 3 ] [ 3 ] ;
  int [ ] [ ] b = new int [ 3 ] [ 3 ] ;
  int [ ] [ ] c = new int [ 3 ] [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    b [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    c [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    if ( ( 100 * a [ i ] + 10 * b [ i ] + c [ i ] ) % 4 == 0 ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  return a