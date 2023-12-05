public static double f ( double [ ] ps , int k ) {
  int tnum = Integer . parseInt ( readLine ( ) ) ;
  double [ ] tdyn = new double [ k + 1 ] ;
  for ( int i = 0 ;
  i < tnum ;
  i ++ ) {
    tdyn [ i ] = 0. ;
  }
  dyn [ 0 ] = 1. ;
  for ( double p : ps ) {
    tdyn = dyn ;
    dyn = new double [ tdyn . length ] ;
    for ( int i = 0 ;
    i < tdyn . length ;
    i ++ ) {
      dyn [ i ] = ( 1 - p ) * tdyn [ i ] + p * tdyn [ Math . max ( i - 1 , 0 ) ] ;
    }
  }
  double [ ] ret = f ( ps , k ) ;
  for ( int i = 0 ;
  i < ps . length ;
  i ++ ) {
    double SS = 0. ;
    double MM = 0. ;
    for ( int j = i ;
    j < ps . length ;
    j ++ ) {
      SS += ps [ j ] ;
      MM = Math . max ( MM , ps [ j ] ) ;
      double t = ( SS + u ) / ( j - i + 1 ) ;
      if ( t < MM ) continue ;
      if ( j + 1 < ps . length && t > ps [ j + 1 ] - 1e-5 ) continue ;
      t = Math . min ( t , 1. ) ;
      ret = Math . max ( ret , f ( ps , 0 , i , t * ( j - i + 1 ) + ps , k ) ) ;
    }
  }
  return ret ;
  for ( int ti = 0 ;
  ti < tnum ;
  ti ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int k = Integer . parseInt ( readLine ( ) ) ;
    double u = Double . parseDouble ( readLine ( ) . trim ( ) ) ;
    double [ ] ps = new double [ n ] ;
    for ( int i = 0 ;
    i < ps . length ;
    i ++ ) {
      ps [ i ] = Double . parseDouble ( readLine ( ) . trim ( ) ) ;
    }
    Arrays . sort ( ps ) ;
    double ans = g ( ps , k , u ) ;
    while ( ( n -- > 0 ) && ( ans > 0 ) ) {
      if ( ps [ n - 1 ] + u < 1. ) break ;
      u -= 1. - ps [ n - 1 ] ;
      k = Math . max ( 0 , k - 1 ) ;
      ps = ps [ n - 1 ] ;
      