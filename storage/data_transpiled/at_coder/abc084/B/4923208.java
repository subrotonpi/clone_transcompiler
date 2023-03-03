public static boolean isInteger ( String A , String B ) {
  String S = input . nextLine ( ) ;
  boolean falg = false ;
  if ( S . indexOf ( '-' ) == 1 ) {
    String code1 = S . substring ( 0 , S . indexOf ( '-' ) ) ;
    String code2 = S . substring ( S . indexOf ( '-' ) + 1 ) ;
    if ( ( code1 . length ( ) == A . length ( ) ) && ( code2 . length ( ) == B . length ( ) ) ) {
      boolean flag = true ;
      if ( ( code1 . charAt ( 0 ) + code2 . charAt ( 0 ) ) . isdecimal ( ) && flag ) flag = true ;
      else flag = false ;
    }
    else flag = false ;
    if ( ( code1 . charAt ( 0 ) + code2 . charAt ( 0 ) ) . isdecimal ( ) && flag ) flag = true ;
    else flag = false ;
  }
  else flag = false ;
  if ( flag ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
  return falg ;
}
