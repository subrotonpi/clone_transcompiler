public static int [ ] [ ] a , int [ ] b , int [ ] c , int [ ] d = new int [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  b [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  c [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  d [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  if ( Math . abs ( a [ i ] - c [ i ] ) <= d ) {
    System . out . println ( "Yes" ) ;
  }
  else if ( Math . abs ( a [ i ] - b [ i ] ) <= d && Math . abs ( b [ i ] - c [ i ] ) <= d ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
