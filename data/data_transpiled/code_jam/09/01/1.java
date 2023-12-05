@ BeforeClass public static void init ( ) throws IOException {
  String filepath = "" ;
  String fileprefix = "A-large" ;
  String filepathname = filepath + fileprefix ;
  String infilename = filepathname + ".in" ;
  String outfilename = filepathname + ".out" ;
  String [ ] lines = Files . readAllLines ( Paths . get ( infilename ) , Charset . defaultCharset ( ) ) . split ( "\n" ) ;
  PrintWriter out = new PrintWriter ( outfilename ) ;
  int linenum = 1 ;
  String [ ] vars = lines [ 0 ] . split ( "\\s+" ) ;
  int cases = Integer . parseInt ( vars [ 2 ] ) ;
  int l = Integer . parseInt ( vars [ 0 ] ) ;
  int d = Integer . parseInt ( vars [ 1 ] ) ;
  String [ ] words = lines [ 1 ] . substring ( 0 , d + 1 ) . split ( "\\s+" ) ;
  linenum = d + 1 ;
  /* explode */
  ArrayList < ArrayList < String >> r = new ArrayList < ArrayList < String >> ( ) ;
  ArrayList < String > curset = new ArrayList < String > ( ) ;
  boolean inset = false ;
  for ( int i = 0 ;
  i < words . length ;
  i ++ ) {
    switch ( words [ i ] . charAt ( 0 ) ) {
      case '(' : inset = true ;
      break ;
      case ')' : inset = false ;
      r . add ( curset ) ;
      curset = new ArrayList < String > ( ) ;
      break ;
      case inset : curset . add ( words [ i ] ) ;
      break ;
      default : r . add ( new ArrayList < String > ( ) ) ;
      break ;
    }
  }
  /* solve */
  String [ ] possible = words . clone ( ) ;
  String [ ] exploded = explode ( words ) ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    ArrayList < String > nposs = new ArrayList < String > ( ) ;
    for ( int j = 0 ;
    j < possible . length ;
    j ++ ) {
      if ( exploded [ j ] . indexOf ( possible [ i ] ) >= 0 ) nposs . add ( possible [ j ] ) ;
    }
    possible = nposs . toArray ( new String [ nposs . size ( ) ] ) ;
  }
  for ( int casenum = 1 ;
  casenum <= cases ;
  casenum ++ ) {
    int out = solve ( lines [ linenum ++ ] ) ;
    