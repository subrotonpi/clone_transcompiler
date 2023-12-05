static final double [ ] [ ] input ( ) {
  final int N = Integer . parseInt ( input [ 0 ] ) ;
  final int K = Integer . parseInt ( input [ 1 ] ) ;
  final double [ ] [ ] wp = new double [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    wp [ i ] = list ( Integer . parseInt ( input [ 2 ] ) ) ;
  }
  final double [ ] w = wp [ 0 ] ;
  final double [ ] p = wp [ 1 ] ;
  double amax = Math . max ( p , 0 ) ;
  double amin = Math . min ( p , 0 ) ;
  double a = ( amax + amin ) / 2 ;
  while ( amax - amin > 0.0000000003 ) {
    final double [ ] x = w [ 0 ] ;
    if ( Arrays . binarySearch ( x , x ) > - K ) {
      amin = a ;
      a = ( amax + a ) / 2 ;
    }
    else {
      amax = a ;
      a = ( amin + a ) / 2 ;
    }
  }
  System . out . println ( Math . round ( amax ) ) ;
  return null ;
}
