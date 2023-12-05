static final int [ ] getMath ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int high = 2 * ( ( 100 - b ) / ( 2 * a ) + 1 ) ;
  int low = 0 ;
  for ( int i = 0 ;
  i < 1000 ;
  i ++ ) {
    int mid = ( high + low ) / 2 ;
    if ( a * mid + b * Math . sin ( c * Math . PI * mid ) - 100 > 0 ) high = mid ;
    else low = mid ;
  }
  System . out . println ( high ) ;
}
