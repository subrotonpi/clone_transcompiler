public static int [ ] [ ] getNegativeInstances ( ) {
    int n = Integer . parseInt ( input . readLine ( ) ) ;
    int m = Integer . parseInt ( input . readLine ( ) ) ;
    int d = Integer . parseInt ( input . readLine ( ) ) ;
    int [ ] a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
    int [ ] x = new int [ n ] ;
    for ( int i = n ;
    i > 0 ;
    i -- ) {
      x [ i ] = a [ i ] ;
    }
    int [ ] yy = new int [ n ] ;
    yy [ 0 ] = x ;
    for ( int i = 0 ;
    i < Integer . SIZE - 3 ;
    i ++ ) {
      int [ ] t = new int [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        t [ j ] = yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ y [ y [ y [ j ] [ j ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ) ] ] ;
      }
      yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ yy [ y [ j [ j [ j [ j ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ] ) ] ) ] ;
    }
    int [ ] [ ] z = new int [ n ] [ m ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      z [ i ] = z [ y [ i ] ] ;
    }
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      System . out . println ( Integer . valueOf (