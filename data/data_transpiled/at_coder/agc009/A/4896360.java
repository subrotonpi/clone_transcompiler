static final double ceil ( double input ) {
  int n = Integer . parseInt ( input ) ;
  List < Tuple < Integer , Double >> data = new ArrayList < > ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    data . add ( tuple ( Integer . parseInt ( input ) ) ) ;
  }
  double ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double j = data . get ( i ) ;
    i += ans ;
    ans += Math . ceil ( i / j ) * j - i ;
  }
  System . out . println ( ans ) ;
}
