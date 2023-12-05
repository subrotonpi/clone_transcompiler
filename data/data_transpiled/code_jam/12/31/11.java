static final Scanner getScanner ( ) {
  System . setOut ( new PrintStream ( System . out ) {
    private boolean dfs ( List < List < Integer >> graph , boolean [ ] visited , int i ) {
      visited [ i ] = true ;
      for ( int v : graph . get ( i ) ) {
        if ( visited [ v ] ) {
          return true ;
        }
        else if ( dfs ( graph , visited , v ) ) {
          return true ;
        }
      }
      return false ;
    }
  }
  ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= t ;
  testCase ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    graph = new ArrayList < List < Integer >> ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      graph . add ( new ArrayList < Integer > ( ) ) ;
    }
    boolean found = false ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      visited = new boolean [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        visited [ j ] = false ;
      }
      if ( ! visited [ i ] ) {
        if ( dfs ( graph , visited , i ) ) {
          found = true ;
          break ;
        }
      }
    }
    System . out . println ( "Case #" + testCase + ": " + ( found ? "Yes" : "No" ) ) ;
  }
  return new Scanner ( System . in ) ;
}
