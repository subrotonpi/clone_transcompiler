public static boolean check ( int [ ] mask ) {
  for ( int e : mask ) {
    if ( e == 1 ) return true ;
  }
  return false ;
  /* main program */
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] ia = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ia [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] a = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      a [ i ] [ ia [ i ] - 1 ] = j ;
    }
  }
  mask = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    mask [ i ] = 1 ;
  }
  int res = 1000 ;
  while ( check ( mask ) ) {
    int [ ] cnt = new int [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int [ ] alst = a [ i ] ;
      int mi = 3000 ;
      int pos = - 1 ;
      for ( int j = 0 ;
      j < m ;
      j ++ ) {
        if ( alst [ j ] < mi ) mask [ j ] = 0 ;
      }
    }
  }
  System . out . println ( res ) ;
}
