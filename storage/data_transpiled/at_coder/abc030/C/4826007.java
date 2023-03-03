public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ m ] ;
  int cnt = 0 ;
  int cnt_a = 0 ;
  int cnt_b = 0 ;
  int now = 0 ;
  while ( true ) {
    boolean flg = true ;
    for ( int i = cnt_a ;
    i < n ;
    i ++ ) {
      if ( a [ i ] >= now ) {
        now = a [ i ] + x ;
        cnt_a = i + 1 ;
        flg = false ;
        break ;
      }
    }
    if ( flg ) break ;
    flg = true ;
    for ( int j = cnt_b ;
    j < m ;
    j ++ ) {
      if ( b [ j ] >= now ) {
        now = b [ j ] + y ;
        cnt_b = j + 1 ;
        flg = false ;
        break ;
      }
    }
    if ( flg ) break ;
    else cnt ++ ;
  }
  System . out . println ( cnt ) ;
}
