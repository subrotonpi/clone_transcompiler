public static int [ ] readInput ( ) {
  int [ ] c = new int [ n ] ;
  int [ ] s = new int [ n ] ;
  int [ ] f = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    int z = Integer . parseInt ( input . readLine ( ) ) ;
    c [ i ] = x ;
    s [ i ] = y ;
    f [ i ] = z ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int t = 0 ;
    for ( int j = i ;
    j < n - 1 ;
    j ++ ) {
      int w ;
      if ( t <= s [ j ] ) {
        w = s [ j ] - t ;
      }
      else {
        w = ( f [ j ] - ( t - s [ j ] ) % f [ j ] ) % f [ j ] ;
      }
      t += w ;
      t += c [ j ] ;
    }
    System . out . println ( t ) ;
  }
  System . out . println ( 0 ) ;
  return c ;
}
