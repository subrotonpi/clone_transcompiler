public static double min ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  double ans = Double . MAX_VALUE ;
  Point [ ] point = new Point [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) point [ i ] = new Point ( Integer . parseInt ( input ) ) ;
  Arrays . sort ( point , new Comparator < Point > ( ) {
    @ Override public int compare ( Point o1 , Point o2 ) {
      return o1 . x - o2 . x ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    for ( int j = i + K ;
    j <= N ;
    j ++ ) {
      Point [ ] check = point . subList ( i , j ) ;
      double x = check [ check . length - 1 ] . x - check [ 0 ] . x ;
      Arrays . sort ( check , new Comparator < Point > ( ) {
        @ Override public int compare ( Point o1 , Point o2 ) {
          return o1 . y - o2 . y ;
        }
      }
      ) ;
      for ( int k = 0 ;
      k < j - i - K + 1 ;
      k ++ ) {
        double y = check [ k + K - 1 ] . y - check [ k ] . y ;
        ans = Math . min ( ans , x * y ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
