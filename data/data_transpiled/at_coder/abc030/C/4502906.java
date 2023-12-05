static final int [ ] [ ] resize ( int N , int M ) {
  Scanner input = new Scanner ( System . in ) ;
  int X = input . nextInt ( ) ;
  int Y = input . nextInt ( ) ;
  int [ ] L1 = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L1 [ i ] = input . nextInt ( ) ;
  }
  int [ ] L2 = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L2 [ i ] = input . nextInt ( ) ;
  }
  int t = 0 ;
  int cnt = 0 ;
  final int [ ] [ ] L1 = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L1 [ i ] = input . nextInt ( ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L1 [ i ] = input . nextInt ( ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L2 [ i ] = input . nextInt ( ) ;
  }
  return L1 ;
}
