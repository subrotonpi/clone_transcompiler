public static void print ( int m , int n , int N ) {
  int ans = Integer . parseInt ( input . nextLine ( ) ) ;
  ans = N ;
  while ( N >= m ) {
    ans += N / m * n ;
    N = N / m * n + N % m ;
  }
  System . out . println ( ans ) ;
}
