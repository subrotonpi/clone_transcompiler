public static int tests = Integer . parseInt ( input ) {
  Map < Character , Integer > map = new HashMap < Character , Integer > ( ) ;
  map . put ( '>' , new Integer ( 0 ) ) ;
  map . put ( '<' , new Integer ( 0 ) ) ;
  map . put ( '^' , new Integer ( - 1 ) ) ;
  map . put ( 'v' , new Integer ( 1 ) ) ;
  for ( int t = 1 ;
  t <= tests ;
  t ++ ) {
    int n = Integer . parseInt ( input . readLine ( ) ) ;
    int m = Integer . parseInt ( input . readLine ( ) ) ;
    BiPredicate < Integer , Integer > bounds = ( x , y ) -> ( 0 <= x && x < n ) && ( 0 <= y && y < m ) ;
    char [ ] [ ] f = new char [ n ] [ m ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) f [ i ] = input . toCharArray ( ) ;
    int total = 0 , fail = false ;
    {
      int x = 0 ;
      int y = 0 ;
      while ( bounds . test ( x , y ) ) {
        if ( f [ x ] [ y ] != '.' ) return true ;
        x += d [ 0 ] ;
        y += d [ 1 ] ;
      }
      while ( bounds . test ( x , y ) ) {
        if ( f [ x ] [ y ] != '.' ) return true ;
        x += d [ 0 ] ;
        y += d [ 1 ] ;
      }
      return false ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < m ;
      j ++ ) {
        if ( f [ i ] [ j ] == '.' ) continue ;
        Integer dd = map . get ( f [ i ] [ j ] ) ;
        if ( safe ( i , j , dd ) ) continue ;
        if ( Arrays . binarySearch ( f [ i ] , "<>^v" ) >= 0 ) fail = true ;
        else total ++ ;
      }
    }
    System . out . println ( "Case #" + t + ": " + ( fail ? "IMPOSSIBLE" : total ) ) ;
  }
  return tests ;
}
