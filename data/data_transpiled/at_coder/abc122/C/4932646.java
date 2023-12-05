public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) , Q = Integer . parseInt ( input . readLine ( ) ) ;
  String S = input . readLine ( ) ;
  int [ ] t = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . substring ( i , i + 2 ) . equals ( "AC" ) ) {
      t [ i + 1 ] = t [ i ] + 1 ;
    }
    else {
      t [ i + 1 ] = t [ i ] ;
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input . readLine ( ) ) , r = Integer . parseInt ( input . readLine ( ) ) ;
    System . out . println ( t [ r - 1 ] - t [ l - 1 ] ) ;
  }
  return t ;
}
