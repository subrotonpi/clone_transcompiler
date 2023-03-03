public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    s [ i ] = x ;
  }
  /* multi the list */
  int ret = 1 ;
  for ( int i : li ) {
    ret *= i ;
  }
  if ( 0 == s . length ) {
    System . out . println ( N ) ;
    quit ( ) ;
  }
  int j = 0 ;
  int ans = 0 ;
  int score = 1 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( j < i ) {
      j = i ;
    }
    do {
      if ( j + 1 <= N && score * s [ j ] <= K ) {
        score *= s [ j ] ;
        j ++ ;
        ans = Math . max ( ans , j - i ) ;
      }
      else {
        if ( ! i == j ) {
          score /= s [ i ] ;
        }
        break ;
      }
    }
    while ( i < s . length ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
