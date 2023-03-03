public static int N = Integer . parseInt ( input ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  char S = input . charAt ( 0 ) ;
  int [ ] AC = new int [ N ] ;
  int AC_cnt = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( S [ i - 1 ] == 'A' && S [ i ] == 'C' ) AC_cnt ++ ;
    AC [ i ] = AC_cnt ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int ans = AC [ r - 1 ] - AC [ l - 1 ] ;
    System . out . println ( ans ) ;
  }
  return Q ;
}
