public static int [ ] [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] ans = new int [ n ] [ ] ;
  int [ ] [ ] b = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = new int [ ] {
      - a [ i ] [ 0 ] , i }
      ;
    }
    Arrays . sort ( b ) ;
    int [ ] [ ] c = new int [ 2 ] [ ] ;
    int p = b [ 0 ] [ 0 ] ;
    int [ ] x = new int [ ] {
      - b [ 0 ] [ 0 ] , b [ 0 ] [ 1 ] , 1 }
      ;
      for ( int i = 1 ;
      i < n ;
      i ++ ) {
        if ( - b [ i ] [ 0 ] == a [ i ] [ 0 ] ) {
          x [ 2 ] = i + 1 ;
        }
        else {
          c [ p ] = a [ i ] ;
          x = new int [ ] {
            - b [ i ] [ 0 ] , b [ i ] [ 1 ] , i + 1 }
            ;
          }
        }
        c [ p ] = x ;
        int s = 0 ;
        int t = c [ 0 ] [ 1 ] ;
        for ( int i = 0 ;
        i < c . length - 1 ;
        i ++ ) {
          int x = ( c [ i ] [ 0 ] - c [ i + 1 ] [ 0 ] ) * c [ i ] [ 2 ] ;
          t = Math . min ( t , c [ i ] [ 1 ] ) ;
          ans [ t ] += x ;
          s += x ;
        }
        ans [ Math . min ( t , c [ c . length - 1 ] [ 1 ] ) ] += Arrays . copyOfRange ( a , 1 , a . length - s ) ;
        for ( int x : ans ) {
          System . out . println ( x ) ;
        }
        return ans ;
      }
      