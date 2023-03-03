public static boolean prime ( int i ) {
  if ( i == 2 ) {
    return true ;
  }
  else {
    if ( i % 2 == 0 ) {
      return false ;
    }
    for ( int j = 3 ;
    j <= ( int ) ( i * 0.5 ) ;
    j += 2 ) {
      if ( i % j == 0 ) {
        return false ;
      }
    }
    return true ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l_r = new int [ Q ] ;
  for ( int j = 0 ;
  j < Q ;
  j ++ ) {
    l_r [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] Csum = new int [ 10 * 5 + 1 ] ;
  int cnt = 0 ;
  for ( int j = 3 ;
  j <= 10 * 5 ;
  j += 2 ) {
    if ( prime ( j ) && prime ( ( j + 1 ) / 2 ) ) {
      cnt ++ ;
    }
    Csum [ j ] = cnt ;
  }
  for ( int j = 0 ;
  j < l_r . length ;
  j ++ ) {
    System . out . println ( Csum [ l_r [ j ] ] - Csum [ l_r [ j ] - 2 ] ) ;
  }
  return false ;
}
