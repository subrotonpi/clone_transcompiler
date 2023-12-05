private static String LINES_PARAM = 0 ;
final String INPUT_FILE_NAME = "B-large.in" ;
final String OUTPUT_FILE_NAME = "B-large.out" ;
{
  final double heatNeeded = parsed [ 0 ] [ 2 ] ;
  final double Vol = parsed [ 0 ] [ 1 ] ;
  final List < Tap > taps = new ArrayList < > ( Arrays . asList ( parsed ) ) ;
  Collections . sort ( taps ) ;
  int heats = 0 ;
  int vols = 0 ;
  boolean hotter = false ;
  for ( final Tap tap : taps ) {
    heats += tap . x * tap . y ;
    vols += tap . x ;
  }
  if ( vols * heatNeeded > heats ) {
    taps . clear ( ) ;
    hotter = true ;
  }
  heats = 0 ;
  vols = 0 ;
  if ( ( taps . get ( 0 ) . y > heatNeeded && ! hotter ) || ( taps . get ( 0 ) . y < heatNeeded && hotter ) ) {
    return "IMPOSSIBLE" ;
  }
  for ( final Tap tap : taps ) {
    if ( ( heats + tap . y * tap . x <= heatNeeded * ( vols + tap . x ) && ! hotter ) || ( heats + tap . y * tap . x >= heatNeeded * ( vols + tap . x ) && hotter ) ) {
      vols += tap . x ;
      heats += tap . y * tap . x ;
    }
    else if ( tap . y == heatNeeded ) {
      vols += tap . x ;
      heats += tap . y * tap . x ;
    }
    else {
      final double p = ( heatNeeded * vols - heats ) / ( tap . y * tap . x - tap . x * heatNeeded ) ;
      vols += tap . x * p ;
      heats += tap . y * tap . x * p ;
      break ;
    }
  }
  final double result = Vol / vols ;
  return Double . toString ( result ) ;
}
