public static Holidog aHolidog ( int N ) {
  if ( N == 1 ) {
    return Holidog . BOWWOW ;
  }
  int total = N * ( N + 1 ) / 2 ;
  Holidog ans = Holidog . BOWWOW ;
  for ( int k = 2 ;
  k <= ( int ) total ;
  k ++ ) {
    if ( total % k == 0 ) {
      break ;
    }
  }
  return ans ;
}
