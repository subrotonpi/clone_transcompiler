public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  ArrayList < Point > red = new ArrayList < > ( ) ;
  ArrayList < Point > blue = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    red . add ( new Point ( a , b ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    blue . add ( new Point ( c , d ) ) ;
  }
  Collections . sort ( red , new Comparator < Point > ( ) {
    public int compare ( Point o1 , Point o2 ) {
      return - o1 . y ;
    }
  }
  ) ;
  Collections . sort ( blue , new Comparator < Point > ( ) {
    public int compare ( Point o1 , Point o2 ) {
      return o1 . x ;
    }
  }
  ) ;
  int answer = 0 ;
  for ( int i = 0 ;
  i < blue . size ( ) ;
  i ++ ) {
    Point b = blue . get ( i ) ;
    for ( int j = 0 ;
    j < red . size ( ) ;
    j ++ ) {
      Point r = red . get ( j ) ;
      if ( r . x < b . x && r . y < b . y ) {
        answer ++ ;
        red . remove ( j ) ;
        break ;
      }
    }
  }
  System . out . println ( answer ) ;
}
