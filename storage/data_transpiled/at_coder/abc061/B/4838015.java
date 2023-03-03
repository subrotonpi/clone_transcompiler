public static int [ ] getRoads ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] roads = new int [ 60 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    for ( int x : map . get ( input . nextLine ( ) ) ) {
      roads [ x ] ++ ;
    }
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . println ( roads [ i ] ) ;
  }
  return roads ;
}
