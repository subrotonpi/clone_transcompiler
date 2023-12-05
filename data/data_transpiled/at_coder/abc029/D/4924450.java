public static int one ( @ IntRange ( from = 0 ) int N ) {
  int res = 0 ;
  int M = 10 ;
  while ( N / M > 0 ) {
    int R = N % M ;
    res += ( N - R ) / 10 ;
    if ( R * 10 >= M ) {
      if ( R * 10 < 2 * M ) {
        res += R - M / 10 + 1 ;
      }
      else {
        res += M / 10 ;
      }
    }
    else {
      res += 0 ;
    }
    M *= 10 ;
  }
  int R = N % M ;
  if ( R * 10 >= M ) {
    if ( R * 10 < 2 * M ) {
      return res + R - M / 10 + 1 ;
    }
    else {
      return res + M / 10 ;
    }
  }
  return res ;
}
