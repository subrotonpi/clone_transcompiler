public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int tmp = 0 ;
    for ( int j = 0 ;
    j < String . valueOf ( i ) . length ( ) ;
    j ++ ) {
      tmp += Integer . parseInt ( String . valueOf ( i ) . charAt ( j ) ) ;
    }
    if ( A <= tmp && tmp <= B ) {
      ans += i ;
    }
  }
  return ans ;
}
