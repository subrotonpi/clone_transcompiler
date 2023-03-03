static final int [ ] [ ] range ( int n ) {
  final int [ ] f = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) f [ i ] = Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final int [ ] [ ] p = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p [ i ] = Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = - Integer . MAX_VALUE ;
  for ( int [ ] pattern : range ( 2 , 10 ) ) {
    if ( Arrays . binarySearch ( pattern , p [ 0 ] ) == 0 ) continue ;
    int tmp_ans = 0 ;
    for ( int mise_i = 0 ;
    mise_i < n ;
    mise_i ++ ) {
      int tmp_cnt = 0 ;
      for ( int i = 0 ;
      i < pattern . length ;
      i ++ ) {
        if ( pattern [ i ] == 1 && f [ mise_i ] [ i ] == 1 ) tmp_cnt ++ ;
      }
      tmp_ans += p [ mise_i ] [ tmp_cnt ] ;
    }
    if ( tmp_ans > ans ) ans = tmp_ans ;
  }
  System . out . println ( ans ) ;
}
