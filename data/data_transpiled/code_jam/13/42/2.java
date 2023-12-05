public static List < Integer > read ( ) {
  return Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  {
    int best = rank , tot = 0 ;
    if ( rank == tot - 1 ) return 0 ;
    return tot / 2 + best ( ( rank + 1 ) / 2 , tot / 2 ) ;
  }
  {
    int worst = rank , tot = 0 ;
    if ( rank == 0 ) return 0 ;
    return tot / 2 + worst ( ( rank - 1 ) / 2 , tot / 2 ) ;
  }
  Arrays . sort ( T ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    int n = read ( ) ;
    int P = read ( ) ;
    int ans1 = 0 , ans2 = 2 * n - 1 ;
    int L = 0 , R = 2 * n - 1 ;
    while ( L < R ) {
      int m = ( L + R + 1 ) / 2 ;
      if ( worst ( m , 2 * n ) >= P ) R = m - 1 ;
      else L = m ;
    }
    ans1 = L ;
    L = 0 , R = 2 * n - 1 ;
    while ( L < R ) {
      int m = ( L + R + 1 ) / 2 ;
      if ( best ( m , 2 * n ) < 2 * n - P ) R = m - 1 ;
      else L = m ;
    }
    ans2 = L ;
    System . out . println ( String . format ( "Case #%d: %d %d" , i , ans1 , ans2 ) ) ;
  }
  return Arrays . asList ( ) ;
}
