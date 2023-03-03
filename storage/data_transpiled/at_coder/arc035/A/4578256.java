public static void input ( ) {
  String s = input ( ) ;
  char [ ] t = s . toCharArray ( ) ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    if ( t [ i ] != '*' && t [ i ] != '*' && t [ i ] != '*' ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
}
