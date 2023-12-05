static final Scanner input = new Scanner ( System . in ) {
  private final double INF = Double . POSITIVE_INFINITY ;
  private final int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> l = new ArrayList < > ( Q ) ;
  final int [ ] Sum = new int [ 10 * 5 + 1 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    l . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  /*for(int i=2; i<= (int) Math.sqrt(n); i++){
  if(i*i>n){
  break;
  }
  if(n%i==0){
  return false;
  }
  }*/
  return l . size ( ) != 1 ;
}
