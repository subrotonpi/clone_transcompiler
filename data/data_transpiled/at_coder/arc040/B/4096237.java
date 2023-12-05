public static int N = Integer . parseInt ( input ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  StringBuilder S = new StringBuilder ( input . nextLine ( ) ) ;
  int ans = - 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans ++ ;
    if ( S . indexOf ( 'o' ) + Arrays . copyOfRange ( S . substring ( i , i + R ) , i + R ) == N ) {
      ans += ( S . indexOf ( 'o' ) != N ) ;
      break ;
    }
    if ( S . charAt ( i ) != '.' ) continue ;
    ans ++ ;
    for ( int j = 0 ;
    j < R ;
    j ++ ) S . setCharAt ( i + j , 'o' ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
