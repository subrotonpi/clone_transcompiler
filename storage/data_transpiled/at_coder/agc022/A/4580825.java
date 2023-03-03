public static void input ( ) {
  String S = input . readLine ( ) ;
  if ( S . length ( ) < 26 ) {
    for ( int i = 0 ;
    i < 26 ;
    i ++ ) {
      char c = ( char ) ( 'a' + i ) ;
      if ( ! S . contains ( c ) ) {
        System . out . println ( S + c ) ;
        exit ( ) ;
      }
    }
  }
  if ( S . equals ( "zyxwvutsrqponmlkjihgfedcba" ) ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  Set < Character > cs = new HashSet < Character > ( ) ;
  for ( int i = 0 ;
  i < 25 ;
  i ++ ) {
    char t = S . charAt ( S . length ( ) - i - 1 ) ;
    char tt = S . charAt ( S . length ( ) - i - 2 ) ;
    cs . add ( t ) ;
    if ( tt < t ) {
      char last = 'z' ;
      for ( char c : cs ) {
        if ( c < tt ) continue ;
        last = Math . min ( last , c ) ;
      }
      System . out . println ( S . substring ( 0 , S . length ( ) - i - 2 ) + last ) ;
      exit ( ) ;
    }
  }
}
