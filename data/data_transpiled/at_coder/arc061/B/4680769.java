@ VisibleForTesting static void input ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  Map < Integer , Integer > abd = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    abd . put ( new Integer ( a ) , b ) ;
    abd . put ( new Integer ( a ) , b ) ;
    abd . put ( new Integer ( b - 1 ) , b ) ;
    abd . put ( new Integer ( a ) , b - 2 ) ;
  }
  int [ ] suma = new int [ 10 ] ;
  for ( int a = 0 ;
  a < abd . keySet ( ) ;
  a ++ ) {
    int b = abd . get ( a ) ;
    if ( 0 < a < h - 1 && 0 < b < w - 1 ) suma [ a ] ++ ;
  }
  suma [ 0 ] = ( h - 2 ) * ( w - 2 ) - sum ( suma ) ;
  System . out . println ( ( suma ) ) ;
}
