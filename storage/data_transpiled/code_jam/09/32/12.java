public static void main ( String filename , String out ) throws Exception {
  Warm w ;
  String [ ] tmp ;
  int x , y , z ;
  double vx , vy ;
  double vz ;
  Warm m ;
  String in ;
  /* warm start */
  in = new Scanner ( System . in ) ;
  /* warm start */
  int N = warms . length * 1.0 ;
  double sigmax = 0 ;
  double sigmay = 0 ;
  double sigmaz = 0 ;
  double sigmavx = 0 ;
  double sigmavy = 0 ;
  double sigmavz = 0 ;
  for ( Warm warm : warms ) {
    sigmax += warm . x ;
    sigmay += warm . y ;
    sigmaz += warm . z ;
    sigmavx += warm . vx ;
    sigmavy += warm . vy ;
    sigmavz += warm . vz ;
  }
  sigmax /= N ;
  sigmay /= N ;
  sigmaz /= N ;
  sigmavx /= N ;
  sigmavy /= N ;
  sigmavz /= N ;
  double a = sigmavx * sigmavx + sigmay * sigmavy + sigmavz * sigmavz ;
  double t ;
  if ( a == 0 ) t = 0 ;
  else t = - 0.5 * b / a ;
  if ( t < 0 ) t = 0 ;
  m = ( sigmax + sigmavx * t ) * sigmax + ( sigmay + t * sigmavy ) * sigmay + ( sigmaz + t * sigmavz ) * sigmax ;
  m = m * 0.5 ;
  /* warm start */
  warms = new LinkedList < Warm > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tmp = ws . nextLine ( ) . trim ( ) . split ( " " ) ;
    x = Integer . parseInt ( tmp [ 0 ] ) ;
    y = Integer . parseInt ( tmp [ 1 ] ) ;
    z = Integer . parseInt ( tmp [ 2 ] ) ;
    vx = Integer . parseInt ( tmp [ 3 ] ) ;
    vy = Integer . parseInt ( tmp [ 4 ] ) ;
    vz = Integer . parseInt ( tmp [ 5 ] ) ;
    w = new Warm ( x , y , z , vx , vy , vz ) ;
    warms . add ( w ) ;
  }
  /* warm end */
  in = new Scanner ( in ) ;
  /* warm start */
}
