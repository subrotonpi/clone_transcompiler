public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] rinsetsu = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    rinsetsu [ a - 1 ] [ b - 1 ] = 1 ;
    rinsetsu [ b - 1 ] [ a - 1 ] = 1 ;
  }
  boolean [ ] visited = new boolean [ n ] ;
  int ans = 0 ;
  boolean flag = true ;
  while ( flag ) {
    flag = false ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ! visited [ i ] && Arrays . equals ( rinsetsu [ i ] , 1 ) ) {
        visited [ i ] = true ;
        ans ++ ;
        flag = true ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( rinsetsu [ i ] [ j ] == 1 ) {
            rinsetsu [ j ] [ i ] = 0 ;
          }
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
