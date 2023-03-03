static private int solve ( int H , int W , int D , String [ ] c ) throws IOException {
  final double eps = 0.0000001 ;
  int [ ] angles = new int [ H ] ;
  W = W - 2 ;
  H = H - 2 ;
  boolean found = false ;
  int y = - 0.5 ;
  for ( String line : c ) {
    int x = - 0.5 ;
    for ( int i = 0 ;
    i < line . length ( ) ;
    i ++ ) {
      if ( line . charAt ( i ) == 'X' ) {
        found = true ;
        break ;
      }
      x = x + 1 ;
    }
    if ( found ) break ;
    y = y + 1 ;
    double mx = x ;
    double my = y ;
    int co = 0 ;
    for ( int xcopy = - 50 ;
    xcopy < 50 ;
    xcopy ++ ) {
      for ( int ycopy = - 50 ;
      ycopy < 50 ;
      ycopy ++ ) {
        if ( ( xcopy == 0 && ycopy == 0 ) ) continue ;
        if ( xcopy % 2 != 0 ) mx = ( xcopy + 1 ) * ( W ) - x ;
        else mx = xcopy * ( W ) + x ;
        if ( ycopy % 2 != 0 ) my = ( ycopy + 1 ) * ( H ) - y ;
        else my = ycopy * ( H ) + y ;
        double dist = Math . sqrt ( ( mx - x ) * ( mx - x ) + ( my - y ) * ( my - y ) ) ;
        if ( dist <= D ) {
          double a = 0 ;
          a = Math . atan2 ( ( my - y ) , ( mx - x ) ) ;
          if ( ! hasAngle ( a , angles ) ) {
            co = co + 1 ;
            angles [ 0 ] = a ;
          }
        }
      }
    }
    return co ;
  }
  private boolean hasAngle ( double a , List < Double > angles ) {
    for ( double an : angles ) {
      if ( Math . abs ( an - a ) < eps ) return true ;
    }
    return false ;
  }
  BufferedReader br = new BufferedReader ( new FileReader ( "d.in" ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    H = Integer . parseInt ( br . readLine ( ) ) ;
    W = Integer . parseInt ( br . readLine ( ) ) ;
    D = Integer . parseInt ( br . readLine ( ) ) ;
  }
  String [ ] c = new String