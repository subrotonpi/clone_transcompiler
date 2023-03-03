public static void main ( String input ) {
  int m = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int res = N ;
  while ( N >= m ) {
    int x = N / m ;
    res += x * n ;
    int k = N - m * x ;
    N = x * n + k ;
  }
  System . out . println ( res ) ;
}
