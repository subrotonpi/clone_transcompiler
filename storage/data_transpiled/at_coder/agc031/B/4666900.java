public static void print ( int n ) {
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] = Integer . parseInt ( input ( ) ) ;
  int [ ] dp = new int [ 200001 ] ;
  int num = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( c [ i ] != c [ i + 1 ] ) {
      num += dp [ c [ i + 1 ] ] ;
      dp [ c [ i + 1 ] ] = num ;
    }
  }
  System . out . println ( num % ( 10 * 9 + 7 ) ) ;
}
