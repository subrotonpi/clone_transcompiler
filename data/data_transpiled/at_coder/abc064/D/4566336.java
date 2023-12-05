public static void N ( ) {
  String S = input . next ( ) ;
  Stack st1 = new Stack ( ) ;
  Stack st2 = new Stack ( ) ;
  StringBuffer tmp = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '(' ) st1 . push ( S . charAt ( i ) ) ;
    else if ( S . charAt ( i ) == ')' ) st1 . pop ( ) ;
    else tmp . append ( '(' ) ;
    tmp . append ( S . charAt ( i ) ) ;
  }
  String ans = tmp . toString ( ) ;
  for ( int i = tmp . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    if ( S . charAt ( i ) == ')' ) st2 . push ( S . charAt ( i ) ) ;
    else if ( S . charAt ( i ) == '(' ) {
      if ( st2 . pop ( ) > 0 ) st2 . pop ( ) ;
      else ans += ')' ;
    }
  }
  System . out . println ( ans ) ;
}
