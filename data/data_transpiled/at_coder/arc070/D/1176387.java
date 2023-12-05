static final String input ( ) {
  final int a = Integer . parseInt ( input . readLine ( ) ) ;
  final int b = Integer . parseInt ( input . readLine ( ) ) ;
  if ( a <= b ) {
    System . err . println ( "Impossible" ) ;
    System . exit ( 0 ) ;
  }
  final int n = a + b ;
  {
    System . out . println ( "? " + i + " " + j ) ;
    final char ans = input . charAt ( 0 ) ;
    switch ( ans ) {
      case 'Y' : return true ;
      case 'N' : return false ;
    }
  }
  final Stack < Integer > path = new Stack < Integer > ( ) ;
  int nlen = b + 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( path . size ( ) == 0 ) {
      path . push ( i ) ;
    }
  }
  return path . pop ( ) ;
}
