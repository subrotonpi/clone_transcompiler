public static void print ( String S ) {
  int M = 753 ;
  int min = 10000 ;
  for ( int i = 0 ;
  i < S . length ( ) - 2 ;
  i ++ ) {
    int a = 100 * Integer . parseInt ( S . charAt ( i ) ) + 10 * Integer . parseInt ( S . charAt ( i + 1 ) ) + Integer . parseInt ( S . charAt ( i + 2 ) ) ;
    int b = Math . abs ( a - M ) ;
    if ( b < min ) {
      min = b ;
    }
  }
  System . out . println ( min ) ;
}
