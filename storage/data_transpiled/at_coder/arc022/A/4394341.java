public static String input ( ) {
  String S = input ( ) ;
  String res = "NO" ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( ( S . charAt ( i ) == 'I' || S . charAt ( i ) == 'i' ) && tmp == 0 ) {
      tmp ++ ;
    }
    if ( ( S . charAt ( i ) == 'C' || S . charAt ( i ) == 'c' ) && tmp == 1 ) {
      tmp ++ ;
    }
    if ( ( S . charAt ( i ) == 'T' || S . charAt ( i ) == 't' ) && tmp == 2 ) {
      res = "YES" ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
