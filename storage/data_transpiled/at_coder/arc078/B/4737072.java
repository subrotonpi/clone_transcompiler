public static void main ( String input ) {
  Map < Integer , List < Integer >> nl = new HashMap < Integer , List < Integer >> ( ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int b = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    if ( nl . containsKey ( a - 1 ) ) {
      nl . get ( a - 1 ) . add ( b - 1 ) ;
    }
    else {
      nl . put ( a - 1 , new ArrayList < Integer > ( ) ) ;
    }
    if ( nl . containsKey ( b - 1 ) ) {
      nl . get ( b - 1 ) . add ( a - 1 ) ;
    }
    else {
      nl . put ( b - 1 , new ArrayList < Integer > ( ) ) ;
    }
  }
  int [ ] fenl = new int [ n ] ;
  int [ ] sunl = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    fenl [ i ] = - 1 ;
    sunl [ i ] = - 1 ;
  }
  fenl [ 0 ] = 1 ;
  sunl [ n - 1 ] = 1 ;
  List < Integer > now = new ArrayList < Integer > ( 0 ) ;
  while ( now . size ( ) > 0 ) {
    List < Integer > tmp = new ArrayList < Integer > ( ) ;
    for ( int _n = 0 ;
    _n < now . size ( ) ;
    _n ++ ) {
      for ( int nxt : nl . get ( _n ) ) {
        if ( fenl [ nxt ] == - 1 ) {
          tmp . add ( nxt ) ;
          fenl [ nxt ] = fenl [ _n ] + 1 ;
        }
      }
    }
    now = tmp ;
  }
  now = new ArrayList < Integer > ( n - 1 ) ;
  while ( now . size ( ) > 0 ) {
    List < Integer > tmp = new ArrayList < Integer > ( ) ;
    for ( int _n = 0 ;
    _n < now . size ( ) ;
    _n ++ ) {
      for ( int nxt : nl . get ( _n ) ) {
        if ( sunl [ nxt ] == - 1 ) {
          tmp . add ( nxt ) ;
          sunl [ nxt ] = sunl [ _n ] + 1 ;
        }
      }
    }
    now = tmp ;
  }
  int fm = 0 , sm = 0 ;
  for ( int i = 0 ;
  i < n