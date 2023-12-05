@ VisibleForTesting static final Operator < Integer > ex = execFile ;
final String readpath = "C:\\Users\\danra\\Downloads\\" ;
final String writepath = "C:\\Users\\danra\\Downloads\\" ;
{
  final List < String > res = new ArrayList < > ( ) ;
  final int bound = ( int ) ( 0.5 * x ) + 1 ;
  int i = 2 ;
  while ( x > 0 && x % i == 0 ) {
    res . add ( x . substring ( 0 , x . length ( ) - 1 ) ) ;
    x /= i ;
  }
  else i ++ ;
  return res . stream ( ) . map ( l -> l . stream ( ) . map ( x -> x ) . collect ( Collectors . toList ( ) ) ) . map ( l -> l . stream ( ) . map ( x -> x ) . collect ( Collectors . toList ( ) ) ) . map ( l -> l . stream ( ) . map ( x -> x + '\n' ) ) . collect ( Collectors . toList ( ) ) ;
}
