static final String toString ( ) {
  final Memoize memoize = new Memoize ( ) {
    private final Map < Integer , Boolean > cache ;
    private final Map < Integer , Boolean > theMap ;
    private final int T ;
    private final Map < Integer , Boolean > theMap ;
    private final Set < Integer > path ;
    private final Set < Integer > path ;
    private final Set < Integer > path ;
    private final Set < Integer > path ;
    private final Set < Integer > path ;
    private final Set < Integer > basinList = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < W ;
    i ++ ) {
      for ( int y = 0 ;
      y < W ;
      y ++ ) {
        int fs = basinList . get ( y ) . get ( x ) ;
        if ( ! lookup . containsKey ( fs ) ) {
          lookup . put ( fs , next = ( char ) ( next + 1 ) ) ;
        }
        basinList . set ( y , lookup . get ( fs ) ) ;
      }
    }
    private final String key = "" ;
    private final Set < Integer > basinList = new HashSet < Integer > ( ) ;
    private final int T = Integer . parseInt ( System . in ) ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      theMap . clear ( ) ;
      H = theMap . size ( ) ;
      W = theMap . get ( 0 ) . intValue ( ) ;
      for ( int j = 0 ;
      j < H ;
      j ++ ) {
        theMap . add ( Integer . parseInt ( System . in ) ) ;
      }
      basinList . add ( theMap ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
      for ( Integer [ ] row : basinList ) {
        System . out . println ( row [ j ] ) ;
      }
    }
    private final Set < Integer > findDirections ( Map < Integer , Integer > theMap ) {
      int H = theMap . size ( ) ;
      int W = theMap . get ( 0 ) . intValue ( ) ;
      int [ ] dirs = {
        ( int ) ( H - 1 ) , bestVal = theMap . get ( 0 ) . intValue ( ) }
        ;
        List < Integer > dirMap = new ArrayList < Integer > ( ) ;
        for ( int y = 0 ;
        y < H ;
        y ++ ) {
          Integer [ ] row = new Integer [ W ] ;
          for ( int x = 0 ;
          x < W