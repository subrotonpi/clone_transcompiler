public static void print ( int n ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ng = Lists . newArrayList ( ) ;
  for ( i = 0 ;
  i < 3 ;
  i ++ ) ng . add ( i ) ;
  double [ ] dp = new double [ 301 ] ;
  dp [ n ] = 0 ;
  for ( i = n ;
  i >= 0 ;
  i -- ) {
    if ( ng . contains ( i ) ) continue ;
  }
}
