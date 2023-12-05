static final double [ ] [ ] input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] a1 = new double [ n ] [ ] ;
  double [ ] a2 = new double [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans = Math . max ( ans , ( a1 [ i ] [ 0 ] + a2 [ i ] [ 1 ] ) ) ;
  }
  System . out . println ( ans ) ;
}
