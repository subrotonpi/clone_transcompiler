public static void main ( String input ) {
  int m = 0 , n = 0 , N = [ ] ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    ans = N ;
    while ( N >= m ) {
      ans += N / m * n ;
      N = N % m + N / m * n ;
    }
  }
  System . out . println ( ans ) ;
}
