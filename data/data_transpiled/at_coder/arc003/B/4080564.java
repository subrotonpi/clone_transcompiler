public static String print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  {
    String y = "" ;
    for ( int i = input . length ( ) - 1 ;
    i >= 0 ;
    i -- ) {
      y = y + input . charAt ( i ) ;
    }
    return y ;
  }
  ArrayList < String > s = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String d = list ( input ) ;
    s . add ( f ( d ) ) ;
  }
  Collections . sort ( s ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String ass = list ( s . get ( i ) ) ;
    System . out . println ( f ( ass ) ) ;
  }
  return s . get ( n ) ;
}
