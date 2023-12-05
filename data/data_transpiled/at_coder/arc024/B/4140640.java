public static int N = Integer . parseInt ( input ) {
  int [ ] inputs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs [ i ] = Integer . parseInt ( input . next ( ) ) ;
  }
  Arrays . sort ( inputs ) ;
  if ( Sets . newHashSet ( inputs ) . size ( ) == 1 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int maxLength = 1 ;
    int length = 1 ;
    for ( int i = 0 ;
    i < inputs . length ;
    i ++ ) {
      if ( inputs [ i ] == inputs [ i - 1 ] ) {
        length ++ ;
      }
      else {
        maxLength = Math . max ( maxLength , length ) ;
        length = 1 ;
      }
    }
    int ans = maxLength / 2 ;
    System . out . println ( maxLength % 2 == 1 ? ans + 1 : ans ) ;
  }
  return ans ;
}
