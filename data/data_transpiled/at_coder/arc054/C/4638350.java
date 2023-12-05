static int det ( int [ ] [ ] A ) {
  final Scanner input = new Scanner ( System . in ) ;
  int n = input . nextInt ( ) ;
  int [ ] [ ] A = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = input . nextInt ( ) ;
    if ( l == 1 ) {
      return A [ 0 ] [ 0 ] ;
    }
    int [ ] [ ] B = new int [ l ] [ l ] ;
    for ( int j = 0 ;
    j < l ;
    j ++ ) {
      B [ j ] [ i ] = A [ i ] [ j ] ;
    }
  }
  return det ( B ) ;
}
