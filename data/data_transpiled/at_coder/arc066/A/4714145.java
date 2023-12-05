static final int [ ] getSummarizingArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    A . add ( Integer . parseInt ( s ) ) ;
  }
  Arrays . sort ( A ) ;
  List < Integer > List = new ArrayList < > ( ) ;
  if ( N % 2 == 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      List . add ( i / 2 * 2 + 1 ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      List . add ( Math . ceil ( i / 2 ) * 2 ) ;
    }
  }
  if ( A . size ( ) != List . size ( ) ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( 2 * ( N / 2 ) % ( 10 * 9 + 7 ) ) ;
  }
  return A . toArray ( ) ;
}
