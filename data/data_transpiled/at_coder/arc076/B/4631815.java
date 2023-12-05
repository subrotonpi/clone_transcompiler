public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] city = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    city [ i ] = new int [ ] {
      x , y , i }
      ;
    }
    List < Edge > edges = new ArrayList < > ( ) ;
    Collections . sort ( city ) ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      int dist = city [ i + 1 ] [ 0 ] - city [ i ] [ 0 ] ;
      edges . add ( new Edge ( dist , city [ i ] [ 2 ] , city [ i + 1 ] [ 2 ] ) ) ;
    }
    Collections . sort ( city , new Comparator < Edge > ( ) {
      @ Override public int compare ( Edge o1 , Edge o2 ) {
        int dist = city [ i + 1 ] [ 1 ] - city [ i ] [ 1 ] ;
        edges . add ( new Edge ( dist , city [ i ] [ 2 ] , city [ i + 1 ] [ 2 ] ) ) ;
        return dist ;
      }
    }
    ) ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      int dist = city [ i + 1 ] [ 1 ] - city [ i ] [ 1 ] ;
      edges . add ( new Edge ( dist , city [ i ] [ 2 ] , city [ i + 1 ] [ 2 ] ) ) ;
    }
    Collections . sort ( edges ) ;
    int ans = 0 ;
    int [ ] uf = new int [ n ] ;
    /* root of the edge */
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int rx = uf [ i ] ;
      int ry = uf [ i ] ;
      if ( rx == ry ) return ;
      if ( rx > ry ) rx = ry ;
      uf [ i ] = uf [ i ] ;
      uf [ i ] += uf [ ry ] ;
      uf [ ry ] = rx ;
      return true ;
    }
    for ( Edge dist : edges ) {
      int from = dist . getFrom ( ) ;
      int to = dist . getTo ( ) ;
      if ( unite ( from , to ) ) ans += dist . getDistance ( ) ;
    }
    System . out . println ( ans )