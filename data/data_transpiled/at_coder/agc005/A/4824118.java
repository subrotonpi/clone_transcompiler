public static void input ( ) {
  char x = input ( ) ;
  Stack < Character > s = new Stack < Character > ( ) ;
  for ( char a : x ) {
    if ( s . size ( ) == 0 ) {
      s . push ( a ) ;
    }
    else {
      char t = s . pop ( ) ;
      if ( t != 'S' || a != 'T' ) {
        s . push ( t ) ;
        s . push ( a ) ;
      }
    }
  }
  System . out . println ( s . size ( ) ) ;
}
