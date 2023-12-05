public static String input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  String ans = "No" ;
  if ( S . equals ( T ) ) {
    ans = "Yes" ;
  }
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    S = S . substring ( S . length ( ) - 1 ) + S ;
    S = S . substring ( 0 , S . length ( ) - 1 ) ;
    if ( S . equals ( T ) ) {
      ans = "Yes" ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
