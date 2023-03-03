public static void input ( Scanner in ) {
  int c = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    int n = in . nextInt ( ) , k = in . nextInt ( ) , b = in . nextInt ( ) , t = in . nextInt ( ) ;
    int [ ] x = in . nextInt ( ) ;
    int [ ] v = in . nextInt ( ) ;
    boolean [ ] ok = new boolean [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( x [ j ] + v [ j ] * t >= b ) ok [ j ] = true ;
      else ok [ j ] = false ;
    }
    int res = 0 ;
    int minus = 0 ;
    for ( boolean cur : new ArrayList < > ( ok ) ) {
      if ( k <= 0 ) break ;
      if ( cur ) {
        res += minus ;
        k -- ;
      }
      else minus ++ ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ":" + " " + res ) ;
    if ( k == 0 ) System . out . println ( res ) ;
    else System . out . println ( "IMPOSSIBLE" ) ;
  }
}
