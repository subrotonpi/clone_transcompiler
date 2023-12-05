@ String ( "A-small-attempt0" ) public static void main ( String filename ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
  String line = null ;
  int MAX_NUM = 1000000 ;
  int [ ] [ ] HAPPY = new int [ 11 ] [ ] ;
  for ( int i : xrange ( HAPPY . length ) ) {
    HAPPY [ i ] = new int [ MAX_NUM ] ;
    HAPPY [ i ] [ 1 ] = 1 ;
  }
  /* radix */
  int [ ] digits = new int [ MAX_NUM ] ;
  while ( num != 0 ) {
    digits [ 0 ] = num % base ;
    num = num / base ;
  }
  /* ishappy */
  HashMap < Integer , Boolean > seen = new HashMap < Integer , Boolean > ( ) ;
  do {
    if ( HAPPY [ base ] [ num ] != - 1 ) {
      for ( Integer x : seen . keySet ( ) ) HAPPY [ base ] [ x ] = HAPPY [ base ] [ num ] ;
      return HAPPY [ base ] [ num ] ;
    }
    int tot = 0 ;
    seen . put ( num , true ) ;
    for ( int digit : radix ( num , base ) ) tot += digit * digit ;
    if ( seen . containsKey ( tot ) ) {
      for ( Integer x : seen . keySet ( ) ) HAPPY [ base ] [ x ] = 0 ;
      return ;
    }
    num = tot ;
  }
  while ( true ) ;
  PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( filename + ".out" ) ) ) ;
  int T = Integer . parseInt ( line . trim ( ) ) ;
  int testCase = 1 ;
  for ( int i = 1 ;
  i < lines . length ;
  i ++ ) {
    int [ ] bases = Arrays . stream ( line . trim ( ) . split ( "\\s+" ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    print ( bases ) ;
    boolean printed = false ;
    for ( int num : xrange ( 2 , MAX_NUM ) ) {
      boolean found = true ;
      for ( int base : bases ) {
        if ( ishappy ( num , base ) == 0 ) {
          found = false ;
          break ;
        }
      }
      if ( found ) {
        printed = true ;
        System . out . println ( "Case #" + testCase + ": " + num ) ;
        out . println ( "Case #" + testCase +