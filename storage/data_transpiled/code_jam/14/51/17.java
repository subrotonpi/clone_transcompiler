public static double solve ( int N , int p , int q , int r , int s ) {
  int [ ] items = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) items [ i ] = ( i * p + q ) % r + s ;
  double _sum = sum ( items ) ;
  double part = _sum / 3 ;
  double part1 = 0 ;
  double part2 = 0 ;
  double part3 = 0 ;
  int i = 0 ;
  int j = N - 1 ;
  while ( part1 + items [ i ] < part ) {
    part1 += items [ i ++ ] ;
  }
  while ( part3 + items [ j ] < part ) {
    part3 += items [ j -- ] ;
  }
  if ( i == j ) {
    return ( part1 + part3 ) / _sum ;
  }
  else {
    double ans = 0.0 ;
    double _part1 = part1 ;
    double _part3 = part3 ;
    double _part2 = _sum - _part1 - _part3 ;
    ans = Math . max ( ans , ( _sum - Math . max ( _part1 , _part2 , _part3 ) ) / _sum ) ;
    _part1 = part1 + items [ i ++ ] ;
    _part3 = part3 ;
    double _part2 = _sum - _part1 - _part3 ;
    ans = Math . max ( ans , ( _sum - Math . max ( _part1 , _part2 , _part3 ) ) / _sum ) ;
    _part1 = part1 + items [ i ++ ] ;
    _part3 = part3 + items [ j ++ ] ;
    ans = Math . max ( ans , ( _sum - Math . max ( _part1 , _part2 , _part3 ) ) / _sum ) ;
    _part1 = part1 ;
    _part3 = part3 ;
    int _i = i ;
    int _j = j ;
    while ( _i <= _j ) {
      _part1 += items [ _i ++ ] ;
      _part2 = _sum - _part1 - _part3 ;
      ans = Math . max ( ans , ( _sum - Math . max ( _part1 , _part2 , _part3 ) ) / _sum ) ;
      if ( _part1 == Math . max ( _part1 , _part2 ) ) break ;
      _j -- ;
    }
    return ans ;
  }
}
