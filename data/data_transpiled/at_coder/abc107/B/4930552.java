public static void print ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  String [ ] a = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i ] = new String ( input ) ;
  }
  Set < Integer > ys = new HashSet < Integer > ( ) , xs = new HashSet < Integer > ( ) ;
  for ( int y = 0 ;
  y < h ;
  y ++ ) {
    for ( int x = 0 ;
    x < w ;
    x ++ ) {
      if ( a [ y ] . charAt ( x ) == '#' ) {
        ys . add ( y ) ;
        xs . add ( x ) ;
      }
    }
  }
  for ( Integer y : new TreeSet < Integer > ( ys ) ) {
    for ( Integer x : new TreeSet < Integer > ( xs ) ) {
      System . out . print ( a [ y ] . charAt ( x ) + " " ) ;
    }
    System . out . println ( "" ) ;
  }
}
