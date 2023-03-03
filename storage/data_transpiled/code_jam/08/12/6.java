static final String [ ] [ ] getHCList ( ) {
  class HornClause {
    private final Set < String > neg ;
    private final Set < String > pos ;
    @ SuppressWarnings ( "unchecked" ) final int n ;
    private final int c = Integer . parseInt ( new String ( ) ) ;
    @ SuppressWarnings ( "unchecked" ) final List < HornClause > list = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < c ;
    i ++ ) {
      final List < String > nl = new ArrayList < > ( ) ;
      String pos = null ;
      final List < Integer > ll = new ArrayList < > ( ) ;
      for ( int x = 0 ;
      x < n ;
      x ++ ) {
        ll . add ( Integer . parseInt ( new String ( ) ) ) ;
      }
      while ( ( ll . size ( ) > 0 ) && ( ! neg . contains ( ll . get ( 0 ) ) ) ) {
        final int var = Integer . parseInt ( ll . get ( 0 ) ) ;
        final int negated = Integer . parseInt ( ll . get ( 0 ) ) ;
        if ( ( negated != 0 ) && ( ( pos == null ) || ( pos . isEmpty ( ) ) ) ) {
          if ( ( pos == null ) || ( pos . isEmpty ( ) ) ) {
            throw new IllegalArgumentException ( ) ;
          }
          pos = var ;
        }
        else {
          nl . add ( var ) ;
        }
      }
      list . add ( new HornClause ( nl , pos ) ) ;
    }
    private boolean hCTest ( final List < HornClause > hCList , final int n ) {
      Set < String > posVar = new HashSet < > ( ) ;
      final Set < String > emptySet = new HashSet < > ( ) ;
      for ( HornClause hc : hCList ) {
        if ( ( ( ( HornClause ) hc ) . neg . containsAll ( emptySet ) ) && ( ( ( HornClause ) hc ) . pos . isEmpty ( ) ) ) {
          posVar . add ( hc . pos ) ;
        }
      }
      boolean c = true ;
      while ( ( c = false ) && ( ! c ) ) {
        c = false ;
        for ( HornClause hc : hCList ) {
          if ( ( ( HornClause ) hc ) . neg . containsAll ( posVar ) ) {
            if ( ( ( HornClause ) hc ) . pos == null ) {
              return false ;
            }
            if ( ( ! ( ( HornClause ) hc ) . pos . isEmpty ( )