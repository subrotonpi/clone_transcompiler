static final int [ ] getMatchingValues ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Tuple < Integer , Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ab . add ( Tuple . of ( i ) ) ;
  }
  return ab . toArray ( ) ;
}
