static final String solve ( int N , int M , int A ) {
  psyco . full ( ) ;
  /*for (int x1 = N+1; x1 < N; x1++) {
  for (int y1 = M+1; y1 < N; y1++) {
  for (int x2 = N+1; x2 < N; x2++) {
  for (int y2 = M+1; y2 < M; y2++) {
  int S = Math.abs(x1*y2-x2*y1);
  if (S == A) return "" + 0 + x1 + " " + y1 + " " + x2 + " " + y2;
  }
  }
  }
  }*/
  return "IMPOSSIBLE" ;
}
