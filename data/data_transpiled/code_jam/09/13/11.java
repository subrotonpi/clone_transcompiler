static final String [ ] args ( ) {
  BufferedReader in = null ;
  BufferedReader out = null ;
  /* Run main */
  String name = args [ 0 ] . substring ( 0 , args [ 0 ] . length ( ) - 3 ) ;
  String inFileName = name + ".in" ;
  String outFileName = name + ".out" ;
  if ( args . length == 2 ) {
    inFileName = args [ 1 ] ;
    outFileName = inFileName . substring ( 0 , inFileName . length ( ) - 3 ) + ".out" ;
  }
  if ( args . length == 3 ) {
    if ( args [ 1 ] != null ) {
      inFileName = args [ 1 ] ;
    }
    if ( args [ 2 ] != null ) {
      outFileName = args [ 2 ] ;
    }
  }
  /* Run tests */
  if ( inFileName . equals ( "-" ) ) in = System . in ;
  else in = new BufferedReader ( new FileReader ( inFileName ) ) ;
  if ( outFileName . equals ( "-" ) ) out = System . out ;
  else out = new PrintWriter ( new FileWriter ( outFileName ) ) ;
  /* Run tests */
  /* Run test */
  int t = readinteger ( ) ;
  for ( int x = 0 ;
  x < t ;
  x ++ ) {
    /* Run test */
    doTestCase ( x + 1 ) ;
  }
  /* Run main */
  String nextLine = in . readLine ( ) . substring ( 0 , in . read ( ) . length ( ) - 1 ) ;
  /* writeline */
  out . println ( nextLine ) ;
  /* Read integer */
  int i = Integer . parseInt ( nextLine ) ;
  /* Read integers */
  String [ ] integers = nextLine . split ( " " ) ;
  for ( int i = 0 ;
  i < Range . values ( ) . length ;
  i ++ ) {
    integers [ i ] = Integer . parseInt ( integers [ i ] ) ;
  }
  return integers ;
}
