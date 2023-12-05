static final int q = Integer . parseInt ( input ) {
  int cnt = 0 ;
  boolean Issame = true ;
  double remainder = 1e10 ;
  double sum = 0 ;
  for ( int j = 0 ;
  j < q ;
  j ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    Issame = a == b ? Issame : false ;
    if ( a > b ) remainder = Math . min ( remainder , b ) ;
    sum += a ;
  }
  if ( Issame ) System . out . println ( 0 ) ;
  else System . out . println ( sum - remainder ) ;
  return cnt ;
}
