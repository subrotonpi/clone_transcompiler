public static void input ( Scanner in ) {
  int n = in . nextInt ( ) , m = in . nextInt ( ) ;
  int [ ] [ ] edge = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int v = in . nextInt ( ) , u = in . nextInt ( ) ;
    v -- ;
    u -- ;
    edge [ v ] [ i ] = u ;
    edge [ u ] [ i ] = v ;
  }
  int res = 0 ;
  int [ ] label = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( label [ i ] < 0 ) {
      s = i ;
      break ;
    }
  }
  if ( s < 0 ) {
    break ;
  }
  Stack < Integer > st = new Stack < Integer > ( ) ;
  st . push ( s ) ;
  boolean cnt = true ;
  while ( st . size ( ) > 0 ) {
    int v = st . pop ( ) ;
    if ( label [ v ] < 0 ) {
      label [ v ] = res ;
    }
    else if ( label [ v ] == res ) {
      cnt = false ;
    }
    for ( int u : edge [ v ] ) {
      if ( label [ u ] < 0 ) {
        st . push ( u ) ;
      }
    }
  }
  if ( cnt ) {
    res ++ ;
  }
  System . out . println ( res ) ;
}
