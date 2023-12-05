static private void simulate ( ) throws IOException {
  /* do nothing */
  int n = random . nextInt ( left ) ;
  String s ;
  String inputLine ;
  StringBuilder st = new StringBuilder ( ) ;
  int left = children . length ;
  while ( stack . hasNext ( ) ) {
    n = random . nextInt ( left ) ;
    left -- ;
    int c = 0 ;
    for ( int i = 0 ;
    i < stack . length ;
    i ++ ) {
      c += size [ stack . index ( i ) ] ;
      if ( c > n ) break ;
      int chosen = stack . index ( i ) ;
      st . append ( label [ chosen ] ) ;
      stack . remove ( chosen ) ;
      stack . addAll ( children [ chosen ] ) ;
    }
  }
  if ( tfile != null ) tfile . close ( ) ;
  /* solve testcase */
  int limit = 2000 ;
  n = read ( false ) ;
  int [ ] parent = new int [ n + 1 ] ;
  parent [ 0 ] = - 1 ;
  parent [ n ] = read ( false , String . class ) ;
  label = "_" + read ( false , String . class ) ;
  int m = read ( false ) ;
  String [ ] cool = read ( Rettype . class ) ;
  int [ ] ct = new int [ m ] ;
  children = new int [ n + 1 ] ;
  ctemp = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    children [ parent [ i ] ] = read ( false ) ;
    ctemp [ parent [ i ] ] = read ( false ) ;
  }
  int [ ] size = new int [ n + 1 ] ;
  int done = 0 ;
  while ( done < n ) {
    for ( int i = 0 ;
    i <= n ;
    i ++ ) {
      if ( ctemp [ i ] == Set . class ) {
        size [ parent [ i ] ] += size [ i ] ;
        ctemp [ parent [ i ] ] . remove ( i ) ;
        ctemp [ i ] = 0 ;
        done ++ ;
      }
    }
  }
  long start = System . nanoTime ( ) ;
  int simul = 0 ;
  while ( System . nanoTime ( ) < start + 1.5 ) {
    String res = simulate ( children , size , label ) ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( cool [ j ] . contains ( res ) ) ct [ j ] ++ ;
    }
    simul ++ ;
  }
  /* write */
}
