public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = ( N % 2 == 0 ? N * ( N - 1 ) / 2 - N / 2 : N * ( N - 1 ) / 2 - ( N - 1 ) / 2 ) ;
  int s = N % 2 == 0 ? N + 1 : N ;
  String ans = Integer . toString ( M ) + '\n' + StringUtils . join ( i , j ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) for ( int j = i + 1 ;
  j <= N ;
  j ++ ) if ( i + j != s ) ans += "\n" ;
  System . out . println ( ans ) ;
}
