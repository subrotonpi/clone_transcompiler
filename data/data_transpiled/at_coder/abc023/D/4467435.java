static final double [ ] [ ] solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> hs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) hs . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  final List < Integer > husen = new ArrayList < > ( hs ) ;
  final int [ ] h = husen . get ( 0 ) ;
  final int [ ] s = husen . get ( 1 ) ;
  int pmin = Math . min ( h , 0 ) ;
  int pmax = Math . max ( h , N ) + N * Math . max ( s , 0 ) ;
  int point = ( pmin + pmax ) / 2 ;
  int [ ] j = new int [ N ] ;
  do {
    int [ ] t = ( point - h ) / s ;
    int [ ] u = Arrays . copyOfRange ( t , j , j ) ;
    if ( Arrays . equals ( u , 0 ) ) {
      pmax = point ;
      point = ( pmin + point ) / 2 ;
      if ( pmin == pmax ) break ;
    }
    else {
      pmin = point + 1 ;
      point = ( pmax + point ) / 2 + 1 ;
      if ( pmin == pmax ) break ;
    }
  }
  while ( true ) ;
  return j ;
}
