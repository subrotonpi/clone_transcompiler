static final String input ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = input . nextInt ( ) ;
  }
  int oddNum = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( A [ i ] % 2 == 1 ) {
      oddNum ++ ;
    }
  }
  System . out . println ( oddNum % 2 == 0 ? "YES" : "NO" ) ;
  return A [ oddNum ] ;
}
