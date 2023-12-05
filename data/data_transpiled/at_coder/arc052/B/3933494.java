static final double I ( ) {
  return map ( Integer . parseInt ( input ( ) ) , range -> range , list -> range ;
  int N = range . length ;
  int Q = range . length ;
  int X = range . length ;
  int R = range . length ;
  int H = range . length ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X = V ( i ) ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    K = M ( X + H - M ( X , V ( zip ( range , I ) ) ) , 0 ) ;
  }
  System . out . println ( P . sum ( P . PI * ( K * K - L * L * 3 ) * ( R / H ) * H / 3 ) ) ;
}
