static final int [ ] [ ] read ( int [ ] [ ] a ) {
  final int [ ] [ ] mem = new int [ a . length ] [ ] ;
  for ( int i = 0 ;
  i < mem . length ;
  i ++ ) {
    dbg ( a [ i ] . toString ( ) ) ;
  }
  {
    int [ ] [ ] a = new int [ M . length ] [ ] ;
    for ( int i = 0 ;
    i < M . length ;
    i ++ ) a [ i ] = read ( a [ i ] ) ;
  }
  {
    int [ ] [ ] a = new int [ M . length ] [ ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) a [ i ] = read ( a [ i ] ) ;
  }
  {
    int [ ] [ ] a = new int [ M . length ] [ ] ;
    for ( int i = 0 ;
    i < M . length ;
    i ++ ) a [ i ] = read ( a [ i ] ) ;
  }
  int [ ] [ ] a = new int [ M . length ] [ ] ;
  for ( int i = 0 ;
  i < M . length ;
  i ++ ) a [ i ] = read ( a [ i ] ) ;
  int [ ] [ ] doit = new int [ M [ M . length ] ] [ ] ;
  for ( int i = 0 ;
  i < M . length ;
  i ++ ) {
    if ( i >= M . length ) return missed > M [ M [ i - M . length ] ? - 1 : 0 ] ;
    if ( ( match = M [ i ] . length ) >= 0 ) return mem [ ( match = M [ i ] . length ) ] ;
    int m1 = i * 2 + 1 ;
    int m2 = i * 2 + 2 ;
    int r1 = doit [ m1 ] [ missed ] ;
    int r2 = doit [ m2 ] [ missed ] ;
    if ( r1 == - 1 || r2 == - 1 ) {
      mem [ ( match = M [ i ] . length ) ] = - 1 ;
      return - 1 ;
    }
    int res = r1 + r2 + a [ i ] ;
    int q1 = doit [ m1 ] [ missed + 1 ] ;
    int q2 = doit [ m2 ] [ missed + 1 ] ;
    if ( q1 >= 0 && q2 >= 0 ) res = Math . min ( res , q1 + q2 ) ;
    mem [ ( match = M [ i ] . length ) ] = res ;
  }
  {
    int [ ] P = new