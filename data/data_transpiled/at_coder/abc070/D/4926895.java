static final Scanner input = new Scanner ( System . in ) {
  @ Override public void next ( ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] abc = new int [ n - 1 ] [ n ] ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      abc [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] xy = new int [ q ] [ k ] ;
    for ( int i = 0 ;
    i < q ;
    i ++ ) {
      xy [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int [ ] distance = new int [ n ] ;
    int [ ] [ ] e = new int [ n ] [ n ] ;
    int [ ] [ ] w = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = abc [ i ] [ 0 ] ;
      int b = abc [ i ] [ 1 ] ;
      int c = abc [ i ] [ 2 ] ;
      e [ a - 1 ] [ b ] = b - 1 ;
      e [ b - 1 ] [ a ] = a - 1 ;
      w [ a - 1 ] [ b ] = c ;
      w [ b - 1 ] [ c ] = c ;
    }
    private boolean dfs ( int v , int par , int dist ) {
      distance [ v ] = dist ;
      if ( e [ v ] . length == 0 ) return true ;
      for ( int i = 0 ;
      i < e [ v ] . length ;
      i ++ ) {
        if ( e [ v ] [ i ] == par ) continue ;
        dfs ( e [ v ] [ i ] , v , dist + w [ v ] [ i ] ) ;
      }
    }
    dfs ( k - 1 , - 1 , 0 ) ;
    for ( int i = 0 ;
    i < xy . length ;
    i ++ ) {
      int x = xy [ i ] [ 0 ] ;
      int y = xy [ i ] [ 1 ] ;
      System . out . println ( distance [ x - 1 ] + distance [ y - 1 ] ) ;
    }
  }
}
