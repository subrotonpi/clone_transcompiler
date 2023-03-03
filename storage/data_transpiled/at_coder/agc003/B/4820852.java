public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  int prev = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( A == 0 ) {
      prev = 0 ;
      continue ;
    }
    A += prev ;
    ans += A / 2 ;
    prev = A % 2 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
