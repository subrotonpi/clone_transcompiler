public static String input ( ) {
  String num = "" ;
  LinkedList < Integer > ls = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i <= 10 ;
  i ++ ) {
    ls . add ( Integer . toString ( ls . get ( i ) ) ) ;
  }
  for ( int x = 0 ;
  x < S . length ;
  x ++ ) {
    if ( ls . contains ( S [ x ] ) ) {
      num += S [ x ] ;
    }
  }
  System . out . println ( num ) ;
  return num ;
}
