public static void input ( ) {
  int position = Integer . parseInt ( input ( ) ) ;
  String answer = "1" ;
  for ( int i = position ;
  i < numbers . length ;
  i ++ ) {
    if ( numbers [ i ] != "1" ) {
      answer = numbers [ i ] ;
      break ;
    }
  }
  System . out . println ( answer ) ;
}
