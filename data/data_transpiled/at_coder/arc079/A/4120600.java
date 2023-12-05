static final String getBinaryString ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int M = Integer . parseInt ( input ) ;
  final int [ ] cand_1 = new int [ M ] ;
  final int [ ] cand_2 = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int a = Integer . parseInt ( input ) ;
    final int b = Integer . parseInt ( input ) ;
    if ( a == 1 ) {
      cand_1 [ i ] = b ;
    }
    else if ( b == N ) {
      cand_2 [ i ] = a ;
    }
  }
  String ans = "IMPOSSIBLE" ;
  HeapSort . sort ( cand_1 ) ;
  HeapSort . sort ( cand_2 ) ;
  while ( cand_1 . length != 0 && cand_2 . length != 0 ) {
    if ( cand_1 [ 0 ] < cand_2 [ 0 ] ) {
      HeapSort . sort ( cand_1 ) ;
    }
    else if ( cand_1 [ 0 ] > cand_2 [ 0 ] ) {
      HeapSort . sort ( cand_2 ) ;
    }
    else {
      ans = "POSSIBLE" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
