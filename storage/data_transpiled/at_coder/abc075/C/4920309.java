static void print ( int n , int m ) {
  int [ ] aa , bb , ans = new int [ m ] ;
  a [ 0 ] = new int [ n ] , ans = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    aa [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    bb [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ 0 ] [ i ] = aa ;
    a [ 1 ] [ i ] = bb ;
    boolean flag = true ;
    while ( flag ) {
      flag = false ;
      for ( int i = 1 ;
      i <= n ;
      i ++ ) {
        int c = 0 ;
        int [ ] p = new int [ a [ 0 ] . length ] ;
        for ( int j = 0 ;
        j < a [ 0 ] . length ;
        j ++ ) {
          if ( a [ 0 ] [ j ] == i ) c ++ ;
          p [ 0 ] = j ;
          if ( a [ 1 ] [ j ] == i ) c ++ ;
          p [ 1 ] = j ;
          if ( c > 1 ) break ;
        }
        if ( c == 1 ) {
          ans ++ ;
          a [ 0 ] [ p [ 0 ] ] = a [ 1 ] [ p [ 0 ] ] ;
          flag = true ;
          break ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
