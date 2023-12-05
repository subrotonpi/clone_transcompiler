public static void input ( ) {
  String S [ ] = input . split ( "\\s+" ) ;
  int ans = 0 ;
  for ( String s : S ) {
    if ( ! "0" . equals ( s ) ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
