public static int solve ( int N , int K , List < List < Integer >> XYs ) {
  int ans = 10 * 19 + 1 ;
  Collections . sort ( XYs , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . get ( 0 ) - o2 . get ( 0 ) ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + K - 1 ;
    j < N ;
    j ++ ) {
      List < Integer > narrowedXY = new ArrayList < Integer > ( XYs . subList ( i , j + 1 ) ) ;
      Collections . sort ( narrowedXY , new Comparator < Integer > ( ) {
        @ Override public int compare ( Integer o1 , Integer o2 ) {
          return o2 . get ( 0 ) - o1 . get ( 1 ) ;
        }
      }
      ) ;
      for ( int y1 = 0 ;
      y1 < narrowedXY . size ( ) ;
      y1 ++ ) {
        for ( int y2 = y1 + K ;
        y2 < narrowedXY . size ( ) + 1 ;
        y2 ++ ) {
          int min_x = narrowedXY . get ( i ) . get ( 0 ) ;
          int max_x = narrowedXY . get ( j ) . get ( 0 ) ;
          List < Integer > ys = new ArrayList < Integer > ( ) ;
          for ( int xy : narrowedXY . subList ( y1 , y2 ) ) {
            ys . add ( xy . get ( 1 ) ) ;
          }
          int max_y = Collections . max ( ys ) ;
          int min_y = Collections . min ( ys ) ;
          ans = Math . min ( ans , Math . abs ( max_x - min_x ) * Math . abs ( max_y - min_y ) ) ;
        }
      }
    }
  }
  return ans ;
}
