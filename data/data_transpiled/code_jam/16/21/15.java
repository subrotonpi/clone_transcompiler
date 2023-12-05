static final void solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  outp = new PrintWriter ( System . out ) ;
  String [ ] words = {
    "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
    ;
    Vector < Character > m = new Vector < Character > ( ) ;
    m . addElement ( new Character ( 0 ) ) ;
    m . addElement ( new Character ( 'Z' ) ) ;
    m . addElement ( new Character ( 2 ) ) ;
    m . addElement ( new Character ( 4 ) ) ;
    m . addElement ( new Character ( 'W' ) ) ;
    m . addElement ( new Character ( 6 ) ) ;
    m . addElement ( new Character ( 'X' ) ) ;
    m . addElement ( new Character ( 7 ) ) ;
    m . addElement ( new Character ( 5 ) ) ;
    m . addElement ( new Character ( 'V' ) ) ;
    m . addElement ( new Character ( 1 ) ) ;
    m . addElement ( new Character ( 'O' ) ) ;
    m . addElement ( new Character ( 3 ) ) ;
    m . addElement ( new Character ( 'R' ) ) ;
    m . addElement ( new Character ( 8 ) ) ;
    m . addElement ( new Character ( 'H' ) ) ;
    m . addElement ( new Character ( 9 ) ) ;
    /* solve */
    String x = in . readLine ( ) ;
    int [ ] f = new int [ 10 ] ;
    Iterator < Character > iterator = m . elements ( ) ;
    while ( iterator . hasNext ( ) ) {
      char d = iterator . next ( ) ;
      int cnt = x . indexOf ( c ) ;
      f [ d ] += cnt ;
      for ( char c2 : words [ d ] ) {
        x = x . replace ( c2 , "" , cnt ) ;
      }
    }
    assert x . equals ( "" ) ;
    for ( int i = 0 ;
    i < 10 ;
    i ++ ) {
      outp . print ( ( i + 1 ) * f [ i ] ) ;
    }
    print ( ) ;
    int T = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      outp . print ( "Case #" + ( i + 1 ) + ": " ) ;
      solve ( ) ;
      