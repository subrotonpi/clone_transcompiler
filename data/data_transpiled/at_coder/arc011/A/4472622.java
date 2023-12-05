public static void ans ( ) {
  int m = Integer . parseInt ( input . readLine ( ) ) , n = Integer . parseInt ( input . readLine ( ) ) , N = Integer . parseInt ( input . readLine ( ) ) ;
  int cnt = N ;
  while ( N >= m ) {
    int x = N / m * n ;
    cnt += x ;
    N = x + N % m ;
  }
  System . out . println ( cnt ) ;
}
