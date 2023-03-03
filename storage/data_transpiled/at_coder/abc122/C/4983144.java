public static int N = Integer . parseInt ( input ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    t [ i + 1 ] = t [ i ] + ( S . substring ( i , i + 2 ) . equals ( "AC" ) ? 1 : 0 ) ;
  }
  for ( int j = 0 ;
  j < Q ;
  j ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( t [ r - 1 ] - t [ l - 1 ] ) ;
  }
  return N ;
}
