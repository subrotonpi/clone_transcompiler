public static final Function I = new Function ( ) {
  int i , j ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] v = new int [ n ] ;
  int [ ] d = new int [ 2 * n ] ;
  for ( ;
  i < m ;
  i ++ ) {
    v [ s ] = 0 ;
  }
  for ( ;
  i < m ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int g = Integer . parseInt ( input . nextLine ( ) ) ;
    v [ s ] = 1 << g - 1 ;
  }
  v [ s ] = 1 << g ;
  for ( ;
  i < m ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int g = Integer . parseInt ( input . nextLine ( ) ) ;
    v [ s ] |= 1 << g - 1 ;
  }
  v [ s ] = 1 << g ;
  for ( ;
  i < m ;
  i ++ ) {
    int g = Integer . parseInt ( input . nextLine ( ) ) ;
    v [ s ] = 1 << g ;
    v [ s ] |= 1 << g - 1 ;
  }
  v [ s ] = 1 << g ;
  for ( ;
  i < m ;
  i ++ ) {
    int j = Integer . parseInt ( input . nextLine ( ) ) ;
    v [ s ] = 1 << g ;
    v [ s ] |= 1 << g - 1 ;
  }
  v [ s ] = 1 << g ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int j = i ;
    int j = i ;
    int i = i % n ;
    int j = i ;
    v [ j ] = i ;
    v [ j ++ ;
    v [ j ] = i << g ;
    v [ j ] = i ;
    v [ j ] = 1 << g ;
    v [ j ] = 1 << g - 1 ;
  }
  for ( i = 0 ;
  i < m ;
  i ++ ) {
    int s = i ;
    int g = i ;
    v [ s ] = i ;
    v [ j