static double choose ( int n , int k ) {
  if ( k > n ) {
    return 0 ;
  }
  double res = 1 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    res *= n - i ;
    res /= i + 1 ;
  }
  for ( int caseIndex = 1 ;
  caseIndex <= 1 ;
  caseIndex ++ ) {
    System . err . print ( String . valueOf ( caseIndex ) + " " ) ;
    int C = Integer . parseInt ( readLine ( ) ) ;
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] r = new int [ C + 1 ] ;
    r [ N ] = 1 ;
    double [ ] [ ] M = new double [ C + 1 ] [ N + 1 ] ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      for ( int b = a ;
      b <= a + N ;
      b ++ ) {
        if ( b <= C ) {
          M [ a ] [ b ] = choose ( a , N - b + a ) * choose ( C - a , b - a ) / ( double ) choose ( C , N ) ;
        }
      }
    }
    res = r [ C ] ;
    for ( int step = 0 ;
    step < 2000 ;
    step ++ ) {
      double [ ] u = new double [ C + 1 ] ;
      for ( int l = 0 ;
      l < C + 1 ;
      l ++ ) {
        for ( int k = 0 ;
        k < C + 1 ;
        k ++ ) {
          u [ l ] += r [ k ] * M [ k ] [ l ] ;
        }
      }
      res += ( step + 2 ) * ( u [ C ] - r [ C ] ) ;
      r = u ;
    }
    System . err . println ( ) ;
  }
  return res ;
}
