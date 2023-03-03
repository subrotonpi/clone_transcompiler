static final void main ( String [ ] args ) {
  Scanner input = new Scanner ( System . in ) ;
  int inf = 10 * 18 ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > lrs = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) lrs . add ( Collections . singletonList ( inf ) ) ;
  int [ ] imos = new int [ M + 1 ] ;
  for ( int li = 0 ;
  li < N ;
  li ++ ) {
    int ri = lrs . get ( li ) ;
    int si = lrs . get ( ri ) ;
    imos [ ri ] -= si ;
  }
  int tmp = 0 ;
  int [ ] loss = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int imosi = imos [ i ] ;
    if ( i == M ) break ;
    tmp += imosi ;
    loss [ i ] = tmp ;
  }
  System . out . println ( Arrays . asList ( lrs ) - Math . min ( loss ) ) ;
}
