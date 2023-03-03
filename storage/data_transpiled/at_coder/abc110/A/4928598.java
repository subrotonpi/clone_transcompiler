public static void print ( int a , int b , int c ) {
  list = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    li . add ( a * 10 + b + c ) ;
  }
  li . add ( c * 10 + a + b ) ;
  System . out . println ( max ( li ) ) ;
}
