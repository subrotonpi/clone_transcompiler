@ Statistics ( mean = mean , median = median , variance = variance , stdev = stdev ) public static void main ( String [ ] args ) {
  final int n = args . length ;
  int j = 0 ;
  if ( q == 1 ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
  exit ( 0 ) ;
  /* j = 1 */
  if ( q == 2 ) System . out . println ( "+" ) ;
  else if ( q == 3 ) System . out . println ( "-" ) ;
  else System . out . println ( "?" ) ;
  /* ip = Integer.parseInt(input());*/
  /* pne = Double.parseDouble(input());*/
  double rem = Math . pow ( 10 , 9 ) + 7 ;
  n = ip ( ) ;
  String [ ] cityname = new String [ n ] ;
  int [ ] population = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String x = input ( ) ;
    String y = input ( ) ;
    cityname [ i ] = x ;
    population [ i ] = Integer . parseInt ( y ) ;
  }
  if ( max ( population ) / sum ( population ) > 0.5 ) {
    int a = population . length ;
    System . out . println ( cityname [ a ] ) ;
  }
  else {
    System . out . println ( "atcoder" ) ;
  }
}
