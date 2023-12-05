static final int [ ] [ ] getDistance ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] abc = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    abc [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] dist = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dist [ i ] [ 9999999 ] = i ;
  }
  Map [ ] e = new Map [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    e [ i ] = new HashMap ( ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = abc [ i ] [ 0 ] ;
    int b = abc [ i ] [ 1 ] ;
    int c = abc [ i ] [ 2 ] ;
    e [ a ] [ b ] = c + 1 ;
    e [ b ] [ a ] = c + 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int h [ ] = new int [ n ] ;
    HeapSort . sort ( h , 0 , i ) ;
    Set < Integer > temp = new HashSet < Integer > ( ) ;
    while ( temp . size ( ) < n ) {
      int d = HeapSort . sort ( h , p ) ;
      int p = d ;
      while ( p >= 0 ) {
        d = HeapSort . sort ( h , p ) ;
        p = d + e [ p ] [ x ] ;
      }
      dist [ i ] [ p ] = d ;
      temp . add ( p ) ;
      for ( Integer x : e [ p ] . keySet ( ) ) {
        HeapSort . sort ( h , d + e [ p ] [ x ] , x ) ;
      }
    }
  }
  int ans = m ;
  for ( int a = 0 ;
  a < abc . length ;
  a ++ ) {
    for ( int b = 0 ;
    b < abc [ i ] ;
    b ++ ) {
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( c + 1 == dist [ a ] [ i ] - dist [ b ] [ i ] ) {
          ans -- ;
          break ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return e ;
}
