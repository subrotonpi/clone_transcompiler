static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
{
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  {
    int x = - 1 ;
    int y = - 1 ;
    List < Point > res = new ArrayList < Point > ( ) ;
    Point last = null ;
    List < Point > poses = new ArrayList < Point > ( ) ;
    while ( ( x = r . size ( ) ) > 0 ) {
      List < Point > xres = new ArrayList < Point > ( ) ;
      while ( ( x = r . get ( 0 ) ) . x == - 1 || x + r . get ( 0 ) . x <= W ) {
        Point c = r . get ( 0 ) ;
        int current = c . x ;
        poses . add ( c . y ) ;
        if ( ( x = r . get ( 1 ) ) . x == - 1 ) {
          x = current ;
        }
        else {
          x += 2 * current ;
        }
        xres . add ( x - current ) ;
        last = current ;
        if ( r . size ( ) == 0 ) {
          break ;
        }
      }
      int lasty = y ;
      x = - 1 ;
      if ( y == - 1 ) {
        res . add ( new Point ( x , 0 ) ) ;
        y = last ;
      }
      else {
        res . add ( new Point ( x , y + last ) ) ;
        y += 2 * last ;
      }
    }
    assert ( lasty <= L ) ;
    return zip ( poses , res ) ;
  }
}
