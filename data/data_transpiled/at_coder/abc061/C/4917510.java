public static int [ ] readIntList ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] num = new int [ 10 * 5 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    num [ a - 1 ] += b ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < num . length ;
  i ++ ) {
    cnt += num [ i ] ;
    if ( cnt >= K ) {
      System . out . println ( i + 1 ) ;
      exit ( ) ;
    }
  }
  return num ;
}
