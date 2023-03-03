public static String bBooks ( int A , int B , int N , int [ ] [ ] Boxes ) {
  final int a = Math . min ( A , B ) ;
  final int b = Math . max ( A , B ) ;
  final double hypotenuse = Math . sqrt ( a * a + b * b ) ;
  final double theta = Math . atan ( a / b ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < Boxes . length ;
  i ++ ) {
    int c = Boxes [ i ] [ 0 ] ;
    int d = Boxes [ i ] [ 1 ] ;
    c = Math . min ( c , d ) ;
    d = Math . max ( c , d ) ;
    if ( c >= a && d >= b ) {
      ans . append ( "YES" ) ;
    }
    else {
      upper = mid ;
    }
  }
  ans . append ( ans ) ;
  return ans . toString ( ) ;
}
