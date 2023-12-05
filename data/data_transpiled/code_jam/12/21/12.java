public static void wcs ( int [ ] score , int points ) {
  Arrays . sort ( score ) ;
  int pos = 0 ;
  points = 1.0 * points ;
  if ( ( Integer . valueOf ( score [ pos ] + points ) ) / score . length > Integer . MAX_VALUE ) {
    return ( Integer . valueOf ( score [ pos ] + points ) ) / score . length ;
  }
  while ( ( points > 0 ) && ( pos < ( s . length - 1 ) ) ) {
    int alloc ;
    if ( pos >= ( s . length - 1 ) ) {
      alloc = points / s . length ;
      points = 0 ;
    }
    else {
      alloc = Math . min ( points / ( pos + 1 ) , s [ pos + 1 ] - s [ pos ] ) ;
      points -= alloc * ( pos + 1 ) ;
    }
    for ( int i = 0 ;
    i < pos + 1 ;
    i ++ ) {
      s [ i ] += alloc ;
    }
    if ( points == 0 ) {
      return ;
    }
    pos ++ ;
  }
  /* Find fraction */
  double [ ] result = new double [ score . length ] ;
  int tot = score . length ;
  int lo = 0 , hi = tot ;
  while ( ( hi - lo ) > 1e-7 ) {
    double mid = ( hi + lo ) / 2. ;
    double s1 = score [ mid ] ;
    double s2 = wcs ( others , tot - mid ) ;
    if ( s1 > s2 ) {
      hi = mid ;
    }
    else {
      lo = mid ;
    }
  }
  /* Solve */
  result [ 0 ] = 0 ;
  int tscore = score . length ;
  double target = Math . max ( max ( scores ) , 2 * tscore / scores . length ) ;
  for ( int i = 0 ;
  i < scores . length ;
  i ++ ) {
    result [ i ] = 100. * ( target - scores [ i ] ) / tscore ;
  }
  /* Solve */
  result [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < scores . length ;
  i ++ ) {
    int [ ] other = new int [ scores . length ] ;
    for ( int j = 0 ;
    j < other . length ;
    j ++ ) {
      other [ j ] = scores [ i ] ;
    }
    result [ i ] = findFraction ( scores [ i ] , other ) * 100 ;
  }
  /* Print response */
  out . println ( response ) ;
}
