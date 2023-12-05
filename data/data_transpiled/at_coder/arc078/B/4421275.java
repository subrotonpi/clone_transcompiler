public static void print ( String input ) {
  final int N = Integer . parseInt ( input ) ;
  System . setOut ( new PrintStream ( System . out ) ) ;
  final List < Integer > ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    ab . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  final List < Integer > [ ] con = new List [ N + 1 ] ;
  for ( int i = 0 ;
  i < con . length ;
  i ++ ) {
    con [ i ] = new ArrayList < > ( ) ;
    for ( int a = 0 ;
    a < con [ i ] . length ;
    a ++ ) {
      con [ i ] . add ( ab [ a ] . get ( i ) ) ;
      con [ i ] . add ( ab [ b ] . get ( i ) ) ;
    }
  }
  final int [ ] pc = new int [ N + 1 ] ;
  final Queue < Integer > q = new LinkedList < > ( ) ;
  q . add ( new Integer ( 1 ) ) ;
  final boolean [ ] vis = new boolean [ N + 1 ] ;
  vis [ 1 ] = true ;
  int Fcnt = N ;
  while ( q . size ( ) > 0 ) {
    int n = q . poll ( ) ;
    int c = pc [ n ] ;
    pc [ n ] = c ;
    for ( int i = 0 ;
    i < con [ n ] . length ;
    i ++ ) {
      int ch = con [ n ] . charAt ( i ) ;
      if ( vis [ ch ] == true ) continue ;
      vis [ ch ] = true ;
      q . add ( new Integer ( ch ) ) ;
    }
  }
  q . clear ( ) ;
  vis = new boolean [ N + 1 ] ;
  vis [ N ] = true ;
  while ( q . size ( ) > 0 ) {
    int n = q . poll ( ) ;
    int c = pc [ n ] ;
    if ( pc [ n ] > c ) Fcnt -- ;
    for ( int i = 0 ;
    i < con [ n ] . length ;
    i ++ ) {
      int ch = con [ n ] . charAt ( i ) ;
      if ( vis [ ch ] == true ) continue ;
      vis [ ch ] = true ;
      q . add ( new Integer ( ch ) ) ;
    }
  }
  if ( Fcnt > N - Fcnt ) System . out . println ( "Fennec" ) ;
  else System . out . println (