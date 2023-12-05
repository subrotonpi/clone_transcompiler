public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int flag = 0 ;
  int cnt = 1 ;
  for ( int k = 0 ;
  k < N - 1 ;
  k ++ ) {
    if ( ( A [ k ] > A [ k + 1 ] ) && ( A [ k + 1 ] < A [ k ] ) ) {
      int flagTmp = flag ;
      flag = - 1 ;
      if ( flagTmp == 1 ) {
        cnt ++ ;
        flag = 0 ;
      }
    }
    else if ( ( A [ k ] < A [ k + 1 ] ) && ( A [ k + 1 ] < A [ k ] ) ) {
      flagTmp = flag ;
      flag = 1 ;
      if ( flagTmp == - 1 ) {
        cnt ++ ;
        flag = 0 ;
      }
    }
  }
  System . out . println ( cnt ) ;
}
