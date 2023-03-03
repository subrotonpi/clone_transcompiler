static final int [ ] [ ] binarySearch ( ) {
  int r = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] cnt_row = new int [ r ] ;
  int [ ] cnt_col = new int [ c ] ;
  int [ ] [ ] pos_ame = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int pos_row = Integer . parseInt ( input . readLine ( ) ) ;
    int pos_col = Integer . parseInt ( input . readLine ( ) ) ;
    cnt_row [ pos_row - 1 ] ++ ;
    cnt_col [ pos_col - 1 ] -- ;
    pos_ame [ i ] = pos_row - 1 ;
  }
  List < Integer > srtd_cnt_row = new ArrayList < > ( cnt_row ) ;
  List < Integer > srtd_cnt_col = new ArrayList < > ( cnt_col ) ;
  int ans = 0 ;
  int left_r = 0 ;
  int left_c = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < k + 1 ;
  i ++ ) {
    int right_r = binarySearch ( srtd_cnt_row , i , left_r ) ;
    int right_c = binarySearch ( srtd_cnt_col , - k + i , left_c ) ;
    ans = ans + ( right_r - left_r ) * ( right_c - left_c ) ;
    left_r = right_r ;
    left_c = right_c ;
  }
  for ( int i = 0 ;
  i < pos_ame . length ;
  i ++ ) {
    if ( cnt_row [ i ] - cnt_col [ j ] == k ) ans -- ;
    else if ( cnt_row [ i ] - cnt_col [ j ] == k + 1 ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return null ;
}
