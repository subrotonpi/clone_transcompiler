static final Scanner input = new Scanner ( System . in ) {
  @ Override public void next ( ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    List < List < Integer >> t = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      t . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
    }
  }
  private boolean dfs ( int q , int x ) {
    if ( q == n ) {
      if ( x == 0 ) {
        return true ;
      }
      else {
        return false ;
      }
    }
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      if ( dfs ( q + 1 , x ^ t . get ( q ) . get ( i ) ) ) {
        return true ;
      }
    }
    return false ;
  }
}
