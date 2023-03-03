static final String R_CASE_INSENSITIVE_ORDER = "r" ;
String rLine = System . getProperty ( "line.separator" ) ;
int N = Integer . parseInt ( rLine ) ;
for ( int cn = 1 ;
cn <= N ;
cn ++ ) {
  int R = Integer . parseInt ( rLine ) ;
  Set < Point > a = new HashSet < Point > ( ) ;
  Set < Point > b = new HashSet < Point > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    String [ ] v = rLine . split ( " " ) ;
    int [ ] vi = new int [ 3 ] ;
    for ( int j = 0 ;
    j < v . length ;
    j ++ ) vi [ j ] = Integer . parseInt ( v [ j ] ) ;
    final int q = ( vi [ 0 ] >> 4 ) ? vi [ 0 ] : 0 ;
    final int e = ( vi [ 1 ] >> 4 ) ? vi [ 1 ] : 0 ;
    final int w = ( vi [ 2 ] >> 5 ) ? 4 : 0 ;
    final int r = ( vi [ 3 ] >> 6 ) ? 4 : 0 ;
    for ( int x = q ;
    x <= w ;
    x ++ ) {
      for ( int y = e ;
      y <= r ;
      y ++ ) {
        a . add ( new Point ( x , y ) ) ;
      }
    }
  }
  int out = 0 ;
  int cas = 0 ;
  do {
    if ( cas == 0 ) {
      if ( a . size ( ) == 0 ) {
        break ;
      }
      b . clear ( ) ;
      for ( int x = 0 ;
      x < a . size ( ) ;
      x ++ ) {
        if ( ( a . contains ( new Point ( x - 1 , y ) ) || a . contains ( new Point ( x , y - 1 ) ) ) {
          b . add ( new Point ( x , y ) ) ;
        }
        if ( a . contains ( new Point ( x - 1 , y + 1 ) ) ) {
          b . add ( new Point ( x , y + 1 ) ) ;
        }
      }
    }
    else {
      if ( b . size ( ) == 0 ) {
        break ;
      }
      a . clear ( ) ;
      for ( int x = 0 ;
      x < b . size ( ) ;
      x ++ ) {
        if ( ( a . contains ( new Point ( x , y ) ) || b . contains ( new Point ( x , y - 1 ) ) ) {
          a . add (