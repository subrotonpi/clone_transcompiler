@ Sys public static int [ ] readInteger ( String strLine ) {
  /* read from stdin */
  int cCase = Integer . parseInt ( rsreadline ( ) ) ;
  for ( int iCase = 0 ;
  iCase < cCase ;
  iCase ++ ) {
    int lines = Integer . parseInt ( rsreadline ( ) ) ;
    String sttree = "" ;
    for ( int i = 0 ;
    i < lines ;
    i ++ ) {
      sttree += rsreadline ( ) ;
    }
    String tree = parse ( sttree ) . toString ( ) ;
    int tasks = Integer . parseInt ( rsreadline ( ) ) ;
    System . out . println ( "Case #" + iCase + ":" ) ;
    for ( int i = 0 ;
    i < tasks ;
    i ++ ) {
      String features = readString ( rsreadline ( ) ) . toString ( ) ;
      System . out . println ( String . format ( "%.8f" , eva ( tree , features ) ) ) ;
    }
  }
  /* read from stdin */
  /* read from stdin */
  String st = readLine ( ) ;
  String t = "" ;
  String rem = "" ;
  if ( st . charAt ( 0 ) == '(' ) {
    t = "(" ;
    rem = st . substring ( 1 ) ;
  }
  else if ( st . charAt ( 0 ) == ')' ) {
    t = ")" ;
    rem = st . substring ( 1 ) ;
  }
  else if ( st . charAt ( 0 ) == '(' ) {
    int s = st . indexOf ( ' ' ) ;
    int end = Math . min ( StreamTokenizer . TT_WORD , s ) ;
    t = st . substring ( 0 , end ) ;
    rem = st . substring ( end ) ;
  }
  else {
    int end = Math . min ( StreamTokenizer . TT_WORD , s ) ;
    t = st . substring ( 0 , end ) ;
    rem = st . substring ( end ) ;
  }
  /* parse */
  String t = st . substring ( 1 ) ;
  if ( t . charAt ( 0 ) != '(' ) {
    throw new AssertionError ( "not started with (" ) ;
  }
  int w = st . indexOf ( ' ' ) ;
  double w = Double . parseDouble ( t ) ;
  float f = Float . parseFloat ( t ) ;
  if ( f == ')' ) {
    return new int [ ] {
      w , f }
      ;
    }
    String left = parse ( st )