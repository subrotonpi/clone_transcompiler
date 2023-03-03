public static void input ( ) {
  String s = input ( ) ;
  String ans = "" ;
  for ( char c : s . toCharArray ( ) ) {
    if ( c == 'B' ) {
      ans = ans . substring ( 0 , ans . length ( ) - 1 ) ;
    }
    else {
      ans += c ;
    }
  }
  System . out . println ( ans ) ;
}
