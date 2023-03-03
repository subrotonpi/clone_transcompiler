static private int get ( int N , int code , int i , int j ) {
  int idx = i * N + j ;
  return ( code >> idx ) & 1 ;
}
