@ Nonnull public static LinkedHashMap < Integer , Integer > getLinkedList ( ) {
  final int n = 10 ;
  final int c = 0 ;
  final int [ ] [ ] D = LIR ( c ) ;
  final int [ ] [ ] CL = Lists . permutations ( c , 3 ) ;
  int ans = inf ;
  for ( int i = 0 ;
  i < 30 ;
  i ++ ) {
    final int [ ] amari0 = new int [ n ] ;
    final int [ ] amari2 = new int [ n ] ;
    for ( int y = 0 ;
    y < n ;
    y ++ ) {
      final int amari = ( y + y ) % 3 ;
      if ( amari == 0 ) amari0 [ C [ y ] ] ++ ;
      if ( amari == 1 ) amari1 [ C [ y ] ] ++ ;
      if ( amari == 2 ) amari2 [ C [ y ] ] ++ ;
    }
    for ( int c0 = 0 ;
    c0 < c ;
    c0 ++ ) {
      final int c1 = ( y + y ) % 3 ;
      final int c2 = ( y + y ) % 3 ;
      ans += D [ c0 ] [ c1 ] * amari0 [ c1 ] ;
      ans += D [ c1 ] [ c2 ] * amari1 [ c1 ] ;
      ans += Math . min ( ans , ans ) ;
    }
  }
  return new LinkedHashMap < > ( ) {
    {
      @ Override public int get ( ) {
        return 0 ;
      }
    }
  }
  ;
}
