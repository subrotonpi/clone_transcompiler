@ VisibleForTesting static double [ ] [ ] from ( int i ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Point > A = new ArrayList < > ( ) ;
  List < Point > B = new ArrayList < > ( ) ;
  double Ax_ave = 0 ;
  double Ay_ave = 0 ;
  double Ad_max = 0 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    A . add ( new Point ( x , y ) ) ;
    Ax_ave += x ;
    Ay_ave += y ;
  }
  Ax_ave /= N ;
  Ay_ave /= N ;
  for ( Point a : A ) {
    double d = Math . sqrt ( ( Ax_ave - a . x ) * ( Ax_ave - a . y ) + ( Ay_ave - a . y ) * ( By_ave - a . y ) ) ;
    Ad_max = Math . max ( Ad_max , d ) ;
  }
  return A . toArray ( ) ;
}
