public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String S_in = input ;
  int cnt = ( N - 1 ) / 2 ;
  String S = "b" ;
  for ( int i = 1 ;
  i <= cnt ;
  i ++ ) {
    if ( i % 3 == 1 ) {
      S = "a" + S + "c" ;
    }
    else if ( i % 3 == 2 ) {
      S = "c" + S + "a" ;
    }
    else {
      S = "b" + S + "b" ;
    }
  }
  if ( S . equals ( S_in ) ) {
    System . out . println ( cnt ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
