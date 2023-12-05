static final Map < Integer , Integer > map = new Map < Integer , Integer > ( ) {
  private int n ;
  private int m ;
  private int [ ] [ ] lights = new int [ N ] [ M ] ;
  @ Override public void addIntersection ( int row , int column , int s , int w , int t ) {
    if ( t > s + w ) t -= ( ( s + w ) + 1 ) / t * ( s + w ) ;
    lights [ row ] [ column ] = new int [ M ] ;
  }
  @ Override public void addIntersection ( int row , int column , int s , int w , int t ) {
    if ( t > s + w ) t -= ( ( s + w ) + 1 ) / t * ( s + w ) ;
    lights [ row ] [ column ] = new int [ M ] ;
  }
  @ Override public void getNextLightCycles ( int x , int y , int t ) {
    x /= 2 ;
    y /= 2 ;
    int s = lights [ x ] [ y ] ;
    int w = lights [ x ] [ y ] ;
    int t0 = lights [ x ] [ y ] ;
    int diff = t - t0 ;
    int fullCycles = diff / ( s + w ) ;
    int dt = diff - fullCycles * ( s + w ) ;
    if ( dt < s ) return new Integer ( 0 ) ;
    if ( dt < s + w ) return new Integer ( s + w - dt ) ;
    assert false ;
  }
  @ Override public List < Integer > getPossibleDirections ( int x , int y , int t ) {
    List < Integer > candidates = new ArrayList < Integer > ( ) ;
    if ( x < 2 * n - 1 ) {
      if ( x % 2 == 1 ) candidates . add ( new Integer ( x + 1 ) ) ;
      else candidates . add ( new Integer ( x + 1 ) ) ;
    }
    else candidates . add ( new Integer ( y + 1 ) ) ;
    if ( y < 2 * m - 1 ) {
      if ( y % 2 == 1 ) candidates . add ( new Integer ( x + 1 ) ) ;
      else candidates . add ( new Integer ( y + 1 ) ) ;
    }
    else candidates . add ( new Integer ( y + 1 ) ) ;
    if ( y < 2 * m - 1 ) {
      if ( y % 2 == 0 ) candidates . add ( new Integer ( y + 1 ) ) ;
    }
    else candidates . add ( new Integer ( y + 1 ) ) ;
  }
  