public static List < Integer > A = Lists . newArrayList ( ) ;
for ( String s : input . split ( " " ) ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    A = new ArrayList < > ( A ) ;
    int amax = A . remove ( A . size ( ) - 1 ) * 2 ;
    A . add ( amax ) ;
  }
}
