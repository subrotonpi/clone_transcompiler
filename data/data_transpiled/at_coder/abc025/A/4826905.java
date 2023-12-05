public static void main ( String [ ] args ) {
  ArrayList < Integer > S = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < args . length ;
  i ++ ) S . add ( i ) ;
  int N = Integer . parseInt ( args [ i ] ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < S . size ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < S . size ( ) ;
    j ++ ) {
      count ++ ;
      if ( count == N ) System . out . println ( S . get ( i ) + S . get ( j ) ) ;
    }
  }
}
