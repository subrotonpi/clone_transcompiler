public static String [ ] a ( ) {
  a = list ( input ( ) ) ;
  String c = "" ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] . charAt ( 0 ) == 'A' ) {
      c += 'A' ;
    }
    else {
      if ( a [ i ] . charAt ( 0 ) != 'L' ) {
        c += '>' ;
      }
      else {
        c += '<' ;
      }
    }
    c += " " ;
  }
  return c . substring ( 0 , c . length ( ) - 1 ) ;
}
