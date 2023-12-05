@ VisibleForTesting static void solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Pair > a = new ArrayList < > ( ) ;
  a . add ( new Pair ( n , 1 ) ) ;
  do {
    List < Pair > b = new ArrayList < > ( ) ;
    for ( int d = 0 ;
    d < a . size ( ) ;
    d ++ ) {
      int cnt = a . get ( d ) . second ;
      if ( cnt < k ) {
        k -= cnt ;
        b . add ( new Pair ( ( d - 1 ) / 2 , cnt ) ) ;
        b . add ( new Pair ( d / 2 , cnt ) ) ;
      }
      else {
        return ;
      }
    }
    a . clear ( ) ;
    b . add ( new Pair ( a . get ( d ) , new Pair ( b . get ( d ) , b . get ( d ) ) ) ) ;
    a . clear ( ) ;
    a . add ( new Pair ( a . get ( d ) , new Pair ( b . get ( d ) , b . get ( d ) ) ) ) ;
  }
  while ( a . size ( ) > 1 ) ;
  /* Prepare input */
  boolean local = false ;
  char task = 'C' ;
  int attempt = - 1 ;
  final Scanner scanner = new Scanner ( System . in ) ;
  if ( local ) {
    scanner . useDelimiter ( "\\A" ) ;
  }
  else {
    String filename = attempt >= 0 ? "../" + task + "-small-2-attempt" + attempt : "../" + task + "-large" ;
    scanner . useDelimiter ( "\\A" ) ;
    scanner . useDelimiter ( "\\A" ) ;
    scanner . useDelimiter ( "\\A" ) ;
    System . out . println ( "filename:" + filename . substring ( 3 ) ) ;
  }
  scanner . useDelimiter ( "\\A" ) ;
  int tests = scanner . nextInt ( ) ;
  for ( int test = 1 ;
  test <= tests ;
  test ++ ) {
    String res = solve ( ) ;
    System . out . println ( "Case #" + test + ": " + res ) ;
  }
}
