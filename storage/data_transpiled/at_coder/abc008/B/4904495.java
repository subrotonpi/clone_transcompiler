public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = input . nextInt ( ) ;
  }
  int res = 0 ;
  int temp = 0 ;
  for ( int i : new HashSet < Integer > ( s ) ) {
    temp = 0 ;
    for ( int j : s ) {
      if ( i == j ) {
        temp ++ ;
      }
    }
    res = Math . max ( res , temp ) ;
  }
  for ( int i : new HashSet < Integer > ( s ) ) {
    if ( s . stream ( ) . mapToInt ( i -> i ) . sum ( ) == res ) {
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
}
