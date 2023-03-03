static final void print ( String s ) throws IOException {
  final BufferedReader in = new BufferedReader ( new FileReader ( s ) ) ;
  final PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( s ) ) ) ;
  final boolean DEBUG = 1 || System . getenv ( "DEBUG" ) . equals ( "1" ) ;
  if ( DEBUG ) {
    System . setErr ( new PrintStream ( System . err ) ) ;
  }
  /* debug (what) */
  if ( DEBUG ) {
    System . err . println ( "[DEBUG] " + Arrays . toString ( Arrays . copyOf ( what , what . length ) ) ) ;
  }
  final long L = 1000000007 ;
  for ( int testCase : xrange ( input -> {
    /* debug */
    if ( DEBUG ) {
      System . err . println ( "[DEBUG] " + Arrays . toString ( Arrays . copyOf ( what , what . length ) ) ) ;
    }
    return ;
  }
  ) ) {
    final long L = 1000000007 ;
    for ( int testCase : xrange ( input -> {
      /* debug */
      if ( DEBUG ) {
        System . err . println ( "[DEBUG] " + Arrays . toString ( Arrays . copyOf ( what , what . length ) ) ) ;
      }
      return ;
    }
    ) ) {
      /* debug */
      if ( DEBUG ) {
        System . err . println ( "[DEBUG] " + Arrays . toString ( Arrays . copyOf ( what , what . length ) ) ) ;
      }
    }
    final long n = Integer . parseInt ( in . readLine ( ) ) ;
    final long m = Integer . parseInt ( in . readLine ( ) ) ;
    final long X = Integer . parseInt ( in . readLine ( ) ) ;
    final long Y = Integer . parseInt ( in . readLine ( ) ) ;
    final long Z = Integer . parseInt ( in . readLine ( ) ) ;
    final long [ ] A = new long [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      A [ i ] = input . readLine ( ) ;
    }
    /* debug n m X Y Z */
    final long [ ] S = new long [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      S [ i ] = A [ i % m ] ;
      A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
    }
    /* debug */
    System . out . println ( "S" +