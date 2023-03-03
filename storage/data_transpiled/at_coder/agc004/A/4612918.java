public static int [ ] [ ] a ( int a , int b , int c ) {
  int one = Math . abs ( ( a / 2 ) * b * c - ( a - a / 2 ) * b * c ) ;
  int two = Math . abs ( a * ( b / 2 ) * c - a * ( b - b / 2 ) * c ) ;
  int thr = Math . abs ( a * b * ( c / 2 ) - a * b * ( c - c / 2 ) ) ;
  return null ;
}
