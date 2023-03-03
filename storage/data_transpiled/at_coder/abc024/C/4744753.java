public static int N = Integer . parseInt ( input ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] LR = new int [ D ] [ K ] ;
  int [ ] [ ] SK = new int [ K ] [ K ] ;
  for ( int i = 0 ;
  i < SK . length ;
  i ++ ) {
    int start = SK [ i ] [ 0 ] ;
    int goal = SK [ i ] [ 1 ] ;
    if ( start < goal ) {
      for ( int j = 0 ;
      j < D ;
      j ++ ) {
        int l = LR [ j ] [ 0 ] ;
        int r = LR [ j ] [ 1 ] ;
        if ( l <= start && start <= r ) {
          start = r ;
          if ( start >= goal ) {
            System . out . println ( j + 1 ) ;
            start = 0 ;
            goal = 0 ;
            break ;
          }
        }
      }
    }
    if ( start > goal ) {
      for ( int j = 0 ;
      j < D ;
      j ++ ) {
        int l = LR [ j ] [ 0 ] ;
        int r = LR [ j ] [ 1 ] ;
        if ( l <= start && start <= r ) {
          start = l ;
          if ( start <= goal ) {
            System . out . println ( j + 1 ) ;
            start = 0 ;
            goal = 0 ;
            break ;
          }
        }
      }
    }
  }
  return 0 ;
}
