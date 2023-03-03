public static int input ( ) {
  int k = 0 ;
  int ans = 0 ;
  for ( char b : a ) {
    if ( ( b == 'A' ) || ( b == 'C' ) || ( b == 'G' ) || ( b == 'T' ) ) {
      k = k + 1 ;
    }
    else {
      if ( ans < k ) ans = k ;
      k = 0 ;
    }
  }
  if ( ans < k ) ans = k ;
  return ans ;
}
