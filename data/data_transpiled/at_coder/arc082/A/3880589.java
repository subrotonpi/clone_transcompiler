static final long [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i + 1 ) ;
  }
  List < Integer > A_minus = Arrays . asList ( A . toArray ( ) ) ;
  long ans = new LongCounter ( A + A_plus + A_minus ) . getCount ( ) ;
  System . out . println ( ans ) ;
}
