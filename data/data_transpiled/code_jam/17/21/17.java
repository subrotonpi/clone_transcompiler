static final String [ ] getSolutionNames ( ) {
  System . setProperty ( "idea.test.solution" , "true" ) ;
  /* read line */
  do {
    String s = readLine ( ) . trim ( ) ;
    if ( s != null ) {
      return s . split ( " " ) ;
    }
  }
  while ( true ) ;
  /* read list */
  int [ ] cases = new int [ ] {
  }
  ;
  /* read single case */
  int D = Integer . parseInt ( readLine ( ) ) ;
  int N = Integer . parseInt ( readLine ( ) ) ;
  int [ ] horses = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    horses [ i ] = readLine ( ) ;
  }
  /* load cases */
  Scanner scanner = new Scanner ( new File ( path ) ) ;
  int n = Integer . parseInt ( scanner . nextLine ( ) ) ;
  cases = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) cases [ i ] = loadSingleCase ( scanner ) ;
  /* solve cases */
  int D = scanner . nextInt ( ) ;
  int [ ] horses = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) horses [ i ] = ( int ) ( horses [ i ] - 1 ) / S ;
  /* write out cases */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    horses [ i ] = scanner . nextInt ( ) ;
  }
  /* process cases */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int n = scanner . nextInt ( ) ;
    int o = scanner . nextInt ( ) ;
    System . out . println ( "Case #" + ( n + 1 ) + ": " + outcomeString ( o ) ) ;
  }
  /* process cases */
  if ( scanner . hasNext ( ) ) {
    scanner . nextLine ( ) ;
  }
  /* test solutions */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int c = scanner . nextInt ( ) ;
    int o = solve ( c ) ;
    if ( ! verifyOutcome ( c , o ) ) {
      System . out . println ( "Wrong outcome!" ) ;
      System . out . println ( "Case #" + c ) ;
      System . out . println