static final Scanner getInput ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  final int N = in . nextInt ( ) ;
  final Set < String > names = new HashSet < > ( ) ;
  final Map < String , Integer > mag = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String big = in . next ( ) ;
    final String _m = in . next ( ) ;
    final String small = in . next ( ) ;
    final int m = Integer . parseInt ( _m ) ;
    names . add ( big ) ;
    names . add ( small ) ;
    mag . put ( small , new Integer ( m ) ) ;
    mag . get ( big ) . put ( small , new Integer ( 1 ) ) ;
  }
  final int len = names . size ( ) ;
  final PriorityQueue < Pair < String , Integer >> q = new PriorityQueue < > ( N ) ;
  q . add ( new Pair < > ( names . iterator ( ) . next ( ) , new Integer ( 1 ) ) ) ;
  int i = 0 ;
  final HashMap < String , Integer > val = new HashMap < > ( ) ;
  final Comparator < Pair < String , Integer >> mul = new Comparator < Pair < String , Integer >> ( ) {
    public int compare ( final Pair < String , Integer > a , final Pair < String , Integer > b ) {
      final int n1 = a . getFirst ( ) . compareTo ( b . getFirst ( ) ) ;
      final int d1 = a . getFirst ( ) . compareTo ( b . getFirst ( ) ) ;
      final int n2 = b . getFirst ( ) . compareTo ( b . getFirst ( ) ) ;
      final int d2 = b . getFirst ( ) . compareTo ( b . getFirst ( ) ) ;
      final int n = n1 * n2 ;
      final int d = d1 * d2 ;
      final int g = gcd ( n , d ) ;
      return ( n / g ) - ( d / g ) ;
    }
  }
  ;
  while ( i < q . size ( ) ) {
    final String u = q . poll ( ) . first ( ) ;
    final int ur = q . poll ( ) . second ( ) ;
    i ++ ;
    val . put ( u , ur ) ;
    for ( final Map . Entry < String , Integer > m : mag . get ( u ) . entrySet ( ) ) {
      if ( val . containsKey ( m . getValue ( ) ) ) {
        continue ;
      }
      q . add ( new Pair < > ( m .