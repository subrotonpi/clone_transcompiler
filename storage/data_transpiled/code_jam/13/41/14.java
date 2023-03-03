@ VisibleForTesting static void readInts ( ) throws IOException {
  FileInputStream fis = new FileInputStream ( "A-large.in" ) ;
  FileOutputStream ff = new FileOutputStream ( "output" ) ;
  Function < Integer , Integer > readint = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  Function < Integer , Integer > readintarray = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  int T = readint . get ( ) ;
  for ( int casex = 1 ;
  casex <= T ;
  casex ++ ) {
    int N = readintarray . get ( ) ;
    int M = readintarray . get ( ) ;
    int [ ] off = new int [ M ] ;
    int [ ] on = new int [ M ] ;
    Set < Integer > stations = new HashSet < Integer > ( ) ;
    int cost0 = 0 ;
    for ( int x = 0 ;
    x < M ;
    x ++ ) {
      int o = readintarray . get ( ) ;
      int e = readintarray . get ( ) ;
      int p = readintarray . get ( ) ;
      cost0 += ( ( e - o ) * N - ( e - o ) * ( e - o - 1 ) / 2 ) * p ;
      on [ o ] += p ;
      off [ e ] += p ;
      stations . add ( o ) ;
      stations . add ( e ) ;
    }
    Arrays . sort ( stations ) ;
    System . out . println ( "Case #" + casex + ":" ) ;
    ArrayList < ArrayList < Integer >> tickets = new ArrayList < ArrayList < Integer >> ( ) ;
    int cost1 = 0 ;
    for ( int s : stations ) {
      if ( on [ s ] > 0 ) {
        tickets . add ( new ArrayList < Integer > ( s ) ) ;
      }
      if ( off [ s ] > 0 ) {
        int offs = off [ s ] ;
        while ( ++ offs > 0 ) {
          int t = tickets . get ( s ) . get ( 0 ) ;
          int n = tickets . get ( s ) . get ( 0 ) ;
          if ( n >= offs ) {
            cost1 += ( ( s - t ) * N - ( s - t ) * ( s - t - 1 ) / 2 ) * offs ;
            tickets . set ( t , n