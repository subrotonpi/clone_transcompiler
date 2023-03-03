public static int [ ] [ ] x ( ) {
  int [ ] [ ] y = new int [ n ] [ n ] ;
  int [ ] xy = new int [ n ] ;
  int [ ] maxlist = new int [ n ] ;
  int [ ] minlist = new int [ n ] ;
  int amax = 0 ;
  int amin = 10 * 10 ;
  int case1 = 0 ;
  int case2 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] store = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      store [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
    if ( store [ 0 ] < store [ 1 ] ) {
      store [ 0 ] = store [ 1 ] ;
      store [ 1 ] = store [ 0 ] ;
    }
    if ( store [ 0 ] == amax ) {
      maxlist [ 0 ] = i ;
    }
    else if ( store [ 0 ] > amax ) {
      amax = store [ 0 ] ;
      maxlist [ 0 ] = i ;
    }
    if ( store [ 1 ] == amin ) {
      minlist [ 0 ] = i ;
    }
    else if ( store [ 1 ] < amin ) {
      amin = store [ 1 ] ;
      minlist [ 0 ] = i ;
    }
    x [ i ] = store [ 0 ] ;
    y [ i ] = store [ 1 ] ;
    xy [ i ] = store ;
  }
  case1 = ( max ( x ) - min ( x ) ) * ( max ( y ) - min ( y ) ) ;
  for ( int k = 0 ;
  k < maxlist . length ;
  k ++ ) {
    if ( minlist [ k ] >= 0 ) {
      System . out . println ( case1 ) ;
      exit ( ) ;
    }
  }
  for ( int index = 0 ;
  index < n ;
  index ++ ) {
    y [ index ] = new int [ n ] ;
    y [ index ] [ 0 ] = y [ index ] ;
  }
  Arrays . sort ( y ) ;
  int bmax = y [ n - 1 ] [ 0 ] ;
  int bmin = y [ 1 ] [ 0 ] ;
  int xmin = 10 * 10 ;
  boolean check = true ;
  int minsum = 10 * 10 ;
  for ( int i = 0 ;
  ! check ;
  i ++ ) {
    if ( x [ y [ i ] ] [ 1 ] < xmin ) {
      xmin = x [ y [ i ] ] [ 1 ] ;
    }
    if