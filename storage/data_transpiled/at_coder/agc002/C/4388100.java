static final Scanner input = new Scanner ( System . in ) {
  private float inf = Float . MAX_VALUE ;
  private int n = Integer . parseInt ( input . nextLine ( ) ) ;
  private int L = Integer . parseInt ( input . nextLine ( ) ) ;
  private int [ ] a = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] + a [ i - 1 ] >= L ) {
      System . out . println ( "Possible" ) ;
      for ( int j = 1 ;
      j < i ;
      j ++ ) System . out . println ( j ) ;
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
}
