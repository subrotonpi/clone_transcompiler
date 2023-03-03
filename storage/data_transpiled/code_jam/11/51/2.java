static final String foo3 ( double x , double [ ] [ ] aa ) {
  double sum = Double . parseDouble ( x ) ;
  int n = aa . length ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double [ ] a = aa [ i ] ;
    if ( a [ 0 ] >= sum ) {
      if ( i == 0 ) return a [ 1 ] ;
      return a [ 1 ] + ( aa [ i ] [ 1 ] - aa [ i - 1 ] [ 1 ] + 0.0 ) / ( aa [ i ] [ 0 ] - aa [ i ] [ 0 ] ) * ( sum - aa [ i ] [ 0 ] ) ;
    }
  }
  {
    int n = Integer . parseInt ( iScanner . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ofile . printf ( "Case #%s:%s\n" , i + 1 , foo ( iScanner ) ) ;
      ofile . flush ( ) ;
    }
  }
  {
    int n = Integer . parseInt ( iScanner . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ofile . printf ( "Case #%s:%s\n" , i + 1 , foo ( iScanner ) ) ;
    }
  }
  {
    int n = Integer . parseInt ( iScanner . nextLine ( ) ) ;
    double sum = 0.0 ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      double t1 = sum ;
      double t2 = sum ;
      sum += ( t2 - t1 ) * ( t2 - t1 ) / 2.0 ;
      if ( cur + a1 <= sum ) {
        cur += a1 ;
        continue ;
      }
      double left = area - cur ;
      double d1 = sum ;
      double delta = ( t2 - t1 ) / ( t2 - t1 ) ;
      double x ;
      if ( delta == 0 ) x = left / d1 ;
      else {
        double DD = ( d1 * d1 + left * delta * 2 ) * 0.5 ;
        x = ( DD - d1 ) / delta ;
      }
      double [ ] res = new double [ n ] ;
      sum += dd [ i + 1 ] ;
      dd [ 0 ] = res ;
      return sum + t1 ;
    }
  }
  {
    int W = Integer . parseInt ( iScanner . nextLine ( ) ) ;
    int L = Integer . parseInt ( iScanner . nextLine ( ) ) ;
    int U = Integer . parseInt ( iScanner . nextLine ( ) ) ;
    int G = Integer . parseInt ( iScanner . nextLine