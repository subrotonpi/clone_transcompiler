public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double t = Double . parseDouble ( input . nextLine ( ) ) ;
  double a = Double . parseDouble ( input . nextLine ( ) ) ;
  List < Double > hs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hs . add ( i ) ;
  }
  double bestSub = 100000 ;
  int ans = - 1 ;
  for ( int i = 0 ;
  i < hs . size ( ) ;
  i ++ ) {
    double h = hs . get ( i ) ;
    double t_ = t - h * 0.006 ;
    if ( Math . abs ( a - t_ ) < bestSub ) {
      bestSub = Math . abs ( a - t_ ) ;
      ans = i + 1 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
