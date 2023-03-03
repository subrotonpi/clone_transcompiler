@ VisibleForTesting static double solve ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  a . add ( a . get ( 0 ) ) ;
  double m = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double s = Math . abs ( ( a . get ( i ) . x - x ) * ( a . get ( i + 1 ) . y - y ) - ( a . get ( i + 1 ) . x - x ) * ( a . get ( i + 1 ) . y - y ) ) / 2 ;
    double l = Math . sqrt ( ( a . get ( i ) . x - a . get ( i + 1 ) . x ) * ( a . get ( i + 1 ) . y - y ) + ( a . get ( i + 1 ) . y - a . get ( i + 1 ) . y ) * ( a . get ( i + 1 ) . y ) ) ;
    m = Math . min ( m , 2 * s / l ) ;
  }
  System . out . println ( m ) ;
}
