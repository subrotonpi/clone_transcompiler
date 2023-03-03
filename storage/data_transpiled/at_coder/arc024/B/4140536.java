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
    int X = 1 ;
    int tmp = 1 ;
    for ( int i = 0 ;
    i < inputs . length ;
    i ++ ) {
      if ( inputs [ i ] == inputs [ i - 1 ] ) {
        tmp ++ ;
      }
      else {
        X = Math . max ( X , tmp ) ;
        tmp = 1 ;
      }
    }
    int ans ;
    if ( X % 2 == 1 ) {
      ans = X / 2 + 1 ;
    }
    else {
      ans = X / 2 ;
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
