public static void main ( String input , int a , int b , int c , int d , int e , int f ) {
  Set < Integer > x = new HashSet < Integer > ( ) ;
  Set < Integer > y = new HashSet < Integer > ( ) ;
  for ( int A = 0 ;
  A <= f && A < 100 * a ;
  A ++ ) {
    for ( int B = 0 ;
    B <= f && B < 100 * b ;
    B ++ ) {
      if ( A + B > f ) break ;
      if ( A + B > 0 ) x . add ( A + B ) ;
    }
  }
  for ( int C = 0 ;
  C <= f && C < 100 * c ;
  C ++ ) {
    for ( int D = 0 ;
    D <= f && C + D > f ;
    D ++ ) {
      if ( C + D > f ) break ;
      y . add ( C + D ) ;
    }
  }
  int ans = 0 ;
  int w = 100 * a ;
  int s = 0 ;
  for ( Integer X : x ) {
    for ( Integer Y : y ) {
      if ( X + Y <= f && 100 * Y / X <= e ) {
        if ( ans < Y / ( X + Y ) ) {
          ans = Y / ( X + Y ) ;
          w = X ;
          s = Y ;
        }
      }
    }
  }
  System . out . println ( w + s + " " + s ) ;
}
