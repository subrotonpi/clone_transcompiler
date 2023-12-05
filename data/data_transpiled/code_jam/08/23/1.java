static void foo ( int idx2 , BufferedReader iReader ) throws IOException {
  final int K = Integer . parseInt ( iReader . readLine ( ) . trim ( ) ) ;
  final int [ ] t = new int [ K ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) t [ i ] = Integer . parseInt ( iReader . readLine ( ) . trim ( ) ) ;
  final int n = t [ 0 ] ;
  final int [ ] d = t . clone ( ) ;
  final int [ ] res = new int [ K + 1 ] ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) res [ i ] = i ;
  final HashMap < Integer , Integer > res2 = new HashMap < Integer , Integer > ( ) ;
  int idx = K - 1 ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    final int ni = ( idx + i ) % res . size ( ) ;
    res2 . put ( res [ ni ] , i ) ;
    -- idx ;
    idx = ni - 1 ;
  }
  System . out . println ( "Case #" + idx2 + ": " + Arrays . toString ( d ) ) ;
}
