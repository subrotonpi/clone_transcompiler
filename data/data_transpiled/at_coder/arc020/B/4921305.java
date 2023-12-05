public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input ) ;
  int d = n ;
  for ( int i = 1 ;
  i < 11 ;
  i ++ ) {
    for ( int j = 1 ;
    j < 11 ;
    j ++ ) {
      if ( i != j ) {
        int e = 0 ;
        int [ ] h = new int [ n / 2 + 1 ] ;
        for ( int s = 0 ;
        s < n ;
        s ++ ) if ( h [ s ] != a [ s ] ) e ++ ;
      }
      else d = Math . min ( e , d ) ;
    }
  }
  System . out . println ( d * c ) ;
}
