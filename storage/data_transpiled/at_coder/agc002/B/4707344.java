public static int n ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean [ ] has = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    has [ i ] = false ;
  }
  has [ 0 ] = true ;
  int [ ] count = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    count [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    x -- ;
    y -- ;
    count [ x ] -- ;
    count [ y ] ++ ;
    if ( has [ x ] == true ) {
      has [ y ] = true ;
      if ( count [ x ] == 0 ) {
        has [ x ] = false ;
      }
    }
  }
  int ans = 0 ;
  for ( boolean x : has ) {
    if ( x == true ) ans ++ ;
  }
  return ans ;
}
