public static void main ( String input ) {
  int n = ( Integer ) input . split ( " " ) [ 0 ] ;
  int m = ( Integer ) input . split ( " " ) [ 1 ] ;
  int x = ( Integer ) input . split ( " " ) [ 0 ] ;
  int y = ( Integer ) input . split ( " " ) [ 1 ] ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    b [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  int cnta = 0 ;
  int cntb = 0 ;
  int now = 0 ;
  int cnt = 0 ;
  while ( true ) {
    boolean flg = true ;
    for ( int i = cnta ;
    i < n ;
    i ++ ) {
      if ( a [ i ] >= now ) {
        cnta = i + 1 ;
        now = a [ i ] + x ;
        flg = false ;
        break ;
      }
    }
    if ( flg ) {
      break ;
    }
    else {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
