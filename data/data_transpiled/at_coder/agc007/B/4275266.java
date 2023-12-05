public static int [ ] solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > p = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    p . add ( Integer . parseInt ( input . nextLine ( ) ) - 1 ) ;
  }
  return p . toArray ( ) ;
}
