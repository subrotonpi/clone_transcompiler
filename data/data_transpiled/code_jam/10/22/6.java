public static void main ( String c ) {
  Scanner scanner = new Scanner ( System . in ) ;
  for ( int cs : xrange ( 1 , Integer . parseInt ( c ) + 1 ) ) {
    int n = scanner . nextInt ( ) ;
    int k = scanner . nextInt ( ) ;
    int b = scanner . nextInt ( ) ;
    int t = scanner . nextInt ( ) ;
    int [ ] x = new int [ n ] ;
    int [ ] v = new int [ n ] ;
    for ( int z = scanner . nextInt ( ) ;
    z > 0 ;
    z -- ) {
      x [ z ] = scanner . nextInt ( ) ;
      v [ z ] = scanner . nextInt ( ) ;
    }
    ArrayList < Pair > hopeful = new ArrayList < > ( ) ;
    ArrayList < Pair > hopeless = new ArrayList < > ( ) ;
    for ( int i : xrange ( 0 , n ) ) {
      int pos = x [ i ] ;
      int speed = v [ i ] ;
      if ( pos + speed * t >= b ) {
        hopeful . add ( new Pair ( pos , speed ) ) ;
      }
      else {
        hopeless . add ( new Pair ( pos , speed ) ) ;
      }
    }
    if ( hopeful . size ( ) < k ) {
      System . out . println ( "Case #" + cs + ": IMPOSSIBLE" ) ;
      continue ;
    }
    int [ ] jumpOvers = new int [ k ] ;
    for ( Pair p1 : hopeful ) {
      int sp1 = p1 . first ;
      int jumpover = 0 ;
      int e1 = p1 . second + sp1 * t ;
      for ( Pair p2 : hopeless ) {
        int sp2 = p2 . second ;
        int e2 = p2 . second + sp2 * t ;
        assert e2 < b ;
        if ( p1 . first < p2 . first && e2 < e1 ) {
          jumpover ++ ;
        }
      }
      jumpOvers [ k ] = jumpover ;
    }
    Arrays . sort ( jumpOvers ) ;
    System . out . println ( "Case #" + cs + ": " + Arrays . toString ( jumpOvers ) ) ;
  }
}
