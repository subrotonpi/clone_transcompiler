public static void print ( ) {
  String s [ ] = input . nextLine ( ) . split ( "\\s+" ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( ! "0" . equals ( s [ i ] ) ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
