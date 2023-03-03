static final String getSortingLine ( ) throws IOException {
  final String [ ] args = new String [ ] {
    "" }
    ;
    final Scanner in = new Scanner ( System . in ) ;
    final int X = Integer . parseInt ( in . nextLine ( ) ) ;
    final List < Integer > srted = new ArrayList < > ( Arrays . asList ( args ) ) ;
    final int [ ] out = new int [ line . length ( ) ] ;
    int ptsRemaining = X ;
    final int [ ] linecopy = line . copy ( ) ;
    int best = 0 ;
    for ( final int n : srted ) {
      if ( Integer . parseInt ( max ( n - l , 0 ) ) <= X ) {
        best = n ;
      }
    }
    final List < Integer > lower = new ArrayList < > ( ) ;
    for ( final Integer l : line ) {
      lower . add ( best - l ) ;
    }
    final int diff = Integer . parseInt ( lower . get ( 0 ) ) ;
    ptsRemaining = X - diff ;
    final double distPts = ptsRemaining / ( double ) lower . size ( ) ;
    final int len = lines . length ;
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
      if ( linecopy [ i ] < best + distPts ) {
        linecopy [ i ] = best + distPts ;
      }
    }
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
      if ( linecopy [ i ] > line . charAt ( i ) ) {
        out [ i ] = 100 * ( linecopy [ i ] - line . charAt ( i ) ) / ( double ) X ;
      }
    }
    return out [ 0 ] ;
  }
  