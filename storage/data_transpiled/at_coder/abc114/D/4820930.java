public static int N = Integer . parseInt ( input ) {
  int [ ] div = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int j = 2 ;
    while ( i != 1 ) {
      if ( i % j == 0 ) {
        i /= j ;
        div [ j ] ++ ;
      }
      else j ++ ;
    }
  }
  int a = 0 , b = 0 , c = 0 , d = 0 , e = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( div [ i ] >= 74 ) {
      a ++ ;
      b ++ ;
      c ++ ;
      d ++ ;
      e ++ ;
    }
    else if ( div [ i ] >= 24 ) {
      a ++ ;
      b ++ ;
      c ++ ;
      d ++ ;
    }
    else if ( div [ i ] >= 14 ) {
      a ++ ;
      b ++ ;
      c ++ ;
    }
    else if ( div [ i ] >= 4 ) {
      a ++ ;
      b ++ ;
      c ++ ;
    }
    else if ( div [ i ] >= 2 ) {
      a ++ ;
    }
  }
  if ( a < 3 || b < 2 ) System . out . println ( 0 ) ;
  else {
    int ans = b * ( b - 1 ) * ( a - 2 ) / 2 ;
    ans += d * ( a - 1 ) ;
    ans += c * ( b - 1 ) ;
    ans += e ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
