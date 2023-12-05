public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = input . nextLine ( ) ;
  Stack < Character > que = new Stack < Character > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == ')' && que . size ( ) > 0 && que . peek ( ) == '(' ) {
      que . pop ( ) ' } } }