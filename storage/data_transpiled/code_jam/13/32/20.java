static final String getSingleTest ( ) throws IOException {
  /* First pass in a file */
  int X = Integer . parseInt ( in . nextLine ( ) ) ;
  int Y = Integer . parseInt ( in . nextLine ( ) ) ;
  int x = 0 , y = 0 ;
  StringBuffer result = new StringBuffer ( ) ;
  int step = 1 ;
  do {
    double E = X - x + Math . random ( ) ;
    double N = Y - y + Math . random ( ) ;
    double W = - E + Math . random ( ) ;
    double S = - N + Math . random ( ) ;
    double d = Math . max ( E , N , W , S ) ;
    int nx = x , ny = y ;
    char r = 'O' ;
    if ( E == d ) {
      nx += step ;
      r = 'E' ;
    }
    else if ( N == d ) {
      ny += step ;
      r = 'N' ;
    }
    else if ( W == d ) {
      nx -= step ;
      r = 'W' ;
    }
    else if ( S == d ) {
      ny -= step ;
      r = 'S' ;
    }
    if ( Math . abs ( X - nx ) + Math . abs ( Y - ny ) < Math . abs ( X - x ) + Math . abs ( Y - y ) ) {
      step ++ ;
      result . append ( r ) ;
      x = nx ;
      y = ny ;
    }
    else {
      break ;
    }
  }
  while ( ( x = ( X ) . compareTo ( y ) ) != 0 ) ;
  /* Second pass in a file */
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    /* Write the output */
    result . append ( "Case #" + i + ": " + singleTest ( i , in ) ) ;
  }
  /* If file is not specified then it is created */
  if ( className . equals ( "java.io.File" ) ) {
    assert args . length == 2 ;
    InputStream IN = new FileInputStream ( args [ 0 ] ) ;
    OutputStream OUT = new FileOutputStream ( args [ 1 ] . substring ( 0 , args [ 1 ] . length ( ) - 3 ) + ".out" ) ;
    Main . main ( IN , OUT ) ;
    OUT . close ( ) ;
    IN . close ( ) ;
  }
  return result . toString ( ) ;
  