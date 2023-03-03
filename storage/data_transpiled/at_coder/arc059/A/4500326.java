public static double N = Integer . parseInt ( input ) {
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  double ans = Double . POSITIVE_INFINITY ;
  for ( int j = - 100 ;
  j < 101 ;
  j ++ ) {
    double S = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      S += ( L . get ( i ) - j ) * ( L . get ( i ) - j ) ;
    }
    if ( S <= ans ) {
      ans = S ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
