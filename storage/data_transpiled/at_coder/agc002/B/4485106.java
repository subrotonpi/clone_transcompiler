private static void print ( int n , int m ) {
  int [ ] num = new int [ n ] ;
  boolean [ ] red = new boolean [ n ] ;
  red [ n ] = true ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = num [ i ] ;
    x -- ;
    y -- ;
    if ( red [ x ] ) {
      red [ y ] = true ;
    }
  }
}
