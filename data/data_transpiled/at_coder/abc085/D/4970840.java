public static void print ( int n , int h ) {
  int amax = 0 ;
  List < Integer > bl = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    amax = Math . max ( amax , a ) ;
    bl . add ( b ) ;
  }
  Collections . sort ( bl ) ;
  bl . reverse ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( h <= 0 ) break ;
    if ( bl . get ( i ) <= amax ) break ;
    ans ++ ;
    h -= ( h / amax ) * amax ;
  }
  if ( h > 0 ) ans ++ ;
  System . out . println ( ans ) ;
}
