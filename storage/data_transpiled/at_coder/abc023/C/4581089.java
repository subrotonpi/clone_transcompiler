@ VisibleForTesting static void readLinkedHashMap ( ) throws IOException {
  final BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int R = Integer . parseInt ( input . readLine ( ) ) ;
  final int C = Integer . parseInt ( input . readLine ( ) ) ;
  final int K = Integer . parseInt ( input . readLine ( ) ) ;
  final int N = Integer . parseInt ( input . readLine ( ) ) ;
  final int [ ] X = new int [ R ] ;
  final int [ ] Y = new int [ C ] ;
  final int [ ] [ ] pos = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = Integer . parseInt ( input . readLine ( ) ) - 1 ;
    final int b = Integer . parseInt ( input . readLine ( ) ) ;
    X [ a ] ++ ;
    Y [ b ] ++ ;
    pos [ i ] [ 0 ] = a ;
    pos [ i ] [ 1 ] = b ;
  }
  final Counter Cx = new Counter ( X ) ;
  final Counter Cy = new Counter ( Y ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i <= K ;
  i ++ ) {
    ans += Cx . counter ( ) * Cy . counter ( ) ;
  }
  for ( int x = 0 ;
  x < pos . length ;
  x ++ ) {
    if ( X [ x ] + Y [ y ] == K ) ans -- ;
    else if ( X [ x ] + Y [ y ] == K + 1 ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
