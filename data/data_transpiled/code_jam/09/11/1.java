static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int n = scanner . nextInt ( ) ;
  final int i = scanner . nextInt ( ) ;
  scanner . nextLine ( ) ;
  final int [ ] t = new int [ n ] ;
  for ( i = 1 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = scanner . nextInt ( ) ;
    scanner . nextLine ( ) ;
    b /= i ;
  }
  Arrays . sort ( t ) ;
  int res = 0 ;
  for ( int y : t ) {
    res = res * t [ y ] ;
  }
  return res ;
}
