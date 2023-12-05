static final String print = "math 's' " + "math 's' " + "math 's' " + "math 's' " + "math 's' " + "math 's' " + "inf' " + "mod 's'" ;
final int inf = 10 * 20 ;
final int mod = 10 * 9 + 7 ;
{
  final int [ ] li = new int [ N ] ;
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) {
    li [ i ] = Integer . parseInt ( li [ i ] ) ;
  }
  final int [ ] LI_ = new int [ N ] ;
  for ( int i = 0 ;
  i < LI_ . length ;
  i ++ ) {
    li [ i ] = Integer . parseInt ( LI_ [ i ] ) - 1 ;
  }
  final int [ ] LF = new int [ N ] ;
  for ( int i = 0 ;
  i < LF . length ;
  i ++ ) {
    LF [ i ] = Float . parseFloat ( LF [ i ] ) ;
  }
  final int [ ] LS = new int [ N ] ;
  for ( int i = 0 ;
  i < LS . length ;
  i ++ ) {
    LS [ i ] = Integer . parseInt ( LS [ i ] ) ;
  }
  final int [ ] I = new int [ N ] ;
  for ( int i = 0 ;
  i < LS . length ;
  i ++ ) {
    int a = i ;
    int b = i ;
    e [ a ] = new Integer ( b ) ;
    e [ b ] = new Integer ( a ) ;
  }
  final int [ ] S = new int [ N ] ;
  {
    int N = I [ 0 ] ;
  }
  {
    final int [ ] d = new int [ N ] ;
    {
      inf , inf , inf }
    }
    ;
    final PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) ;
    heapq . add ( q , new Integer ( 0 ) ) ;
    final boolean [ ] v = new boolean [ N ] ;
    while ( q . size ( ) > 0 ) {
      final int k = heapq . poll ( ) ;
      final int u = s ;
      if ( v [ u ] ) continue ;
      v [ u ] = true ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        final int uv = e [ u ] ;
        final int ud = e [ i ] ;
        if ( v [ uv ] ) continue ;
        