public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > b = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    b . add ( Integer . parseInt ( input . substring ( i , i + 1 ) ) ) ;
  }
  List < Integer > a = new LinkedList < > ( ) ;
  while ( b . size ( ) > 0 && n - 1 >= 0 ) {
    if ( b . get ( n - 1 ) == n ) {
      b . remove ( n - 1 ) ;
      a . add ( 0 , n ) ;
      n = b . size ( ) ;
      continue ;
    }
    n -- ;
  }
  if ( b . size ( ) == 0 ) {
    Arrays . stream ( a ) . forEach ( i -> System . out . println ( i ) ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
