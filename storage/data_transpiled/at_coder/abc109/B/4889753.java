public static String N = Integer . parseInt ( input ) {
  List < String > before = new ArrayList < String > ( ) ;
  String answer = "Yes" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . next ( ) ;
    if ( before . contains ( s ) ) {
      answer = "No" ;
    }
    if ( before . size ( ) > 0 ) {
      if ( before . get ( before . size ( ) - 1 ) . charAt ( before . size ( ) - 1 ) != s . charAt ( 0 ) ) {
        answer = "No" ;
      }
    }
    before . add ( s ) ;
  }
  return answer ;
}
