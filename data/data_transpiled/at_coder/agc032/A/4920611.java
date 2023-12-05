public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  LinkedList < Integer > b = new LinkedList < Integer > ( ) ;
  b . add ( n ) ;
  b . add ( n ) ;
  b . add ( n ) ;
  b . add ( n ) ;
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  while ( true ) {
    int num = 0 ;
    for ( int i = 0 ;
    i < b . size ( ) ;
    i ++ ) {
      if ( b . get ( i ) == i + 1 ) {
        num = i + 1 ;
      }
    }
    else {
      if ( num == 0 ) {
        System . out . println ( "-1" ) ;
        quit ( ) ;
      }
      else {
        ans . add ( b . get ( num - 1 ) ) ;
        b . remove ( num - 1 ) ;
      }
    }
    if ( b . isEmpty ( ) ) {
      break ;
    }
  }
  for ( int i = ans . size ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    System . out . println ( ans . get ( i ) ) ;
  }
}
