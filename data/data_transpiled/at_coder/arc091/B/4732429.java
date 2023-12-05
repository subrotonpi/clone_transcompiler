public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = 0 ;
  for ( int b = 1 ;
  b <= N ;
  b ++ ) {
    int p = N / b ;
    a += p * Math . max ( 0 , b - K ) ;
    a += Math . max ( 0 , N % b - K + 1 ) ;
  }
  return a ;
}
