@ VisibleForTesting static Iterable < Integer > best ( int n , int [ ] [ ] grid ) {
  return new Iterable < Integer > ( ) {
    private final Set < Integer > countrow = new HashSet < > ( ) ;
    private final Set < Integer > countcol = new HashSet < > ( ) ;
    private final Set < Integer > countdiag1 = new HashSet < > ( ) ;
    private final Set < Integer > countdiag2 = new HashSet < > ( ) ;
    @ Override public boolean iterator ( ) {
      return ( n & 2 ) == 2 ;
    }
    @ Override public int next ( ) {
      if ( ( n & 1 ) == 1 ) {
        if ( countrow . contains ( i ) ) return false ;
        if ( countcol . contains ( j ) ) return false ;
        if ( ( n & 1 ) == 1 ) {
          if ( countdiag1 . contains ( i + j ) ) return false ;
          if ( countdiag2 . contains ( i - j ) ) return false ;
          if ( ( n & 2 ) == 0 ) {
            countrow . add ( i ) ;
            countcol . add ( j ) ;
          }
          if ( ( n & 1 ) == 1 ) {
            countdiag1 . add ( i + j ) ;
            countdiag2 . add ( i - j ) ;
          }
          grid [ i ] [ j ] |= n & 1 ;
          return true ;
        }
        return false ;
      }
      return true ;
    }
  }
  ;
}
