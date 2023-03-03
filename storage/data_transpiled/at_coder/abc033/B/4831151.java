public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int people = 0 ;
  String max_a = "hoge" ;
  int max_b = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String a = Integer . parseInt ( input ) ;
    String b = Integer . parseInt ( input ) ;
    people += Integer . parseInt ( b ) ;
    if ( ( max_b < Integer . parseInt ( b ) ) && ( b . compareTo ( "hoge" ) < 0 ) ) {
      max_b = Integer . parseInt ( b ) ;
      max_a = a ;
    }
  }
  if ( ( people < 2 * max_b ) && ( max_a . equals ( "hoge" ) ) ) {
    System . out . println ( max_a ) ;
  }
  else {
    System . out . println ( "atcoder" ) ;
  }
}
