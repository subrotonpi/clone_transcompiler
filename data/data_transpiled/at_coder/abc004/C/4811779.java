static void card ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) % 30 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int m1 = i % 5 ;
    int m2 = m1 + 1 ;
    card [ m1 ] = card [ m2 ] ;
  }
  String [ ] mapResult = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    mapResult [ i ] = String . valueOf ( i ) ;
  }
}
