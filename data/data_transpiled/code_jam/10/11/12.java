static final Scanner in = new Scanner ( System . in ) {
  private final boolean isA = true ;
  private final Scanner scanner = new Scanner ( System . in ) ;
  private void dbg ( String a ) {
    System . err . println ( a . toString ( ) ) ;
  }
  public int readInt ( ) {
    return Integer . parseInt ( scanner . nextLine ( ) ) ;
  }
  public float readFloat ( ) {
    return Float . parseFloat ( scanner . nextLine ( ) ) ;
  }
  public List < String > readArray ( Function < String , String > foo ) {
    return Arrays . asList ( foo . apply ( scanner . nextLine ( ) ) ) ;
  }
  private void runTest ( int test ) {
    final int n = scanner . nextInt ( ) ;
    final int k = scanner . nextInt ( ) ;
    final List < List < String >> a = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < xrange ( n ) ;
    i ++ ) {
      a . add ( Collections . reverseOrder ( scanner . nextLine ( ) . replace ( "." , "" ) ) ) ;
    }
    final boolean check [ ] = new boolean [ ] {
      false , false }
      ;
      for ( int i = 0 ;
      i < xrange ( n ) ;
      i ++ ) {
        for ( int j = 0 ;
        j < xrange ( a . get ( i ) . size ( ) ) ;
        j ++ ) {
          final boolean ok [ ] = {
            true , true , true , true }
            ;
            for ( int t = 0 ;
            t < k ;
            t ++ ) {
              final Iterator < Integer > it = a . get ( i ) . iterator ( ) ;
              final int s = it . next ( ) ;
              final int r = it . next ( ) ;
              final int c = it . next ( ) ;
              if ( ( r >= n ) || ( c < 0 ) || ( c >= a . get ( r ) . size ( ) ) || ( a . get ( r ) . get ( c ) != a . get ( i ) . get ( j ) ) ) {
                ok [ s ] = false ;
              }
            }
            if ( ( ok [ 0 ] || ok [ 1 ] || ok [ 2 ] || ok [ 3 ] ) ) {
              check [ a . get ( i ) . get ( j ) ] = true ;
            }
          }
        }
        String res = "Neither" ;
        if ( check [ 0 ] && check [ 1 ] ) res = "Both" ;
        if ( check [ 0 ] && ! check [ 2 ] )