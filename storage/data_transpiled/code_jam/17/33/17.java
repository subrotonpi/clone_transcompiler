static final int solve ( int n , int k , double u , double [ ] ps ) throws Exception {
  if ( k < n ) throw new Exception ( "k < n, whoa" ) ;
  if ( u + Math . pow ( ps . length , n ) >= n ) return 1 ;
  final double [ ] sortedPs = new double [ ps . length ] ;
  Arrays . sort ( ps ) ;
  int numToRaise = 1 ;
  while ( u > 0.0000001 ) {
    System . out . println ( n + " " + sortedPs [ numToRaise ] + " " + u ) ;
    double maxToRaise ;
    if ( numToRaise == n ) maxToRaise = 1.0 ;
    else maxToRaise = sortedPs [ numToRaise ] - sortedPs [ numToThrow - 1 ] ;
    final double amtToAdd = Math . min ( u * 1.0 / numToRaise , maxToRaise ) ;
    for ( int pi = 0 ;
    pi <= numToRaise ;
    pi ++ ) {
      sortedPs [ pi ] += amtToAdd ;
      u -= amtToAdd ;
    }
    numToRaise ++ ;
  }
  final int finalCases = Stream . of ( sortedPs ) . mapToInt ( x -> x * y ) . sum ( ) ;
  return finalCases ;
}
