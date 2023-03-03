@ Test public static void test ( ) throws IOException {
  input = new BufferedReader ( new FileReader ( test + ".in" ) ) ;
  output = new PrintWriter ( test + ".out" ) ;
  /* solve the B and T boxes and toys */
  cache = new HashMap < > ( ) ;
  /* head the N */
  int skip , what [ ] [ ] ;
  /* match the first of the input */
  if ( cache . get ( new Integer ( skip ) ) != null ) {
    /* return the first of the output */
    cache . put ( new Integer ( skip ) , new Integer ( skip ) ) ;
  }
  /* match the first of the output */
  int box = 0 ;
  int box_count = 0 ;
  /* box count */
  int toy = 0 ;
  /* toy count */
  int toy_count = 0 ;
  int res = 0 ;
  if ( box == - 1 || toy == - 1 ) {
    /* skip */
    if ( box == toy ) {
      /* skip */
      m = Math . min ( box_count , toy_count ) ;
      /* match the first of the output */
      cache . put ( new Integer ( box ) , new Integer ( toy ) ) ;
    }
    else {
      /* skip */
      if ( box == toy ) {
        /* skip */
        m = Math . min ( box_count , toy_count ) ;
        /* match the first of the output */
        cache . put ( new Integer ( box ) , new Integer ( toy ) ) ;
      }
    }
    /* match the second of the output */
    res = new Integer ( 0 ) ;
    /* match the first of the output */
    cache . put ( new Integer ( box ) , res ) ;
  }
  /* return the first of the output */
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int t = 0 ;
  t < xrange ( T ) ;
  t ++ ) {
    B = Integer . parseInt ( input . readLine ( ) ) ;
    T = Integer . parseInt ( input . readLine ( ) ) ;
    _boxes = Integer . parseInt ( input . readLine ( ) ) ;
    _toys = Integer . parseInt ( input . readLine ( ) ) ;
  }
  / * ▁ return