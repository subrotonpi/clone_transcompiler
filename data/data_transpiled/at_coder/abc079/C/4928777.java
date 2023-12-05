@ GwtIncompatible ( "collections.deque" ) public static String from ( String input ) {
  String A = input ;
  String B = input ;
  String C = input ;
  String D = input ;
  Deque < String > dq = new LinkedList < > ( ) ;
  dq . add ( "" ) ;
  while ( dq . size ( ) > 0 ) {
    String op = dq . pollFirst ( ) ;
    if ( op . length ( ) == 3 ) {
      String res = A + op . charAt ( 0 ) + B + op . charAt ( 1 ) + C + op . charAt ( 2 ) + D ;
      if ( new Integer ( res ) . intValue ( ) == 7 ) {
        String ans = res + "=7" ;
        System . out . println ( ans ) ;
        break ;
      }
    }
    else {
      dq . add ( op + "+" ) ;
      dq . add ( op + "-" ) ;
    }
  }
  return "" ;
}
