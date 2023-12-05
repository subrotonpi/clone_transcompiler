static final Scanner getScanner ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  final int T = in . nextInt ( ) ;
  final int N = in . nextInt ( ) ;
  final int K = in . nextInt ( ) ;
  final int [ ] tops = new int [ N ] ;
  final int [ ] sides = new int [ N ] ;
  final List < Pair < Integer , Integer >> pans = new ArrayList < > ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    final int N = in . nextInt ( ) ;
    final int K = in . nextInt ( ) ;
    final int [ ] tops = new int [ N ] ;
    final int [ ] sides = new int [ N ] ;
    final Pair < Integer , Integer > [ ] pans = new Pair [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int r = in . nextInt ( ) ;
      final int h = in . nextInt ( ) ;
      final int side = h * r * 2 ;
      final int top = r * r ;
      pans [ i ] = new Pair < > ( side , top ) ;
    }
    Arrays . sort ( pans ) ;
    int ret = 0 ;
    int largest = 0 ;
    for ( int i = N - ( K - 1 ) ;
    i < N ;
    i ++ ) {
      final Pair < Integer , Integer > pan = pans [ i ] ;
      largest = Math . max ( largest , pan . second ) ;
      ret += pan . first ;
    }
    pans = pans . subList ( 0 , N - ( K - 1 ) ) ;
    ret += largest ;
    final int [ ] pans2 = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final Pair < Integer , Integer > pan = pans [ i ] ;
      pans2 [ i ] = pan . first + Math . max ( 0 , pan . second - largest ) ;
    }
    ret += Collections . max ( pans2 , 0 ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ( ret * Math . PI ) ) ;
  }
  return in ;
}
