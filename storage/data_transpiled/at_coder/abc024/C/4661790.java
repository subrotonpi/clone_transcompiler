public static int [ ] [ ] getDaysArr ( int n , int d , int k ) {
  int [ ] LR = new int [ d ] ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) LR [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] ST = new int [ k ] [ n ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) ST [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] days = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int s = ST [ i ] [ 0 ] ;
    int t = ST [ i ] [ 1 ] ;
    int tmp = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int l = LR [ j ] [ 0 ] ;
      int r = LR [ j ] [ 1 ] ;
      tmp ++ ;
      if ( l <= s && s <= r && l <= t && t <= r ) {
        System . out . println ( tmp ) ;
        break ;
      }
      if ( l <= s && s <= r ) {
        if ( Math . abs ( t - r ) < Math . abs ( t - l ) ) s = r ;
        else s = l ;
      }
    }
  }
  return days ;
}
