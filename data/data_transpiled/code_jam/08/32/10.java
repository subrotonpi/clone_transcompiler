static final void main ( String [ ] args ) throws IOException {
  final String FILE_NAME = "B-small-attempt2" ;
  final String INPUT_FILE = FILE_NAME + ".in" ;
  final String OUTPUT_FILE = FILE_NAME + ".out" ;
  /* Is this an ugly? */
  if ( n % 2 == 0 ) {
    /* Is this an ugly? */
    return ;
  }
  if ( n % 3 == 0 ) {
    /* Is this an ugly? */
    return ;
  }
  if ( n % 5 == 0 ) {
    /* Is this an ugly? */
    return ;
  }
  if ( n % 7 == 0 ) {
    /* Is this an ugly? */
    return ;
  }
  int count = 0 ;
  /* Recur */
  int idx = args . length - 1 ;
  int [ ] digit = ArrayUtil . intArray ( args ) ;
  for ( int k = 0 ;
  k < 3 * ( args . length - 1 ) ;
  k ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      sol [ j ] = k % 3 ;
      k = k / 3 ;
    }
    int result = 0 ;
    int num = digit [ 0 ] ;
    int lastOp = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( sol [ i ] != 0 ) {
        switch ( lastOp ) {
          case 0 : result = num ;
          break ;
          case 1 : result = result + num ;
          break ;
          case 2 : result = result - num ;
          break ;
        }
        lastOp = sol [ i ] ;
        num = digit [ i + 1 ] ;
      }
      else {
        num = num * 10 + digit [ i + 1 ] ;
      }
    }
    if ( lastOp == 0 ) {
      result = num ;
      break ;
      case 1 : result = result + num ;
      break ;
      case 2 : result = result - num ;
      break ;
    }
    if ( result % 2 == 0 || result % 3 == 0 || result % 5 == 0 || result % 7 == 0 ) {
      count = count + 1 ;
    }
  }
  /* Process case */
  int count = 0 ;
  int [ ] sol = new int [ args . length - 1 ] ;
  recur ( 0 , sol , args ) ;
  System . out . println ( "Case #" + testCase + ": " + count ) ;
  /* Main */
  fpIn = new BufferedReader ( new FileReader ( INPUT_FILE ) )