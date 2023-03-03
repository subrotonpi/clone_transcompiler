public static void print ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double tot = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String [ ] L = new LinkedList < String > ( ) ;
    for ( String s : input ( ) . split ( " " ) ) {
      L [ 1 ] = s ;
    }
    if ( L [ 1 ] . equals ( "JPY" ) ) {
      tot += Integer . parseInt ( L [ 0 ] ) ;
    }
    else {
      tot += Double . parseDouble ( L [ 0 ] ) * 380000.0 ;
    }
  }
  System . out . println ( tot ) ;
}
