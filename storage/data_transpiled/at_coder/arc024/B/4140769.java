public static int N = Integer . parseInt ( input ) {
  int [ ] inputs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs [ i ] = Integer . parseInt ( input . next ( ) ) ;
  }
  Arrays . sort ( inputs ) ;
  int ans ;
  if ( Sets . newHashSet ( inputs ) . size ( ) == 1 ) {
    ans = - 1 ;
  }
  else {
    int length = 1 ;
    int maxLength = 1 ;
    for ( int i = 0 ;
    i < inputs . length ;
    i ++ ) {
      if ( inputs [ i - 1 ] == inputs [ i ] ) {
        length ++ ;
      }
      else {
        maxLength = Math . max ( maxLength , length ) ;
        maxLength = 1 ;
      }
    }
    ans = maxLength / 2 ;
    if ( maxLength % 2 == 1 ) {
      ans ++ ;
    }
  }
  return ans ;
}
