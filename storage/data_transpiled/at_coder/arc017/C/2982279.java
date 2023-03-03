@ VisibleForTesting static void main ( String input ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  final double eps = 10 * - 7 ;
  final char [ ] AtoZ = new char [ 65 ] ;
  for ( int i = 65 ;
  i < 65 + 26 ;
  i ++ ) AtoZ [ i ] = ( char ) i ;
  final char [ ] atoz = new char [ 97 ] ;
  for ( int i = 97 ;
  i < 97 + 26 ;
  i ++ ) AtoZ [ i ] = ( char ) i ;
  /* inpl */
  final int N = input . length ( ) ;
  final int X = input . length ( ) ;
  final int [ ] ww = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ww [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  final int k = N / 2 ;
  final boolean [ ] flags1 = new boolean [ k ] ;
  final boolean [ ] flags2 = new boolean [ N - k ] ;
  final NavigableMap < Integer , Integer > dd1 = new TreeMap < Integer , Integer > ( ) ;
  final TreeSet < Integer > ed = new TreeSet < Integer > ( ) ;
  final TreeSet < Integer > dd2 = new TreeSet < Integer > ( ) ;
  for ( final boolean [ ] flag : flags1 ) {
    int tmp = 0 ;
    for ( int i = 0 ;
    i < flag . length ;
    i ++ ) {
      final boolean fl = flag [ i ] ;
      if ( fl ) tmp += ww [ i ] ;
    }
    if ( dd1 . get ( tmp ) == 0 ) ed . add ( tmp ) ;
    dd1 . put ( tmp , 1 ) ;
  }
  for ( final boolean [ ] flag : flags2 ) {
    int tmp = 0 ;
    for ( int i = 0 ;
    i < flag . length ;
    i ++ ) {
      final boolean fl = flag [ i ] ;
      if ( fl ) tmp += ww [ i + k ] ;
    }
    dd2 . put ( tmp , 1 ) ;
  }
  int ans = 0 ;
  for ( final Integer e : ed ) ans += dd1 . get ( e ) * dd2 . get ( X - e ) ;
  System . out . println ( ans ) ;
}
