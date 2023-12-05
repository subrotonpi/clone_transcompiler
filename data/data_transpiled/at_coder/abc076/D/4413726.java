static final double [ ] getDoubleValues ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > T = Lists . newArrayList ( ) ;
  List < Integer > V = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T . add ( i ) ;
    V . add ( i ) ;
  }
  T = Arrays . copyOf ( T , T . size ( ) ) ;
  V = Arrays . copyOf ( V , V . size ( ) ) ;
  int [ ] accT = new int [ T . length ] ;
  for ( int i = 0 ;
  i < T . length ;
  i ++ ) {
    accT [ i ] = T [ i ] ;
  }
  final int INF = 10 * 9 ;
  int t2_max = accT . length - 1 * 2 ;
  double [ ] speeds = new double [ t2_max + 1 ] ;
  for ( int i = 0 ;
  i < t2_max ;
  i ++ ) {
    int t0 = accT [ i ] - 1 ;
    int t1 = accT [ i ] + 1 ;
    int v = V [ i ] ;
    double [ ] sptmp = new double [ t2_max + 1 ] ;
    sptmp [ 0 ] = v ;
    sptmp [ 1 ] += 0.5 ;
    sptmp [ 2 ] += 0.5 ;
    sptmp [ 3 ] += 0.5 ;
    speeds = Math . min ( speeds , sptmp ) ;
  }
  double ans = Math . max ( speeds , 0 ) / 2 ;
  System . out . println ( ans ) ;
}
