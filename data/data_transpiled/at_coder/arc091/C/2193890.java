public static int N ( int N , int A , int B ) {
  if ( N < ( A + B - 1 ) || N > ( A * B ) ) {
    System . out . println ( - 1 ) ;
    exit ( 0 ) ;
  }
  if ( B == 1 && A == N ) {
    StringBuilder sb = new StringBuilder ( ) ;
    for ( int n = 1 ;
    n <= N ;
    n ++ ) sb . append ( String . valueOf ( n ) ) ;
    System . out . println ( sb . toString ( ) ) ;
    exit ( 0 ) ;
  }
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int num = N - A + 1 ;
  num <= N ;
  num ++ ) sb . append ( String . valueOf ( num ) ) ;
  int dif = ( A * B - N ) ;
  int div = ( A * B - 1 ) ;
  return div ;
}
