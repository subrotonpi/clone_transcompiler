public static double floor ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  double [ ] [ ] ab = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ab [ i ] [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  final double result = Math . floor ( Math . pow ( a , b ) * 1.05 ) ;
  return result ;
}
