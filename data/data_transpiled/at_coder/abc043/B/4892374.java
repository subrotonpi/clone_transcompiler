public static String input ( ) {
  String S = input ( ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'B' ) {
      if ( ans . length ( ) != 0 ) ans = ans . substring ( 0 , ans . length ( ) - 1 ) ;
    }
    else ans += S . charAt ( i ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
