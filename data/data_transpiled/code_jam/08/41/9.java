@ VisibleForTesting static int solve ( int ls ) {
  final int INF = 2 * 20 ;
  int [ ] types = new int [ ls ] ;
  int i ;
  int res ;
  int n = 0 ;
  int v ;
  int ls = 0 ;
  for ( i = 0 ;
  i < ls ;
  i ++ ) {
    if ( i == 0 ) {
      return i == 0 ? 0 : i ;
    }
    v = i == 1 ? 1 : i ;
    if ( i > ls ) {
      return i == 0 ? 0 : i ;
    }
    if ( ( n = i + 1 ) > ls ) {
      return i == 0 ? 0 : i ;
    }
    if ( ( n = i + 1 ) > ls ) {
      return i ;
    }
  }
  if ( ( n = 0 ) >= ls ) {
    return i ;
  }
  if ( ( n = 0 ) >= ls ) {
    return i ;
  }
  int res = INF ;
  for ( boolean v0 = true ;
  ;
  v0 = false ) {
    for ( boolean v1 = true ;
    v1 = false ;
    ) {
      for ( int t = 0 ;
      t < 0 ;
      t ++ ) {
        if ( v != i != i && ( v = i + 1 ) != calc ( v0 , t , v1 ) ) continue ;
        int o ;
        if ( changeable [ n ] && t != types [ n ] ) o = 1 ;
        else if ( t == types [ n ] ) o = 0 ;
        else continue ;
        res = Math . min ( res , solve ( 2 * n , v0 ) + solve ( 2 * n + 1 , v1 ) + o ) ;
      }
    }
  }
  solve ( ) ;
  solve ( ) ;
  int cases = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( i = 0 ;
  i < cases ;
  i ++ ) {
    int m = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    v = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    ls = ( m - 1 ) / 2 ;
    types = new int [ m + 1 ] ;
    changeable [ 0 ] = true ;
    for ( i = 0 ;
    i < ls ;
    i ++ ) {
      int nt = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      int nc = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      types [ i ] = nt == 1 ? 'AND' : 'OR' ;
      changeable [ i ] = Boolean . valueOf ( nc ) ;
    }
    for ( i