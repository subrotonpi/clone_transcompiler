public static void main ( String input ) {
  int N , M ;
  if ( 2 * N >= M ) {
    ans = M / 2 ;
  }
  else {
    ans = N ;
    M -= 2 * N ;
    ans += M / 4 ;
  }
  System . out . println ( ans ) ;
}
