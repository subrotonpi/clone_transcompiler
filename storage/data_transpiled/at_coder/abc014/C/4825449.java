static final Scanner input = new Scanner ( System . in ) {
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private static final long serialVersionUID = 1L ;
  private final long n = Long . parseLong ( input . nextLine ( ) ) ;
  private final List < List < Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ab . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] imos = new int [ 1000002 ] ;
  for ( int ai = 0 ;
  ai < ab . size ( ) ;
  ai ++ ) {
    int bi = ab . get ( ai ) ;
    imos [ ai ] ++ ;
    imos [ bi + 1 ] -- ;
  }
  int [ ] pop = new int [ 1000001 ] ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < pop . length ;
  i ++ ) {
    int imosi = imos [ i ] ;
    if ( i == 1000001 ) break ;
    tmp += imosi ;
    pop [ i ] = tmp ;
    pop [ i ] = tmp ;
  }
  System . out . println ( max ( pop ) ) ;
  return pop ;
}
