static final Map < String , Integer > memo = Maps . newHashMap ( ) ;
/* search the accessible table */
final boolean [ ] [ ] _accessible ;
final int left = 0 ;
final boolean maxTurn = false ;
final String [ ] [ ] _table = new String [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  Arrays . fill ( _table [ i ] , "" ) ;
}
final int totalScore = Integer . valueOf ( b [ 0 ] ) + Integer . valueOf ( b [ 1 ] ) + Integer . valueOf ( c [ 1 ] ) + Integer . valueOf ( c [ 2 ] ) ;
final boolean [ ] [ ] _accessible = new boolean [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  for ( int _j = 0 ;
  _j < 3 ;
  _j ++ ) {
    if ( ( _table [ _i ] [ _j ] == "o" && _table [ _i + 1 ] [ _j ] == "o" ) || ( _table [ _i ] [ _j ] == "x" && _table [ _i + 1 ] [ _j ] == "x" ) ) {
      score += b [ _i ] [ _j ] ;
    }
  }
}
for ( int _i = 0 ;
i < 3 ;
_i ++ ) {
  for ( int _j = 0 ;
  _j < 2 ;
  _j ++ ) {
    if ( ( _table [ _i ] [ _j ] == "o" && _table [ _i + 1 ] [ _j ] == "o" ) || ( _table [ _i ] [ _j ] == "x" && _table [ _i + 1 ] [ _j ] == "x" ) ) {
      score += c [ _i ] [ _j ] ;
    }
  }
}
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  final int counter = 0 ;
  final String _writeMemo = _accessible [ i ] [ 0 ] ;
  if ( _writeMemo != null && ( counter < memo . size ( ) ) ) {
    return memo . get ( _writeMemo ) ;
  }
  int max = - 10 * 10 ;
  int min = 10 * 10 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( _accessible [ i ] [ j ] ) {
        final boolean [ ] [ ] accessible = new