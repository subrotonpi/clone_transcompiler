static double crossY ( double y , double R ) throws IOException {
  return Math . sqrt ( R * R - y * y ) + y * FastMath . PI ;
}
{
  double x = x + Math . sqrt ( R * R - x * x ) * FastMath . PI ;
  double g = x + Math . sqrt ( R * R - x * x ) * FastMath . PI ;
  double tmp0 ;
  double p1 , p2 , R ;
  double t = p1 / p2 ;
  double p = Math . abs ( .5 * R * R * Math . atan ( t / t ) ) ;
  /* Case */
  double tmp1 = Double . parseDouble ( "" ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    f = Float . parseFloat ( f ) ;
    R = Float . parseFloat ( f ) ;
    t = Float . parseFloat ( f ) ;
    r = Float . parseFloat ( f ) ;
    g = Float . parseFloat ( f ) ;
    p = 1 - Shole ( f , R , t , g ) / ( R * 3.1415926535 ) ;
    /* Case */
    if ( tmp1 == - 1 ) {
      break ;
    }
    p1 += vx ;
  }
  p0 += result * 4 ;
  RandomAccessFile f_Input = new RandomAccessFile ( "C-large.in" , "r" ) ;
  RandomAccessFile f_Output = new RandomAccessFile ( "output.txt" , "r" ) ;
  f_Output . seek ( 0 ) ;
  int N = Integer . parseInt ( f_Input . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    f = Float . parseFloat ( f_Input . readLine ( ) ) ;
    R = Float . parseFloat ( f ) ;
    t = Float . parseFloat ( f ) ;
    r = Float . parseFloat ( f ) ;
    g = Float . parseFloat ( f ) ;
    p = 1 - Shole ( f , R , t , g ) / ( R * R * 3.1415926535 ) ;
    f_Output . write ( String . format ( "Case #%d: %f\n" , i , p ) ) ;
  }
  f_Input . close ( ) ;
  f_Output . close ( ) ;
  /* Case */
  double result = 0.0 ;
  for ( int i = xrange ( p_List . length - 1 ) ;
  i < N ;
  i ++ ) {
    result += Striangle ( p_List [ i ] , p_List [ i + 1 ] ) ;
  }
  /* Case */
  double p_tr = p + g +