static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  final String [ ] d = System . console ( ) . readLine ( ) . split ( " " ) ;
  int c = 0 ;
  int res = 0 ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    res = Math . max ( res , i - c ) ;
    c += Integer . parseInt ( d [ i ] ) ;
  }
  System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
}
