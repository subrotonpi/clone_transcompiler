static final Scanner solve = new Scanner ( System . in ) {
  @ Override public String nextLine ( ) {
    String [ ] tmp = nextLine ( ) . split ( "\\s+" ) ;
    int R = Integer . parseInt ( tmp [ 0 ] ) ;
    int C = Integer . parseInt ( tmp [ 1 ] ) ;
    String [ ] [ ] data = new String [ R ] [ C ] ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      String row = nextLine ( ) . split ( "\\s+" ) ;
      data [ r ] = row ;
    }
    List < List < String >> allowed = new ArrayList < > ( ) ;
    for ( int c = 0 ;
    c < C ;
    c ++ ) {
      allowed . add ( Arrays . asList ( Arrays . asList ( "^" , "v" , "<" , ">" ) ) ) ;
    }
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      for ( int c = 0 ;
      c < C ;
      c ++ ) {
        if ( data [ r ] [ c ] != null ) {
          if ( allowed . get ( r ) . get ( c ) . contains ( "<" ) ) {
            allowed . get ( r ) . remove ( "<" ) ;
          }
          break ;
        }
      }
      for ( int c = C - 1 ;
      c >= 0 ;
      c -- ) {
        if ( data [ r ] [ c ] != null ) {
          if ( allowed . get ( r ) . get ( c ) . contains ( ">" ) ) {
            allowed . get ( r ) . remove ( ">" ) ;
          }
          break ;
        }
      }
      for ( int c = 0 ;
      c < C ;
      c ++ ) {
        for ( int r = 0 ;
        r < R ;
        r ++ ) {
          if ( data [ r ] [ c ] != null ) {
            if ( allowed . get ( r ) . get ( c ) . contains ( "^" ) ) {
              allowed . get ( r ) . remove ( "^" ) ;
            }
            break ;
          }
        }
        for ( int r = R - 1 ;
        r >= 0 ;
        r -- ) {
          if ( data [ r ] [ c ] != null ) {
            if ( allowed . get ( r ) . get ( c ) . contains ( "v" ) ) {
              allowed . get ( r ) . remove ( "v" ) ;
            }
            break ;
          }
        }
      }
    }
    int cnt = 0 ;
    for ( int r = 0 ;
    r < R ;
    r