static int n = Integer . parseInt ( new Scanner ( System . in ) . nextInt ( ) ) {
  int m = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int ... a = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  Set < Integer > b = new HashSet < > ( ) ;
  for ( int i = a . length - 1 ;
  i >= 0 ;
  i -- ) {
    if ( ! b . contains ( a [ i ] ) ) {
      b . add ( a [ i ] ) ;
      System . out . println ( a [ i ] ) ;
    }
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( ! b . contains ( i ) ) {
      System . out . println ( i ) ;
    }
  }
  return m ;
}
