@ Statistics ( mean = mean , median = median , variance = variance , stdev = stdev ) public static void statistics ( double mean , double median , double variance , double stdev ) {
  final int n = input . nextInt ( ) ;
  int j = 0 ;
  if ( q == 1 ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
  exit ( 0 ) ;
  /* ct */
  if ( ( x > y ) && ( x < y ) ) System . out . println ( "+" ) ;
  else if ( ( x < y ) && ( x < y ) ) System . out . println ( "-" ) ;
  else System . out . println ( "?" ) ;
  /* ip */
  int ip = Integer . parseInt ( input . nextLine ( ) ) ;
  /* pne */
  int rem = Math . pow ( 10 , 9 ) + 7 ;
  n = ip ;
  int [ ] add = new int [ 1000002 ] ;
  int [ ] subtract = new int [ 1000002 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    add [ i ] = 0 ;
    subtract [ i ] = 0 ;
  }
  a [ 0 ] = rem ;
  Set s = new HashSet ( ) ;
  s . add ( a ) ;
  for ( int i = 0 ;
  i < s . size ( ) ;
  i ++ ) {
    int k = ( Integer ) s . get ( i ) ;
    c += add [ k ] ;
    ans = Math . max ( c , ans ) ;
    c -= subtract [ k ] ;
  }
  System . out . println ( ans ) ;
}
