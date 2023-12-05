public static void input ( ) {
  String S [ ] = input ( ) . split ( "\\s+" ) ;
  int ans = 0 ;
  for ( String x : S ) {
    if ( ! "0" . equals ( x ) ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
