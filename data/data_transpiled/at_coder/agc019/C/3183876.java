@ VisibleForTesting static int [ ] [ ] binarySearch ( ) {
  int x1 = Integer . parseInt ( input . readLine ( ) ) , y1 = Integer . parseInt ( input . readLine ( ) ) , x2 = Integer . parseInt ( input . readLine ( ) ) , y2 = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] src = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src [ i ] = new int [ N ] ;
  Arrays . sort ( src ) ;
  if ( x1 > x2 ) {
    x1 = x2 ;
    x2 = x1 ;
    y1 = y2 ;
    y2 = y1 ;
  }
  double arc = 5 * Math . PI ;
  if ( x1 == x2 ) {
    if ( y1 > y2 ) y1 = y2 ;
    y2 = y1 ;
    double ans = 100 * ( y2 - y1 ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( src [ j ] == x1 && y1 < src [ j ] && src [ j ] < y2 ) {
        ans += arc * 2 - 20 ;
        break ;
      }
    }
    System . out . println ( ans ) ;
    exit ( ) ;
  }
  if ( y1 == y2 ) {
    if ( x1 > x2 ) x1 = x2 ;
    x2 = x1 ;
    double ans = 100 * ( x2 - x1 ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( src [ j ] == y1 && src [ j ] < x2 ) {
        ans += arc * 2 - 20 ;
        break ;
      }
    }
    System . out . println ( ans ) ;
    exit ( ) ;
  }
  if ( y1 < y2 ) {
    int [ ] lis = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( src [ j ] < x1 ) continue ;
      if ( src [ j ] > x2 ) break ;
      if ( ! y1 <= src [ j ] && src [ j ] < y2 ) continue ;
      int i = Arrays . binarySearch ( lis , src [ j ] ) ;
      if ( i == lis . length ) lis [ i ] = src [ j ] ;
      else lis [ i ] = src [ j ] ;
    }
    double ans = 100 * ( x2 - x1 + y2 - y1 ) ;
    if ( lis . length == ( x2 - x1 + 1 ) || lis . length == y2 + 1 ) {
      ans += ( lis .