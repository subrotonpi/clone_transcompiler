static final int [ ] getSortValues ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Tuple < Integer , Integer >> list = new ArrayList < > ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    list . add ( new Tuple < > ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  final Tuple < Integer , Integer > a = list . get ( 0 ) ;
  final int [ ] LIS = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    LIS [ i ] = a . get ( i ) ;
  }
  System . out . println ( LIS . length ) ;
  return LIS ;
}
