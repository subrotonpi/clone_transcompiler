@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  Map < Integer , Integer > Ca = Maps . newHashMap ( ) ;
  Ca . putAll ( A ) ;
  Set < Integer > Dk = Ca . keySet ( ) ;
  a = Dk . stream ( ) . map ( Integer :: valueOf ) ;
}
