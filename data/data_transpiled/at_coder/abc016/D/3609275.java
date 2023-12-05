static final InputFunction < String , Point > INPUT_FUNCTION = new InputFunction < String , Point > ( ) {
  @ Override public Point apply ( String input ) {
    return new Point ( Integer . parseInt ( input ) ) ;
  }
  private static final int [ ] sortLinePoint ( int Ax , int Ay , int Bx , int By ) {
    if ( Ax > Bx || ( Ax == By && Ay > By ) ) {
      int tmpx = Ax ;
      int tmpy = Ay ;
      Ax = Bx ;
      Ay = By ;
      Bx = tmpx ;
      By = tmpy ;
    }
    return new Point ( Ax , Ay , Bx , By ) ;
  }
  private final double Bx_dash = Bx - Ax ;
  private final double By_dash = By - Ay ;
  double sin_theta , cos_theta ;
  double Bx_dash_rot , cos_theta ;
  /* Sort the line point */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double x = Ax ;
    double y = Ay ;
    double x_rot = x * cos_theta - y * sin_theta ;
    double y_rot = x * sin_theta + y * cos_theta ;
    /* Translate the x and y into the x and y coordinates */
    if ( x_dash == 0 ) {
      sin_theta = 0 ;
      cos_theta = 1 ;
      Bx_dash_rot = Bx_dash ;
      By_dash_rot = 0 ;
    }
    else if ( x_dash == 0 ) {
      sin_theta = - 1 ;
      cos_theta = 0 ;
      Bx_dash_rot = By_dash ;
      By_dash_rot = 0 ;
    }
    else {
      double theta = Math . atan2 ( By_dash , Bx_dash ) ;
      sin_theta = Math . sin ( - theta ) ;
      cos_theta = Math . cos ( - theta ) ;
      Bx_dash_rot = Bx_dash * cos_theta - By_dash * sin_theta ;
      By_dash_rot = 0 ;
    }
    /* Translate the x and y coordinates */
    double x = x - Ax ;
    double y = y - Ay ;
    double x_rot = x * cos_theta - y * sin_theta ;
    double y_rot = x * sin_theta + y * cos_theta ;
    /* Translate the x and y coordinates */
    int interCount = 0 ;
    Iterator < Point > iterator = input . iterator ( )