public static int input ( ) {
  int N = S . length ( ) ;
  int ans = 0 ;
  Iterator < Character > iterator = S . iterator ( ) ;
  while ( iterator . hasNext ( ) ) {
    char c = iterator . next ( ) ;
    if ( c == 'U' ) {
      ans += ( N - i - 1 ) + 2 * i ;
    }
    else {
      ans += i + 2 * ( N - i - 1 ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
