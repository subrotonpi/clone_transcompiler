public static String input ( ) {
  String s = input ( ) ;
  String ans = "" ;
  for ( char x : s . toCharArray ( ) ) {
    if ( x == '0' || x == '1' ) {
      ans += x ;
    }
    else {
      ans = ans . substring ( 0 , ans . length ( ) - 1 ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
