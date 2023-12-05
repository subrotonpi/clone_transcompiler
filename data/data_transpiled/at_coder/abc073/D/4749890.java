@ VisibleForTesting static int [ ] [ ] floydWarshall ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > rs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rs . add ( i ) ;
  }
  int [ ] [ ] edge = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    edge [ a ] [ b ] = c ;
    edge [ b ] [ a ] = c ;
  }
  int [ ] [ ] dist = floydWarshall ( edge , false ) ;
  @ SuppressWarnings ( "unused" ) int ans = Integer . MAX_VALUE ;
  for ( int [ ] v : rs ) {
    double distTmp = 0 ;
    for ( int i = 0 ;
    i < r - 1 ;
    i ++ ) {
      distTmp += dist [ v [ i ] - 1 ] [ v [ i + 1 ] - 1 ] ;
    }
    ans = Math . min ( ans , ( int ) distTmp ) ;
  }
  System . out . println ( ans ) ;
  return edge ;
}
