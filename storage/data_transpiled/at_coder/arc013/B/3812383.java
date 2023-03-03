public static int C = Integer . parseInt ( input ) {
  List < List < Integer >> NML = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    NML . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int N = NML . size ( ) ;
  int M = NML . size ( ) ;
  int L = NML . size ( ) ;
  System . out . println ( max ( N ) * max ( M ) * max ( L ) ) ;
  return N ;
}
