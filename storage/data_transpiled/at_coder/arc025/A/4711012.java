static final void print ( ) {
  final String input = System . console ( ) . readLine ( ) ;
  final int [ ] d = copyOf ( map ( input , 4 ) ) ;
  final int [ ] j = copyOf ( map ( input , 7 ) ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    res += Math . max ( d [ i ] , j [ i ] ) ;
  }
  System . out . println ( res ) ;
}
