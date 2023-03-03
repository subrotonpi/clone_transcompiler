public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int s = Integer . parseInt ( input ) ;
  int [ ] [ ] deg = new int [ n ] [ ] ;
  int [ ] [ ] g = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    x = x - 1 ;
    y = y - 1 ;
    deg [ x ] [ s [ y ] ] ++ ;
    deg [ y ] [ s [ x ] ] ++ ;
    g [ x ] [ y ] ++ ;
    g [ y ] [ x ] ++ ;
  }
  boolean [ ] was = new boolean [ n ] ;
  int [ ] que = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    was [ i ] = false ;
    que [ i ] = i ;
  }
  for ( int q = 0 ;
  q < n ;
  q ++ ) {
    for ( int j = 0 ;
    j < g [ q ] ;
    j ++ ) {
      deg [ j ] [ s [ q ] ] -- ;
      if ( deg [ j ] [ s [ q ] ] == 0 || deg [ j ] [ s [ q ] ] == 0 ) {
        if ( ! was [ j ] ) {
          was [ j ] = true ;
          que [ j ] = j ;
        }
      }
    }
  }
  System . out . println ( que . length == n ? "No" : "Yes" ) ;
}
