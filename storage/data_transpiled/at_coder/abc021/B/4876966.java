public static void print ( int N ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > Ps = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) Ps . add ( i ) ;
  Ps . add ( a ) ;
  Ps . add ( b ) ;
  if ( Ps . size ( ) == new HashSet < Integer > ( ) . size ( ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
