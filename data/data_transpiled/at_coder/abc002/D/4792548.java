public static int habatu ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] gin = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    gin [ x - 1 ] [ y - 1 ] = 1 ;
    gin [ y - 1 ] [ x - 1 ] = 1 ;
  }
  int [ ] [ ] gg = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < gg . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      for ( int x = 0 ;
      x < i ;
      x ++ ) {
        boolean d = true ;
        if ( gin [ x ] [ j ] == 0 ) {
          d = false ;
          break ;
        }
      }
      if ( d ) {
        gg [ i ] [ 0 ] = j ;
      }
    }
    gg [ i ] = gg [ i ] [ 0 ] ;
  }
  int max = Integer . parseInt ( input . nextLine ( ) ) ;
  return max ;
}
