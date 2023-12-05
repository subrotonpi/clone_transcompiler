public static int [ ] [ ] [ ] createC ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] R = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) {
    R [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < R [ i ] . length ;
    j ++ ) {
      R [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  int [ ] [ ] C = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ i ] [ 0 ] = R [ i ] [ 0 ] [ 0 ] - 1 ] ;
    C [ i ] [ 1 ] = R [ i ] [ 1 ] [ 1 ] - 1 ;
    C [ i ] [ 1 ] [ 0 ] = R [ i ] [ 0 ] [ 0 ] - 1 ] ;
  }
  for ( int i = 0 ;
  i < C . length ;
  i ++ ) {
    System . out . println ( C [ i ] . length ) ;
  }
  return C ;
}
