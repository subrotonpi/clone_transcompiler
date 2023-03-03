static final String getSolutionName ( ) throws IOException {
  final String taskName = "B" ;
  InputStream input = null ;
  BufferedReader br = null ;
  String suffix = "" ;
  String input = null ;
  String input = null ;
  String input = "" ;
  String input = "" ;
  String input = "" ;
  input = new FileInputStream ( taskName + "-" + suffix + ".in" ) ;
  PrintWriter output = new PrintWriter ( taskName + "-" + suffix + ".out" ) ;
  int caseCount = input . readInt ( ) ;
  for ( int i = 1 ;
  i <= caseCount ;
  i ++ ) {
    String s = "Case #" + i + ": " + input . toString ( ) ;
    System . out . println ( s ) ;
    input . close ( ) ;
    output . close ( ) ;
    System . out . println ( String . format ( "%s solved in %.3f" , suffix , input . toString ( ) ) ) ;
  }
  if ( className . equals ( "java.util.concurrent.ConcurrentLinkedQueue" ) ) {
    solve ( "small" ) ;
    solve ( "large" ) ;
  }
  else {
    solve ( "large" ) ;
  }
  int height = input . readInt ( ) ;
  int n = input . readInt ( ) ;
  int m = input . readInt ( ) ;
  int [ ] [ ] ceiling = new int [ n ] [ n ] ;
  int [ ] floor = new int [ n ] [ n ] ;
  int [ ] front = new int [ n ] ;
  front [ 0 ] = new int [ n ] ;
  front [ 0 ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    floor [ i ] [ 0 ] = i ;
  }
  int [ ] [ ] edges = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges [ i ] = null ;
  }
  int [ ] edges = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges [ i ] = edges [ i ] ;
  }
  /* make move */
  double t = ( t + height ) / 10.0 ;
  int x1 = x + dx ;
  int y1 = y + dy ;
  if ( edges [ 0 ] == 0 ) {
    return null ;
  }
  if ( height + 50 > ceiling [ x1 ] [ y1 ] ) {
    double delay = ( height