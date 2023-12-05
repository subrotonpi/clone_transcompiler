static final Scanner solve = new Scanner ( System . in ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int X = scanner . nextInt ( ) ;
  final int S = scanner . nextInt ( ) ;
  final int R = scanner . nextInt ( ) ;
  final int t = scanner . nextInt ( ) ;
  final int N = scanner . nextInt ( ) ;
  final Map < Integer , Integer > intervals = new HashMap < > ( ) ;
  int prev = 0 ;
  for ( ;
  N > 0 ;
  ) {
    final int b = scanner . nextInt ( ) ;
    final int e = scanner . nextInt ( ) ;
    final int w = scanner . nextInt ( ) ;
    intervals . put ( S , b - prev ) ;
    intervals . put ( S + w , e - b ) ;
    prev = e ;
  }
  intervals . put ( S , X - prev ) ;
  assert sum ( intervals . values ( ) ) == X ;
  long time = 0 ;
  for ( final Map . Entry < Integer , Integer > e : intervals . entrySet ( ) ) {
    final int v = e . getKey ( ) ;
    final int d = e . getValue ( ) ;
    final int V = v + R - S ;
    final double q = Math . min ( 1.0 * d / V , t ) ;
    t -= q ;
    time += 1.0 * d / v - 1.0 * q * ( V - v ) / v ;
  }
  System . out . println ( fout , time ) ;
  if ( scanner . hasNext ( ) ) {
    scanner . nextLine ( ) ;
  }
  final long startTime = System . nanoTime ( ) ;
  scanner . close ( ) ;
  scanner . close ( ) ;
  assert false : "not all lines are processed" ;
  scanner . close ( ) ;
  return scanner ;
}
