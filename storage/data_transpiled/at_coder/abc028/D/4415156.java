public static void input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int a = K - 1 , b = N - K ;
  float ans = ( 6 * a * b + 3 * ( a + b ) + 1 ) / ( N * * 3 ) ;
  System . out . println ( "{:.15f}" . format ( ans ) ) ;
}
