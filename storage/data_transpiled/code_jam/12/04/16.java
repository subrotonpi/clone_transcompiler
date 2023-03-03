static final String INPUT = "tiny" ;
INPUT = "D-small-attempt0.in.txt" ;
int T = Integer . parseInt ( INPUT ) ;
for ( int i = 0 ;
i < T ;
i ++ ) {
  debug ( "i=" + i ) ;
  H = Integer . parseInt ( INPUT ) ;
  W = Integer . parseInt ( INPUT ) ;
  D = Integer . parseInt ( INPUT ) ;
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int j = 0 ;
  j < H ;
  j ++ ) {
    sb . append ( in . readLine ( ) ) ;
  }
  String v = doTrial ( H , W , D , sb ) ;
  System . out . println ( "Case #" + ( i + 1 ) + ": " + v ) ;
}
{
  int a , b ;
  int x , y ;
  int w , h ;
  {
    debug ( "W, H, X, Y, D =" + W + ", " + H + ", " + X + ", " + Y + ", " + D ) ;
    x = 2 * X - 1 ;
    y = 2 * Y - 1 ;
    w = 2 * ( W - 2 ) ;
    h = 2 * ( H - 2 ) ;
    {
      int maxX = ( int ) ( D / w ) + 3 ;
      for ( int i : xrange ( - maxX , maxX ) ) {
        sb . append ( i * w ) ;
        sb . append ( i * w + x ) ;
      }
    }
    {
      int maxY = ( int ) ( D / h ) + 3 ;
      for ( int i : xrange ( - maxY , maxY ) ) {
        sb . append ( i * h ) ;
        sb . append ( i * h + y ) ;
      }
    }
  }
  List < Integer > l = new ArrayList < Integer > ( ) ;
  int max_d = D * D ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    int x0 = l . get ( i ) ;
    int y0 = l . get ( i ) ;
    if ( y0 == x0 ) continue ;
    int d = x0 * x0 + y0 * y0 ;
    if ( d <= max_d ) {
      l . add ( new Integer ( x0 * x0 + y0 * y0 ) ) ;
    }
  }
  Collections . sort ( l ) ;
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < s .