public static String print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < String > s = new LinkedList < String > ( ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    List < String > t = new ArrayList < String > ( ) ;
    List < String > p = new LinkedList < String > ( ) ;
    for ( int j = 0 ;
    j < s . size ( ) ;
    j ++ ) {
      if ( p . contains ( s . get ( j ) ) ) {
        t . add ( s . get ( j ) ) ;
        p . remove ( p . indexOf ( s . get ( j ) ) ) ;
      }
    }
    s . clear ( ) ;
  }
  return t . toString ( ) ;
}
