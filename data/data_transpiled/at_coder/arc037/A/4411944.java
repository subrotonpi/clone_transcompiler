static final void setIn ( ) {
  System . setIn ( 10 * 9 ) ;
  String input = System . console ( ) . readLine ( ) ;
  int N = Integer . parseInt ( input ) ;
  List < Integer > M = Lists . newArrayList ( ) ;
  for ( int m : M ) {
    ans += Math . max ( 80 - m , 0 ) ;
  }
  System . out . println ( ans ) ;
}
