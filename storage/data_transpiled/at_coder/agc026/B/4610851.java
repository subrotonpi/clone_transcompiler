public static int t = Integer . parseInt ( input ) {
  List < Tuple < Integer , Integer >> query = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    query . add ( Tuple . tuple ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  /*if (query.isEmpty()) return query.size();
  return gcd(query.get(0), query.get(1));*/
  for ( int i = 0 ;
  i < query . size ( ) ;
  i ++ ) {
    int a = query . get ( i ) . intValue ( ) ;
    int b = query . get ( i ) . intValue ( ) ;
    int c = query . get ( i ) . intValue ( ) ;
    int d = query . get ( i ) . intValue ( ) ;
    int g = gcd ( b , d ) ;
    int r = a % g ;
    int m = ( ( c - r ) / g + 1 ) * g ;
    if ( b <= m && b <= a && b <= d ) System . out . println ( "Yes" ) ;
    else System . out . println ( "No" ) ;
  }
  return query . size ( ) ;
}
