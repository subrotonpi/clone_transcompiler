@ GwtIncompatible ( "java.util.regex.Pattern" ) private static Iterable < Integer > board ( List < List < String >> rows ) {
  int n = rows . get ( 0 ) . size ( ) * 4 ;
  return rows . stream ( ) . map ( row -> {
    int m = row . size ( ) ;
    int n = row . size ( ) ;
    for ( int r : xrange ( m ) ) {
      for ( int c : xrange ( n ) ) {
        if ( row . get ( r ) . get ( c ) == 2 ) continue ;
        int ns = findsquare ( row , r , c ) ;
        yield ( ns , - r , - c ) ;
      }
    }
    return null ;
  }
  ) . flatMap ( board -> {
    Map < Integer , Integer > result = new HashMap < > ( ) ;
    int m = board . size ( ) ;
    int n = board . size ( ) ;
    while ( true ) {
      try {
        int n = max ( squares ( board ) ) ;
        int r = max ( squares ( board ) ) ;
        int c = max ( squares ( board ) ) ;
        result . put ( n , result . getOrDefault ( n , 0 ) + 1 ) ;
        fill ( board , - r , - c , n ) ;
      }
      catch ( IllegalArgumentException e ) {
        return result ;
      }
    }
  }
  ) . flatMap ( board -> {
    for ( int i : xrange ( r , r + n ) ) {
      for ( int j : xrange ( c , c + n ) ) {
        board . put ( i , j , 2 ) ;
      }
    }
    return null ;
  }
  ) . flatMap ( board -> findsquare ( board , r , c ) ) ;
  int x = board . get ( r ) . get ( c ) ;
  try {
    for ( int s = 1 ;
    s <= n ;
    s ++ ) {
      for ( int j = c ;
      j <= c + s ;
      j ++ ) {
        x = 1 - x ;
        if ( board . get ( r + s ) . get ( j ) != x ) return s ;
      }
      for ( int i = r + s - 1 ;
      i >= r ;
      i -- ) {
        x = 1 - x ;
        if ( board . get ( i ) . get ( c + s ) != x ) return s ;
      }
    }
  }
  catch ( NoSuchElementException e ) {
    return null ;
  }
  return new Iterable < Integer > ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return new Iterator < Integer > ( ) {
        @ Override