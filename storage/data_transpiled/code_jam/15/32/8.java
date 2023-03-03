public static final String getExp ( String input ) throws IOException {
  final BufferedReader br = new BufferedReader ( new FileReader ( input ) ) ;
  int tests = Integer . parseInt ( br . readLine ( ) ) ;
  /* Get the offset of the keys and target */
  final Set < Character > s = new HashSet < Character > ( Collections . singleton ( input ) ) ;
  for ( char c : target . toCharArray ( ) ) {
    if ( ! s . contains ( c ) ) {
      return 0 ;
    }
  }
  int offset = 1 ;
  while ( offset < target . length ( ) ) {
    if ( target . substring ( 0 , target . length ( ) - offset ) . equals ( target . substring ( offset ) ) ) {
      break ;
    }
    offset ++ ;
  }
  /* Get the exp of the keys and target */
  final Map < Character , Double > map = new HashMap < Character , Double > ( ) ;
  for ( char c : keys ) {
    map . put ( c , 1.0 / keys . length ( ) ) ;
  }
  double tot = 1.0 ;
  for ( char c : target ) {
    tot *= map . get ( c ) ;
  }
  /* Return the total of the exp of the keys */
  for ( int t = 0 ;
  t < tests ;
  t ++ ) {
    int k = Integer . parseInt ( br . readLine ( ) ) ;
    int l = Integer . parseInt ( br . readLine ( ) ) ;
    int s = Integer . parseInt ( br . readLine ( ) ) ;
    String [ ] keys = new String [ k ] ;
    String [ ] target = new String [ l ] ;
    int offset = getOffset ( keys , target ) ;
    if ( offset == 0 ) {
      System . out . println ( "Case #" + ( t + 1 ) + ": 0.0" ) ;
      continue ;
    }
    int needed = 1 + ( s - target . length ) / offset ;
    double ans = Math . max ( 0.0 , needed - getExp ( keys , target , s ) ) ;
    if ( ans < 0.000000001 ) {
      ans = 0.0 ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
  return input ;
}
