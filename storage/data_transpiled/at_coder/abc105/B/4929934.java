public static String enter ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  String ans = "No" ;
  for ( int i = 0 ;
  i < n / 4 + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n / 7 + 1 ;
    j ++ ) {
      if ( 4 * i + 7 * j == n ) {
        ans = "Yes" ;
        break ;
      }
    }
    else {
      continue ;
    }
    break ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
