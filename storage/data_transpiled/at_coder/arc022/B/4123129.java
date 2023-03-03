public static int N = Integer . parseInt ( input ) {
  int [ ] inputs = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int ans = 1 ;
  int right = 0 ;
  boolean [ ] used = new boolean [ 10 * 5 + 1 ] ;
  for ( int left = 0 ;
  left < N ;
  left ++ ) {
    while ( right < N && ! used [ inputs [ right ] ] ) {
      used [ inputs [ right ] ] = true ;
      right ++ ;
    }
    ans = Math . max ( ans , right - left ) ;
    used [ inputs [ left ] ] = false ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
