public static int [ ] [ ] createArray ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] A = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    A [ i ] = new int [ a ] ;
    A [ i ] [ b ] = new int [ b ] ;
  }
  int [ ] [ ] C = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    C [ i ] [ c ] = new int [ c ] ;
    C [ i ] [ d ] = new int [ c ] ;
  }
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans [ i ] = 0 ;
  }
  float infinity = Float . parseFloat ( "infinity" ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    float minLength = infinity ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( Math . abs ( A [ i ] [ 0 ] - C [ j ] [ 0 ] ) + Math . abs ( A [ i ] [ 1 ] - C [ j ] [ 1 ] ) < minLength ) {
        minLength = Math . abs ( A [ i ] [ 0 ] - C [ j ] [ 0 ] ) + Math . abs ( A [ i ] [ 1 ] - C [ j ] [ 1 ] ) ;
        ans [ i ] = j + 1 ;
      }
    }
  }
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
