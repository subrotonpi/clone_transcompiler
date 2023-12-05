public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Point > locations = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    locations . add ( new Point ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( locations ) ;
  int minimalArea = ( 10 * 18 ) * 5 ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    for ( int j = i + K - 1 ;
    j < N ;
    j ++ ) {
      int deltaX = locations . get ( j ) . x - locations . get ( i ) . x ;
      List < Point > sliced = locations . subList ( i , j + 1 ) ;
      Collections . sort ( sliced , new Comparator < Point > ( ) {
        @ Override public int compare ( Point p ) {
          return p . y - p . y ;
        }
      }
      ) ;
      int length = j - i + 1 ;
      if ( length < K ) {
        continue ;
      }
      for ( int k = 0 ;
      k < length - K + 1 ;
      k ++ ) {
        int deltaY = sliced . get ( k + K - 1 ) . y - sliced . get ( k ) . y ;
        int area = deltaX * deltaY ;
        minimalArea = Math . min ( area , minimalArea ) ;
      }
    }
  }
  System . out . println ( minimalArea ) ;
}
