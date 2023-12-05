public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int A = N * N ;
  int B = ( N + 1 ) * N ;
  int P = 1 ;
  int ans = 1 ;
  while ( true ) {
    if ( A <= A / P * P < B ) ans = A / P ;
    else if ( A <= ( A + P - 1 ) / P * P < B ) ans = ( A + P - 1 ) / P ;
    else break ;
    P *= 100 ;
  }
  System . out . println ( ans ) ;
}
