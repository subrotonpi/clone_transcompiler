public static int N ( ) {
  int ans = 0 ;
  int c = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    ans += ( int ) ( ( A + c ) / 2 ) ;
    if ( A >= 2 && ( A + c ) % 2 != 0 ) {
      c = 1 ;
    }
    else {
      c = 0 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
