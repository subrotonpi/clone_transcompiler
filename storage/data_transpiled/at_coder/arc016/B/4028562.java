public static int N = Integer . parseInt ( input ) {
  boolean [ ] flag = new boolean [ 9 ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String inputs = input . next ( ) ;
    ans += inputs . indexOf ( 'x' ) ;
    for ( int j = 0 ;
    j < inputs . length ( ) ;
    j ++ ) {
      if ( inputs . charAt ( j ) == 'o' && flag [ j ] ) continue ;
      else if ( inputs . charAt ( j ) == 'o' && ! flag [ j ] ) {
        flag [ j ] = true ;
      }
      else if ( flag [ j ] ) {
        flag [ j ] = false ;
        ans ++ ;
      }
    }
  }
  return ans ;
}
