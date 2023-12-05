@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int [ ] [ ] solve ( int [ ] a ) {
  int n = a . length ;
  int [ ] [ ] a = new int [ n ] [ ] ;
  for ( int w : stdin ) {
    a [ w ] = Integer . parseInt ( stdin . readLine ( ) ) ;
  }
  if ( a . length != N ) throw new RuntimeException ( ) ;
  List < List < Integer >> ts = tuples ( m - 1 , N ) ;
  if ( ts . get ( ts . size ( ) - 1 ) . size ( ) == 0 ) return ts ;
  List < Integer > ls = new ArrayList < > ( ) ;
  for ( List < Integer > t : ts . get ( ts . size ( ) - 1 ) ) {
    int lc = t . stream ( ) . filter ( i -> i > 0 ) . findFirst ( ) . orElse ( 1 ) ;
    int mi = t . stream ( ) . filter ( i -> i > 0 ) . findFirst ( ) . orElse ( N + 1 ) ;
    for ( int i = mi - 1 ;
    i > 0 ;
    i -- ) {
      if ( ArrayUtils . contains ( a , i % i ) ) continue ;
      if ( lcm ( lc , i ) > N ) continue ;
      ls . add ( new Integer [ ] {
        i }
        ) ;
      }
    }
    ts . add ( ls ) ;
    return ls . toArray ( new List < Integer > [ ts . size ( ) ] [ ] ) ;
  }
  