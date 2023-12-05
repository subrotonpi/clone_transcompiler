public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int l = 0 , r = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '(' ) {
      l ++ ;
    }
    else if ( l > 0 ) {
      r ++ ;
    }
    else {
      r ++ ;
    }
  }
  System . out . println ( "(" + r + S + ")" + l ) ;
  return r ;
}
