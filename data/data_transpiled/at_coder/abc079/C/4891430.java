public static void input ( Scanner s ) {
  String A = s . next ( ) ;
  String B = s . next ( ) ;
  String C = s . next ( ) ;
  String D = s . next ( ) ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    String op1 = s . next ( ) ;
    String op2 = s . next ( ) ;
    String op3 = s . next ( ) ;
    if ( new Integer ( A + op1 + B + op2 + C + op3 + D ) . intValue ( ) == 7 ) {
      System . out . println ( A + op1 + B + op2 + C + op3 + D + "=7" ) ;
      break ;
    }
  }
}
