public static int [ ] [ ] RH ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] RH = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) RH [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  int [ ] [ ] GCP_all = new int [ 100000 ] [ 100000 ] ;
  int [ ] Rate_all = new int [ 100000 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int rate = RH [ i ] [ 0 ] ;
    int hand = RH [ i ] [ 1 ] ;
    GCP_all [ rate ] [ hand ] ++ ;
  }
  for ( int rate = 1 ;
  rate < 100000 ;
  rate ++ ) Rate_all [ rate ] = Rate_all [ rate - 1 ] + GCP_all [ rate - 1 ] [ 0 ] + GCP_all [ rate - 1 ] [ 1 ] + GCP_all [ rate - 1 ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int rate = RH [ i ] [ 0 ] ;
    int hand = RH [ i ] [ 1 ] ;
    int w = GCP_all [ rate ] [ hand - 2 ] ;
    int d = GCP_all [ rate ] [ hand ] ;
    System . out . println ( Rate_all [ rate ] + w + " " + N - ( Rate_all [ rate ] + w ) - d + " " + d - 1 + " " + w ) ;
  }
  return Rate_all ;
}
