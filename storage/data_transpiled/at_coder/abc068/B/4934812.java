public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int ans = 1 ;
  while ( ans * 2 <= N ) {
    ans = ans * 2 ;
  }
  return ( ans ) ;
}
