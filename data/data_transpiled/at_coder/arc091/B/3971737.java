public static void print ( int N , int K ) {
  int count = 0 ;
  for ( int b = K + 1 ;
  b <= N ;
  b ++ ) {
    int tmp = ( N / b ) * ( b - K ) + Math . max ( N % b - K + 1 , 0 ) ;
    count += tmp ;
  }
  System . out . println ( K > 0 ? count : count - N ) ;
}
