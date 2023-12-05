static final int input ( ) {
  int A , B ;
  int ans = Integer . MIN_VALUE ;
  if ( B == 0 ) {
    ans = 0 ;
  }
  else {
    int N = Math . floor ( Math . log2 ( B ) + 1 ) ;
    int A_mod = A % 4 ;
    int B_mod = B % 4 ;
    if ( A_mod < 2 ) {
      if ( B_mod == 1 || B_mod == 2 ) {
        ans ++ ;
      }
    }
    else {
      if ( B_mod == 3 || B_mod == 0 ) {
        ans ++ ;
      }
    }
    for ( int i = 2 ;
    i <= N ;
    i ++ ) {
      A_mod = A % ( 2 * i ) ;
      B_mod = B % ( 2 * i ) ;
      if ( A_mod < 2 * ( i - 1 ) ) {
        if ( B_mod >= 2 * ( i - 1 ) ) {
          ans += ( ( B_mod + 1 ) % 2 ) * ( 2 * ( i - 1 ) ) ;
        }
      }
      else {
        if ( B_mod < 2 * ( i - 1 ) ) {
          ans += ( A_mod % 2 ) * ( 2 * ( i - 1 ) ) ;
        }
        else {
          ans += ( ( A_mod + B_mod + 1 ) % 2 ) * ( 2 * ( i - 1 ) ) ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
