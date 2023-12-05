public static void input ( ) {
  int m = Integer . parseInt ( input . readLine ( ) ) , n = Integer . parseInt ( input . readLine ( ) ) , N = Integer . parseInt ( input . readLine ( ) ) ;
  int num = N ;
  int mod = 0 ;
  do {
    N += mod ;
    if ( N < m ) break ;
    num += ( N / m ) * n ;
    mod = N % m ;
    N = ( N / m ) * n ;
  }
  while ( mod > 0 ) ;
}
