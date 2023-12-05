static int n ( Scanner input ) {
  int ans = 0 ;
  int [ ] box = new int [ n ] ;
  boolean [ ] flag = new boolean [ n ] ;
  flag [ 0 ] = true ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    x -- ;
    y -- ;
    box [ x ] -- ;
    box [ y ] ++ ;
    if ( flag [ x ] ) flag [ y ] = true ;
    if ( box [ x ] == 0 ) flag [ x ] = false ;
  }
  return ans ;
}
