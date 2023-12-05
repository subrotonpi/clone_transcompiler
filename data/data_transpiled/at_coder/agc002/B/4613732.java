public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ball = new int [ N ] ;
  boolean [ ] boolball = new boolean [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ball [ i ] = 1 ;
  }
  boolball [ 0 ] = true ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    x -- ;
    y -- ;
    if ( boolball [ x ] ) boolball [ y ] = true ;
    if ( ball [ x ] == 1 ) boolball [ x ] = false ;
    ball [ x ] -- ;
    ball [ y ] ++ ;
  }
  int ans = 0 ;
  for ( boolean t : boolball ) {
    if ( t ) ans ++ ;
  }
  return ans ;
}
