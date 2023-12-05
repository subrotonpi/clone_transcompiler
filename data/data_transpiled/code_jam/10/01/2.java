static final String getOneCaseString ( ) {
  /* do one case */
  final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int k = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int m = ( 1 << n ) - 1 ;
  System . out . println ( "Case #" + cnum + ": " + ( ( k & m ) == m ? "ON" : "OFF" ) ) ;
  /* do one case */
  final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    /* do one case */
    doOneCase ( i + 1 ) ;
  }
}
