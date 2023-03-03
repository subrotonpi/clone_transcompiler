public static int T = Integer . parseInt ( Scanner in ) {
  int N = in . nextInt ( ) ;
  int M = in . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    System . out . printf ( "Case #%d:" , testCase ) ;
    N = in . nextInt ( ) ;
    M = in . nextInt ( ) ;
    ArrayList < Timepoint > events = new ArrayList < > ( ) ;
    int original = 0 ;
    for ( int i = xrange ( M ) ;
    i < N ;
    i ++ ) {
      int b = in . nextInt ( ) ;
      int e = in . nextInt ( ) ;
      int p = in . nextInt ( ) ;
      events . add ( new Timepoint ( b , 0 , p ) ) ;
      events . add ( new Timepoint ( e , 1 , p ) ) ;
      original += p * cost ( e , b ) ;
    }
    Collections . sort ( events ) ;
    ArrayList < Timepoint > tickets = new ArrayList < > ( ) ;
    int mincost = 0 ;
    for ( Timepoint timepoint : events ) {
      int etype = in . nextInt ( ) ;
      int amount = in . nextInt ( ) ;
      if ( etype == 0 ) {
        tickets . add ( new Timepoint ( timepoint , amount ) ) ;
      }
      else {
        int s = amount ;
        while ( s > 0 ) {
          if ( tickets . get ( tickets . size ( ) - 1 ) . getValue ( ) == 0 ) {
            tickets . remove ( tickets . size ( ) - 1 ) ;
          }
          int t = Math . min ( tickets . get ( tickets . size ( ) - 1 ) . getValue ( ) , s ) ;
          s -= t ;
          tickets . get ( tickets . size ( ) - 1 ) . getValue ( ) - = t ;
          mincost += t * cost ( timepoint , tickets . get ( tickets . size ( ) - 1 ) . getValue ( ) ) ;
        }
      }
    }
    System . out . println ( original - mincost ) % 1000002013 ;
  }
  return N ;
}
