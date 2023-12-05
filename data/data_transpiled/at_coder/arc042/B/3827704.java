public static int x = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> xy = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xy . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  xy . add ( xy . get ( 0 ) ) ;
  /*between x and y */
  boolean between = a <= x && a <= b ;
  /*dist a and b and c and d */
  double res = ( ( a - c ) * ( a - c ) + ( b - d ) * ( b - d ) ) * .5 ;
  /*suichoku */
  List < Integer > p1 = xy . get ( 0 ) ;
  List < Integer > p2 = xy . get ( 1 ) ;
  int x = p1 . get ( 0 ) ;
  int y = p2 . get ( 0 ) ;
  int mn_x = Math . min ( p1 . get ( 0 ) , p2 . get ( 0 ) ) ;
  int mx_x = Math . max ( p1 . get ( 0 ) , p2 . get ( 0 ) ) ;
  int mn_y = Math . min ( p1 . get ( 1 ) , p2 . get ( 1 ) ) ;
  int mx_y = Math . max ( p1 . get ( 1 ) , p2 . get ( 1 ) ) ;
  int mid_x = ( mn_x + mx_x ) / 2 ;
  int mid_y = ( mn_y + mx_y ) / 2 ;
  if ( a == 0 ) {
    if ( ! between ( y , mn_y , mx_y ) ) return 10 * 10 ;
    return Math . abs ( x - mn_x ) ;
  }
  double c = b / a ;
  if ( b == 0 ) {
    if ( ! between ( x , mn_x , mx_x ) ) return 10 * 10 ;
    return Math . abs ( y - mn_y ) ;
  }
  int k = - a / b ;
  double xx = - ( y - p1 . get ( 1 ) - k * x + c * p1 . get ( 0 ) ) / ( k - c ) ;
  double yy = ( c * y - c * k * x - k * p1 . get ( 1 ) + c * k * p1 . get ( 0 ) ) / (