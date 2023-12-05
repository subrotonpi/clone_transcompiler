@ VisibleForTesting static void run ( ) {
  final Memoized < String , String > mem = new Memoized < String , String > ( ) {
    @ Override protected String wrapped ( String ... args ) {
      if ( ! mem . contains ( args ) ) {
        mem . put ( args , args ) ;
      }
      return mem . get ( args ) ;
    }
  }
  ;
  final Function < String , Integer > readint = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String infile ) {
      return Integer . parseInt ( infile . nextLine ( ) ) ;
    }
  }
  ;
  final Function < String , Integer > readints = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String infile ) {
      return Integer . parseInt ( infile . nextLine ( ) ) ;
    }
  }
  ;
  final Function < String , Integer > readint = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String infile ) {
      return readint . apply ( infile ) ;
    }
  }
  ;
  final Function < String , Integer > readint = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String infile ) {
      return readint . apply ( infile ) ;
    }
  }
  ;
  final Function < String , Integer > solver = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String infile ) {
      return readint . apply ( infile ) ;
    }
  }
  ;
  final StringBuilder sb = new StringBuilder ( ) ;
  sb . append ( "Initialization " ) . append ( FILE ) . append ( " " ) . append ( FILE ) . append ( "\n" ) ;
  final Scanner scanner = new Scanner ( FILE + ".in" ) ;
  scanner . useDelimiter ( "\n" ) ;
  scanner . scan ( scanner ) ;
  scanner . useDelimiter ( "\n" ) ;
  scanner . scan ( ) ;
  scanner . useDelimiter ( "\n" ) ;
  scanner . scan ( ) ;
  final int cases = scanner . nextInt ( ) ;
  for ( int ncase = 0 ;
  ncase < cases ;
  ncase ++ ) {
    System . out . println ( "Case #" + ( nc + 1 ) ) ;
    final String data = scanner . nextLine ( ) ;
    sb . append ( "Case #" + ( nc + 1 ) + ": " + data ) . append ( "\n" ) ;
  }
  final Set < String > straight_blocks = new HashSet < String > ( ) ;
  straight_blocks . addAll ( dsums ) ;
  