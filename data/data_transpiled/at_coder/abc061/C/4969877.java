public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ 10 * 5 + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    l [ a ] += b ;
  }
  int cnt = 0 ;
  for ( int i = 1 ;
  i <= 10 * 5 ;
  i ++ ) {
    cnt += l [ i ] ;
    if ( cnt >= K ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  return cnt ;
}
