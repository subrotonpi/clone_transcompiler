static final List < Integer > binarySearch = new ArrayList < > ( ) {
  {
    for ( int pw = 2 ;
    pw < 1001 ;
    pw ++ ) {
      for ( int x = 1 ;
      x < 1001 ;
      x ++ ) {
        int nw = x * pw ;
        if ( nw > 1000 ) {
          break ;
        }
      }
    }
  }
}
