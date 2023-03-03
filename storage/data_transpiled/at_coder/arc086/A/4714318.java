public static int [ ] readIntList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int num = Integer . parseInt ( A [ N ] ) ;
  int [ ] cnt = new int [ N + 1 ] ;
  cnt [ N ] = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cnt [ N + 1 ] = i ;
  }
  return cnt ;
}
