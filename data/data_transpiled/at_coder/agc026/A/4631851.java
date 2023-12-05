public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int k = 0 ;
  int cnt = 0 ;
  while ( ( k <= N - 2 ) && ( a [ k ] == a [ k + 1 ] ) ) {
    cnt ++ ;
    k += 2 ;
  }
  System . out . println ( cnt ) ;
}
