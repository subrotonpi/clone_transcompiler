static String findNext ( String number ) throws IOException {
  List < Character > digits = Arrays . asList ( number . trim ( ) . toCharArray ( ) ) ;
  List < Character > sorted = new LinkedList < > ( ) ;
  for ( char ch : digits ) {
    digits . add ( ch ) ;
  }
  Collections . sort ( sorted ) ;
  if ( number . length ( ) == 1 ) {
    return number + "0" ;
  }
  int cur = digits . size ( ) - 2 ;
  while ( cur >= 0 ) {
    if ( digits . get ( cur ) < digits . get ( cur + 1 ) ) {
      break ;
    }
    cur -- ;
  }
  if ( cur == - 1 ) {
    String ret = new String ( sorted ) ;
    ret = ret . replace ( "0" , "" ) ;
    StringBuilder sb = new StringBuilder ( ) ;
    sb . append ( ret . substring ( 0 , sb . length ( ) - 1 ) ) ;
    sb . append ( "0" ) ;
    sb . append ( ret . substring ( 1 ) ) ;
    return sb . toString ( ) ;
  }
  else {
    StringBuilder sb = new StringBuilder ( ) ;
    sb . append ( number . substring ( 0 , cur ) ) ;
    int first = Math . min ( digits . size ( ) , cur ) ;
    for ( int dd = cur ;
    dd > 0 ;
    dd -- ) {
      if ( dd > number . charAt ( dd ) ) {
        sb . append ( " " ) ;
      }
    }
    sb . append ( first ) ;
    List < Character > remains = new ArrayList < > ( ) ;
    remains . addAll ( digits ) ;
    Collections . sort ( remains ) ;
    remains . remove ( first ) ;
    sb . append ( remains . toString ( ) ) ;
    return sb . toString ( ) ;
  }
}
