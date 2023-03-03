public static String input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  String ans = "You can win" ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    String a = S . substring ( i , i + 1 ) ;
    String b = T . substring ( i , i + 1 ) ;
    if ( a != b && a + b != "@a@t@c@o@d@e@r@" ) {
      ans = "You will lose" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
