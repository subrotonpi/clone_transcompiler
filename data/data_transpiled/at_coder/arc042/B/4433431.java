static final double [ ] [ ] input ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> inputs = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs . add ( Collections . singletonList ( i ) ) ;
  }
  return inputs . toArray ( ) ;
}
