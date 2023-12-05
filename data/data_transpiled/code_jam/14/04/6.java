static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  int n = scanner . nextInt ( ) ;
  int testIdx = scanner . nextInt ( ) ;
  int N = scanner . nextInt ( ) ;
  int [ ] naomi = getNaomi ( N ) ;
  int [ ] ken = getLeaks ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      nums [ i ] = Double . parseDouble ( scanner . nextLine ( ) ) ;
      tot += next . length ;
      nums [ i ] = next [ j ] ;
    }
  }
  return scanner ;
}
