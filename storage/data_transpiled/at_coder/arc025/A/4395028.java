public static void main ( String input ) {
  A = new LinkedList < Integer > ( ) ;
  B = new LinkedList < Integer > ( ) ;
  B = new LinkedList < Integer > ( ) ;
  B . add ( input ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    res += Math . max ( A . get ( i ) , B . get ( i ) ) ;
  }
  System . out . println ( res ) ;
}
