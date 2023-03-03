public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] a = new int [ n ] [ m ] ;
  int [ ] [ ] b = new int [ m ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = new int [ n ] ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    b [ i ] = new int [ n ] ;
  }
  boolean ans = false ;
  for ( int i = 0 ;
  i < n - m ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - m ;
    j ++ ) {
      int match = 0 ;
      for ( int k = 0 ;
      k < m ;
      k ++ ) {
        for ( int l = 0 ;
        l < m ;
        l ++ ) {
          if ( a [ k + i ] [ l + j ] == b [ k ] [ l ] ) {
            match ++ ;
          }
        }
      }
      if ( match == m * m ) {
        ans = true ;
      }
    }
  }
  if ( n == m ) {
    int match = 0 ;
    for ( int k = 0 ;
    k < m ;
    k ++ ) {
      for ( int l = 0 ;
      l < m ;
      l ++ ) {
        if ( a [ k ] [ l ] == b [ k ] [ l ] ) {
          match ++ ;
        }
      }
    }
    if ( match == m * m ) {
      ans = true ;
    }
  }
  if ( ans ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
