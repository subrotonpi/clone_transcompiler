static void print ( ) {
  s = new LinkedList < String > ( ) ;
  s . add ( " " ) ;
  int i = 0 ;
  int am = 1 ;
  while ( i < s . size ( ) - 1 ) {
    if ( s . get ( i ) == s . get ( i + 1 ) ) am ++ ;
    else {
      System . out . print ( s . get ( i ) + am ) ;
      am = 1 ;
    }
    i ++ ;
  }
  System . out . println ( ) ;
}
