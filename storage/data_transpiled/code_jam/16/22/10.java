static final String solve ( ) {
  System . setOut ( new PrintStream ( System . out ) ) ;
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  PrintWriter outp = new PrintWriter ( System . out ) ;
  int minv = Integer . parseInt ( new String ( '0' ) + minv ) ;
  int maxv = Integer . parseInt ( new String ( '0' ) + minv ) ;
  int C = Integer . parseInt ( new String ( '9' ) + minv ) ;
  int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    outp . println ( "Case #" + ( i + 1 ) ) ;
    solve ( ) ;
  }
  int X = 0 ;
  int Y = 0 ;
  if ( in . read ( ) != - 1 ) {
    X = Integer . parseInt ( in . read ( ) ) * ( 10 ) ;
  }
  if ( in . read ( ) != - 1 ) {
    Y = Integer . parseInt ( in . read ( ) ) * ( 10 ) ;
  }
  if ( in . read ( ) != - 1 ) {
    Y = Integer . parseInt ( in . read ( ) ) * ( 10 ) ;
  }
  if ( in . read ( ) != - 1 ) {
    Y = Integer . parseInt ( in . read ( ) ) * ( 10 ) ;
  }
  if ( in . read ( ) != - 1 ) {
    if ( in . read ( ) < - 1 ) {
      return "?" ;
    }
    else if ( in . read ( ) > - 1 ) {
      return "?" ;
    }
    int R = Integer . parseInt ( in . read ( ) ) ;
    return "?" ;
  }
  if ( in . read ( ) != - 1 ) {
    if ( in . read ( ) < - 1 ) {
      return "?" ;
    }
    else if ( in . read ( ) > - 1 ) {
      return "?" ;
    }
    int C = Integer . parseInt ( in . read ( ) ) ;
    if ( in . read ( ) != - 1 ) {
      return "?" ;
    }
    else if ( in . read ( ) == - 1 ) {
      return "?" ;
    }
    else if ( in . read ( ) < - 1 ) {
      return "?" ;
    }
  }
  outp . println ( "?" ) ;
  return "?" ;
}
