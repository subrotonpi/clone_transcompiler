public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] d = new int [ C ] [ N ] ;
  int [ ] [ ] c = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) d [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] cSet = new int [ 3 ] [ C ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      cSet [ ( i + j ) % 3 ] [ c [ i ] [ j ] - 1 ] ++ ;
    }
  }
  double ans = 1e9 ;
  for ( int c_1 = 0 ;
  c_1 < C ;
  c_1 ++ ) {
    for ( int c_2 = 0 ;
    c_2 < C ;
    c_2 ++ ) {
      for ( int c_3 = 0 ;
      c_3 < C ;
      c_3 ++ ) {
        if ( c_1 == c_2 || c_1 == c_3 || c_2 == c_3 ) continue ;
        int [ ] cList = new int [ C ] ;
        for ( int i = 0 ;
        i < C ;
        i ++ ) {
          for ( int j = 0 ;
          j < 3 ;
          j ++ ) {
            k += d [ i ] [ cList [ j ] - 1 ] * cSet [ j ] [ i ] ;
          }
        }
        ans = Math . min ( ans , k ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
