static final int [ ] [ ] [ ] a ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] [ ] a = new int [ n ] [ m ] [ n ] ;
  int [ ] [ ] b = new int [ n ] [ m ] [ n ] ;
  for ( int i = 0 ;
  i < n - m + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - m + 1 ;
    j ++ ) {
      boolean flag = true ;
      for ( int x = 0 ;
      x < m ;
      x ++ ) {
        for ( int y = 0 ;
        y < m ;
        y ++ ) {
          if ( b [ x ] [ y ] != a [ i + x ] [ j + y ] ) {
            flag = false ;
            break ;
          }
        }
        if ( ! flag ) break ;
      }
    }
  }
  return a ;
}
