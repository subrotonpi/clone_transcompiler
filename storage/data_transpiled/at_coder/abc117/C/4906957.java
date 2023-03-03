public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  if ( n >= m ) {
    System . out . println ( 0 ) ;
  }
  else {
    List < Integer > x = new ArrayList < > ( ) ;
    for ( int i = 1 ;
    i < m ;
    i ++ ) {
      x . add ( Integer . parseInt ( input ) ) ;
    }
    List < Integer > diff = new ArrayList < > ( ) ;
    for ( int i = 1 ;
    i < m ;
    i ++ ) {
      diff . add ( x . get ( i ) - x . get ( i - 1 ) ) ;
    }
    System . out . println ( Arrays . toString ( diff . subList ( 0 , m - n ) ) ) ;
  }
}
