public static int previously ( int x ) throws IOException {
  if ( x == 0 ) {
    return 1 ;
  }
  else if ( x == 1 ) {
    return 10 ;
  }
  else {
    int x1 = ( x + 1 ) / 2 ;
    int x2 = x / 2 ;
    int gain = 10 * x1 + 10 * x2 - 1 ;
    return gain + previously ( x - 1 ) ;
  }
  {
    int count = 0 ;
    String s = Integer . toString ( N ) ;
    int x = s . length ( ) ;
    if ( x < 2 ) {
      return N ;
    }
    int tl = ( x + 1 ) / 2 ;
    int tail = N % 10 * tl ;
    if ( tail == 0 ) {
      return 1 + previously ( N - 1 ) ;
    }
    count += tail - 1 ;
    N -= tail - 1 ;
    String revStr = Integer . toString ( N ) . substring ( 0 , N ) ;
    count ++ ;
    if ( Integer . toString ( N ) . equals ( revStr ) ) {
      count -- ;
    }
    count += Integer . parseInt ( revStr ) % 10 * tl ;
    return count + previously ( x - 1 ) ;
  }
  BufferedReader input = new BufferedReader ( new FileReader ( RiskConstants . R_FILE + "./A-large.in" ) ) ;
  String [ ] X = input . readLine ( ) . split ( " " ) ;
  int C = Integer . parseInt ( X [ 0 ] ) ;
  int [ ] [ ] Y = new int [ C ] [ C ] ;
  for ( int j = 0 ;
  j < C ;
  j ++ ) {
    Y [ j ] = Integer . parseInt ( X [ j ] ) ;
  }
  int [ ] sol = new int [ C ] ;
  int j = 0 ;
  for ( int i = 0 ;
  i < xrange ;
  i ++ ) {
    String s = Y [ i ] [ 0 ] ;
    sol [ j ] = next ( s ) ;
    if ( ! i % 10 ) System . out . println ( "case " + ( i + 1 ) + ": " + "done" ) ;
  }
  boolean tofile = true ;
  if ( tofile ) {
    try {
      PrintWriter output = new PrintWriter ( RiskConstants . R_FILE + "./outputA.txt" ) ;
      for ( int i = 0 ;
      i < sol . length ;
      i ++ ) {
        output . println ( "Case #" + ( i + 1 ) + ": " + sol [ i ] ) ;
      }
      output . close ( )