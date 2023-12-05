public static void input ( ) {
  String [ ] C = S . split ( "\\+" ) ;
  int ans = 0 ;
  for ( String c : C ) {
    if ( ! "0" . equals ( c ) ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
