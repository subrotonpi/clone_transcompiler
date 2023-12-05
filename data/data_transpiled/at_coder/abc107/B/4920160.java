public static void main ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , h ) ) ;
  int w = Integer . parseInt ( input . substring ( w + 1 ) ) ;
  List < String > a = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a . add ( new String ( input . substring ( i , i + 1 ) ) ) ;
  }
  List < String > aNew = new LinkedList < String > ( ) ;
  for ( int i = 0 , li = a . size ( ) ;
  i < li ;
  i ++ ) {
    if ( a . get ( i ) . indexOf ( '.' ) != w ) {
      aNew . add ( a . get ( i ) ) ;
    }
  }
  List < String > b = new ArrayList < String > ( ) ;
  for ( int i = 0 , li = a . size ( ) ;
  i < li ;
  i ++ ) {
    b . add ( a . get ( i ) ) ;
  }
  List < String > bNew = new LinkedList < String > ( ) ;
  for ( int i = 0 , li = b . size ( ) ;
  i < li ;
  i ++ ) {
    if ( b . get ( i ) . indexOf ( '.' ) != b . get ( 0 ) . length ( ) ) {
      bNew . add ( b . get ( i ) ) ;
    }
  }
  List < String > c = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < b . size ( ) ;
  i ++ ) {
    c . add ( b . get ( i ) ) ;
  }
  for ( int i = 0 ;
  i < c . size ( ) ;
  i ++ ) {
    System . out . println ( c . get ( i ) ) ;
  }
}
