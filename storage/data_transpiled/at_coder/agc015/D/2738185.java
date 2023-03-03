static final int input ( ) {
  int A = Integer . parseInt ( input ( ) ) ;
  int B = Integer . parseInt ( input ( ) ) ;
  if ( B < A ) A = B ;
  if ( A == B ) {
    System . out . println ( 1 ) ;
  }
  else {
    int t = ( int ) Math . floor ( Math . log2 ( B ) ) ;
    while ( ( A & 2 * * t ) == ( B & 2 * * t ) ) {
      if ( A & 2 * * t ) {
        A -= 2 * * t ;
        B -= 2 * * t ;
      }
      t -- ;
    }
    int ans = 2 * * t - A ;
    int r = t - 1 ;
    while ( 2 * * t + 2 * * r > B && r >= 0 ) r -- ;
    int C = 2 * * ( r + 1 ) ;
    if ( C < A ) ans += C + 2 * * t - A ;
    else ans += 2 * * t ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
