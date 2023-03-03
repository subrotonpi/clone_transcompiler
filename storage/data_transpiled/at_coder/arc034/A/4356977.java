static final void setIn ( ) {
  System . setIn ( 10 * 9 ) ;
  String input = System . console ( ) . readLine ( ) ;
  int N = Integer . parseInt ( input ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int * a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    ans = Math . max ( ans , Math . pow ( a , b ) + b * 110 / 900 ) ;
  }
  System . out . println ( ans ) ;
}
