static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) {
  }
}
;
final double INF = Double . POSITIVE_INFINITY ;
final int H = Integer . parseInt ( input . nextLine ( ) ) ;
final int W = Integer . parseInt ( input . nextLine ( ) ) ;
final List < String > [ ] grid = new List [ H ] ;
for ( int i = 0 ;
i < H ;
i ++ ) {
  grid [ i ] = new List < String > ( ) ;
  grid [ i ] . add ( input . nextLine ( ) ) ;
}
final int [ ] [ ] dist = new int [ W ] [ ] ;
for ( int i = 0 ;
i < W ;
i ++ ) {
  dist [ i ] [ 0 ] = INF ;
}
final List < Integer > dxy = new ArrayList < Integer > ( ) ;
dxy . add ( new Integer ( 0 ) ) ;
dxy . add ( new Integer ( 1 ) ) ;
dxy . add ( new Integer ( 1 ) ) ;
dxy . add ( new Integer ( 0 ) ) ;
dxy . add ( new Integer ( - 1 ) ) ;
final Queue < Integer > q = new LinkedList < Integer > ( ) ;
q . add ( new Integer ( 0 ) ) ;
while ( q . size ( ) > 0 ) {
  final int x = q . poll ( ) ;
  final int y = q . poll ( ) ;
  for ( final int i = 0 ;
  i < W ;
  i ++ ) {
    final int dx = dxy . get ( i ) ;
    final int dy = dxy . get ( i ) ;
    final int nx = x + dx ;
    final int ny = y + dy ;
    if ( nx < 0 || ny < 0 || nx >= W || ny >= H ) {
      continue ;
    }
    if ( grid [ ny ] [ nx ] . equals ( "#" ) ) {
      continue ;
    }
    if ( dist [ ny ] [ nx ] < INF ) {
      continue ;
    }
    q . add ( new Integer ( nx ) ) ;
    q . add ( new Integer ( ny ) ) ;
    dist [ ny ] [ nx ] = dist [ y ] [ x ] + 1 ;
  }
}
int ans = 0 ;
for ( int i = 0 ;
i < H ;
i ++ ) {
  ans += grid [ i ] . stream ( ) . mapToInt ( String :: length ) . sum ( ) ;
}
if ( dist [ H - 1 ] [ W - 1 ]