public static int cases = input . nextInt ( ) {
  for ( int cas = 1 ;
  cas <= cases ;
  cas ++ ) {
    int n = input . nextInt ( ) ;
    int [ ] a = map ( Integer . parseInt ( input . nextLine ( ) ) , Integer . parseInt ( input . nextLine ( ) ) ) ;
    System . out . printf ( "Case #%d:%n" , cas ) ;
    int [ ] l = new int [ n ] ;
    int [ ] r = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      l [ i ] = 0 ;
      r [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < i + 1 ;
      j ++ ) {
        if ( a [ j ] > a [ i ] ) l [ i ] += 1 ;
      }
      for ( int j = i ;
      j < n ;
      j ++ ) {
        if ( a [ i ] < a [ j ] ) r [ i ] += 1 ;
      }
    }
    int res = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      res += Math . min ( l [ i ] , r [ i ] ) ;
    }
    System . out . println ( res ) ;
  }
  return cases ;
}
