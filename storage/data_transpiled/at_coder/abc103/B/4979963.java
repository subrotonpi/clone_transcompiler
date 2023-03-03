public static String input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  String ans = "No" ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    S = S . substring ( 1 ) + S . charAt ( 0 ) ;
    if ( S . equals ( T ) ) {
      ans = "Yes" ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
