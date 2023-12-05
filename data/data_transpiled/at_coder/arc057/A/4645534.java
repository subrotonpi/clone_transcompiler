public static int A ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = 2 * 10 * 12 ;
  int Res = 0 ;
  if ( K != 0 ) {
    while ( A < N ) {
      Res ++ ;
      A ++ + K * A ;
    }
  }
  else {
    Res = N - A ;
  }
  System . out . println ( Res ) ;
  return Res ;
}
