public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  byte [ ] s = Byte . parseByte ( input ) ;
  int [ ] ali = new int [ n ] ;
  int [ ] bli = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ali [ i ] = 0 ;
    bli [ i ] = 0 ;
  }
  final int [ ] remain = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = Integer . parseInt ( input ) ;
    int v = Integer . parseInt ( input ) ;
    graphAB [ u ] = v ;
    graphAB [ v ] = u ;
  }
  {
    int node = Integer . parseInt ( input ) ;
    int i = Integer . parseInt ( input ) ;
    int j = Integer . parseInt ( input ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int u = Integer . parseInt ( input ) ;
      int v = Integer . parseInt ( input ) ;
      graphAB [ u ] = v ;
      graphAB [ v ] = u ;
    }
  }
  {
    int node = Integer . parseInt ( input ) ;
    int i = Integer . parseInt ( input ) ;
    int j = Integer . parseInt ( input ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( s [ j - 1 ] == 65 ) {
        ali [ node - 1 ] ++ ;
      }
      if ( s [ j - 1 ] == 66 ) {
        bli [ node - 1 ] ++ ;
      }
    }
  }
  {
    int node = Integer . parseInt ( input ) ;
    if ( i == 0 && i == 0 ) {
      remain [ i - 1 ] = 0 ;
    }
    else {
      for ( int j : graphAB [ i ] ) {
        incrementAB ( i , j ) ;
      }
      if ( ! adjAB ( i ) ) {
        visitset . add ( i ) ;
        remain [ i - 1 ] = 0 ;
      }
    }
  }
  while ( Boolean . TRUE . equals ( visitset . get ( 0 ) ) ) {
    int i = visitset . get ( 0 ) ;
    for ( int j : StreamUtils . stream ( graphAB [ i ] ) ) {
      decrementAB ( j , i ) ;
      if ( ! adjAB ( j ) ) {
        visitset . add ( j ) ;
        remain [ j - 1 ] = 0 ;
      }
    }
  }
  if ( new HashSet <