public static int [ ] readInput ( ) {
  String l = input . nextLine ( ) ;
  int N = Integer . parseInt ( l . substring ( 0 , 1 ) ) , Q = Integer . parseInt ( l . substring ( 1 , 2 ) ) ;
  String S = input . nextLine ( ) ;
  int [ ] blue = new int [ N ] ;
  blue [ 0 ] = 0 ;
  for ( int k = 1 ;
  k < N ;
  k ++ ) {
    if ( S . charAt ( k - 1 ) == 'A' && S . charAt ( k ) == 'C' ) {
      blue [ k ] = blue [ k - 1 ] + 1 ;
    }
    else {
      blue [ k ] = blue [ k - 1 ] ;
    }
  }
  for ( int i = 1 ;
  i <= Q ;
  i ++ ) {
    String rl = input . nextLine ( ) ;
    int r = Integer . parseInt ( rl . substring ( 0 , 1 ) ) ;
    int l = Integer . parseInt ( rl . substring ( 1 , 2 ) ) ;
    System . out . println ( blue [ l - 1 ] - blue [ r - 1 ] ) ;
  }
  return blue ;
}
