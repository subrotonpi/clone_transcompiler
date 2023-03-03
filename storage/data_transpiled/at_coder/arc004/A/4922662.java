public static double N = Integer . parseInt ( input ) {
  List < List < Integer >> lst = new ArrayList < > ( N ) ;
  lst . add ( null ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lst . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  double ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int k = i ;
    k < N ;
    k ++ ) {
      double x = ( lst . get ( i ) . x - lst . get ( k ) . x ) * ( lst . get ( k ) . y - lst . get ( k ) . y ) ;
      double tmp = ( x + y ) * 0.5 ;
      ans = Math . max ( ans , tmp ) ;
    }
  }
  System . out . println ( ans + "{:.6f}" ) ;
  return ans ;
}
