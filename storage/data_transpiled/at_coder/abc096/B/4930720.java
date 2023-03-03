public static void print ( ) {
  m = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    m . add ( Math . max ( m . size ( ) * 2 , k ) ) ;
  }
  m . remove ( new Integer ( 2 ) ) ;
  System . out . println ( Arrays . toString ( m ) ) ;
}
