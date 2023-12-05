static int N , int D , int X , int ... A = map ( Integer :: parseInt , BufferedReader reader ) {
  int ans = X ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += 1 + ( D - 1 ) / A [ i ] ;
  }
  System . out . println ( ans ) ;
}
