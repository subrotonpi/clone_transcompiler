public static int [ ] [ ] maze ( ) {
  int r = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] maze = new int [ r ] [ c ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int onelist = Integer . parseInt ( input . readLine ( ) ) ;
    maze [ i ] = onelist ;
  }
  int ma = 1 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( ( i + j ) % 2 == d % 2 && ma <= maze [ i ] [ j ] && i + j <= d ) {
        ma = maze [ i ] [ j ] ;
      }
      else {
        return null ;
      }
    }
  }
  System . out . println ( ma ) ;
  return maze ;
}
