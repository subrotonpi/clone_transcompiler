static final void ? ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int M = input . nextInt ( ) ;
  final Map < Integer , Integer > dT = new HashMap < Integer , Integer > ( ) ;
  /* for (int i=0; i<M; i++) {
  int a = input.nextInt();
  int b = input.nextInt();
  int t = input.nextInt();
  dT.put(a, b, t);
  }*/
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    dT . put ( i , dT . get ( i ) ) ;
  }
}
