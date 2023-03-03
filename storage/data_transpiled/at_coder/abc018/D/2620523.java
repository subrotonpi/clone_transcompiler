@ VisibleForTesting static int [ ] [ ] combinations ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int p = Integer . parseInt ( input ) ;
  int q = Integer . parseInt ( input ) ;
  int r = Integer . parseInt ( input ) ;
  List < List < Integer >> combos = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    info . add ( new int [ m ] ) ;
  }
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    info . get ( a - 1 ) [ b - 1 ] = c ;
  }
  combos = Lists . newArrayList ( ) ;
  for ( List < Integer > combo : combos ) {
    int [ ] temp = new int [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      for ( int w : combo ) {
        temp [ i ] += info . get ( w ) [ i ] ;
      }
    }
    temp = Arrays . copyOf ( temp , temp . length ) ;
    ans = Math . max ( ans , Arrays . copyOfRange ( temp , 0 , q ) ) ;
  }
  System . out . println ( ans ) ;
  return null ;
}
