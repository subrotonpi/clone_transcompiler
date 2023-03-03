static final int input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int r = 0 ;
  int d = 0 ;
  int p = 0 ;
  int k = Integer . MAX_VALUE ;
  while ( p < n ) {
    r += a . get ( p ) . intValue ( ) ;
    d = Math . max ( d , a . get ( p ) . intValue ( ) ) ;
    k = Math . min ( k , p + 1 + Math . ceil ( Math . max ( 0 , ( h - r ) ) / d ) ) ;
    p ++ ;
    if ( r >= h ) break ;
  }
  System . out . println ( k ) ;
}
