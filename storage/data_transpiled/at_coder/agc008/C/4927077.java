public static void print ( int [ ] a ) {
  a = new int [ 4 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int k = a [ 1 ] , h = a [ 1 ] ;
  k += a [ 0 ] - a [ 0 ] % 2 ;
  k += a [ 3 ] - a [ 3 ] % 2 ;
  k += a [ 4 ] - a [ 4 ] % 2 ;
  if ( Math . min ( a [ 0 ] , a [ 3 ] , a [ 4 ] ) > 0 ) {
    h += 3 ;
    a [ 0 ] = a [ 0 ] - 1 ;
    a [ 3 ] = a [ 3 ] - 1 ;
    a [ 4 ] = a [ 4 ] - 1 ;
  }
  System . out . println ( Math . max ( k , h ) ) ;
}
