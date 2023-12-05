public static void input ( ) {
  String S = input ( ) ;
  String [ ] plus = S . split ( "\\+" ) ;
  int ans = 0 ;
  for ( String pl : plus ) {
    if ( pl . indexOf ( "0" ) == 0 ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
