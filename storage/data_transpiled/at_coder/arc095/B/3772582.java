static final void solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int ansn = Collections . max ( L ) ;
  int n2 = ansn / 2 ;
}
