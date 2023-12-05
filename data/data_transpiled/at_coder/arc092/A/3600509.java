public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > red = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    red . add ( new Integer ( a ) ) ;
  }
  List < Integer > blue = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    blue . add ( new Integer ( c ) ) ;
  }
  Collections . sort ( red ) ;
  Collections . sort ( blue ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = blue . get ( i ) . intValue ( ) ;
    int d = blue . get ( i ) . intValue ( ) ;
    int ind = - 1 ;
    int yMax = - 1 ;
    for ( int j = 0 ;
    j < N - ans ;
    j ++ ) {
      int a = red . get ( j ) . intValue ( ) ;
      int b = red . get ( j ) . intValue ( ) ;
      if ( a < c && b < d && yMax < b ) {
        ind = j ;
        yMax = b ;
      }
      else if ( a > c ) {
        break ;
      }
    }
    if ( ind > - 1 ) {
      ans ++ ;
      red . remove ( ind ) ;
    }
  }
  System . out . println ( ans ) ;
}
