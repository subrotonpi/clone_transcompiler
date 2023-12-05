@ Nonnull public static Segment < Integer , Integer > createSegment ( ) {
  class Segment {
    int n ;
    int [ ] [ ] seg = new int [ n + 1 ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      seg [ i ] [ i ] = new int [ Math . pow ( 2 , n - i ) ] ;
    }
  }
  void update ( int i , Integer x ) {
    int l = i ;
    for ( int k = 0 ;
    k < n + 1 ;
    k ++ ) {
      if ( k == 0 ) {
        seg [ k ] [ l ] = x ;
        continue ;
      }
      l = l / 2 ;
      seg [ k ] [ l ] = merge ( k , l ) ;
    }
  }
  int [ ] [ ] merge ( int k , l ) {
    return new Segment < Integer , Integer > ( seg [ k - 1 ] [ 2 * l ] [ 0 ] * seg [ k - 1 ] [ 2 * l + 1 ] [ 0 ] , seg [ k - 1 ] [ 2 * l + 1 ] [ 0 ] * seg [ k - 1 ] [ 2 * l + 1 ] [ 1 ] + seg [ k - 1 ] [ 2 * l + 1 ] [ 1 ] ) ;
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  Set < Integer > L = new HashSet < Integer > ( ) ;
  List < Pair < Integer , Integer >> table = new ArrayList < Pair < Integer , Integer >> ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    double p = Double . parseDouble ( input ( ) ) ;
    double a = Double . parseDouble ( input ( ) ) ;
    double b = Double . parseDouble ( input ( ) ) ;
    L . add ( Integer . parseInt ( p ) ) ;
    table . add ( new Pair < Integer , Integer > ( Integer . parseInt ( p ) , a , b ) ) ;
  }
  int len = L . size ( ) ;
  Collections . sort ( table ) ;
  Map < Integer , Integer > dd = new TreeMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) dd . put ( L . get ( i ) , i ) ;
  Segment < Integer , Integer > Tree = new Segment < Integer , Integer > ( 17 , ( short ) 1 ) ;
  int ma = 1 ;
  int mi = 1 ;
  for (