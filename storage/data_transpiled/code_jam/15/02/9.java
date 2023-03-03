static final int solve ( int [ ] l ) throws IOException {
  final int max = Math . max ( l . length , 1 ) ;
  for ( int a = 1 ;
  a < max ;
  a ++ ) {
    s = Math . min ( s , reduce ( l [ a ] - ( - l [ a ] ) / a - 1 , max ) ) ;
  }
  return ( max ) ;
}
