static final double [ ] getDoubleArray ( ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final double [ ] d = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] = ( double ) input . nextDouble ( ) ;
  }
  System . out . println ( Arrays . toString ( d ) ) ;
  if ( Arrays . binarySearch ( d , - Double . MAX_VALUE ) < Double . MAX_VALUE ) {
    if ( n == 1 ) {
      System . out . println ( Arrays . toString ( d ) ) ;
    }
    if ( 1 < n ) {
      System . out . println ( - Arrays . toString ( d ) + 2 * Double . MAX_VALUE ) ;
    }
  }
  else {
    System . out . println ( 0 ) ;
  }
  return d ;
}
