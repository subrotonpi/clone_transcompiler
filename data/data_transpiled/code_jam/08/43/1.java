@ String ( "C-small-attempt0.in" ) @ SuppressWarnings ( "unchecked" ) private static double minpower ( ArrayList < Ship > ships , int x , int y , int z ) throws IOException {
  double maxp = 0 ;
  Iterator < Ship > iterator = ships . iterator ( ) ;
  while ( iterator . hasNext ( ) ) {
    int x1 = iterator . next ( ) . x ;
    int y1 = iterator . next ( ) . y ;
    int z1 = iterator . next ( ) . z ;
    int p = iterator . next ( ) . p ;
    maxp = Math . max ( maxp , ( Math . abs ( x1 - x ) + Math . abs ( y1 - y ) + Math . abs ( z1 - z ) ) / ( double ) p ) ;
  }
  return maxp ;
}
