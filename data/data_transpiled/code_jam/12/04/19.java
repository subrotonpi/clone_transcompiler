@ VisibleForTesting static void main ( String [ ] args ) throws FileNotFoundException {
  final Scanner in = new Scanner ( System . in ) ;
  final Scanner out = new Scanner ( in ) ;
  final String inFileName = in . nextLine ( ) ;
  final String outFileName = in . nextLine ( ) ;
  in . close ( ) ;
  out . close ( ) ;
  final int t = next ( in ) ;
  final int [ ] results = new int [ t ] ;
  for ( int step = 0 ;
  step < t ;
  step ++ ) {
    final int h = next ( in ) ;
    final int w = next ( in ) ;
    final int d = next ( in ) ;
    final String [ ] room = next ( in , h ) ;
    int xindex = - 1 ;
    int yindex = - 1 ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      xindex = room [ i ] . indexOf ( "X" ) ;
      if ( xindex >= 0 ) {
        yindex = i ;
        break ;
      }
    }
    h -= 2 ;
    w -= 2 ;
    int distance = 1 ;
    final HashMap < Integer , Integer > viewable = new HashMap < Integer , Integer > ( ) ;
    while ( true ) {
      final int prev = viewable . size ( ) ;
      final int size = distance * 2 + 1 ;
      final int top ;
      if ( distance % 2 == 0 ) {
        top = distance * h * - 1 ;
      }
      else {
        top = ( ( ( yindex ) * 2 - 1 ) + ( distance - 1 ) * h ) * - 1 ;
      }
      final int bottom ;
      if ( distance % 2 == 0 ) {
        bottom = distance * h ;
      }
      else {
        bottom = ( ( h - yindex ) * 2 + 1 ) + ( distance - 1 ) * h ;
      }
      final int left ;
      if ( distance % 2 == 0 ) {
        left = distance * w * - 1 ;
      }
      else {
        left = ( ( ( xindex ) * 2 - 1 ) + ( distance - 1 ) * w ) * - 1 ;
      }
      final int right ;
      if ( distance % 2 == 0 ) {
        y = i * h + top ;
      }
      else {
        y = ( ( ( yindex ) * 2 - 1 ) + ( distance - 1 ) * w ) + left ;
      }
      if ( sqrt ( x * x + top * y ) <= d ) {
        viewable . put ( atan2 ( left , y ) , 1 ) ;
      }
      if ( sqrt ( x * x + bottom * y )