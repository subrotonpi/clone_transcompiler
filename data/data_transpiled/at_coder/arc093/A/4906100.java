public static int [ ] getcosts ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  As . add ( 0 , 0 ) ;
  As . add ( 0 , 0 ) ;
  int total = 0 ;
  int [ ] costs = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    total += Math . abs ( As . get ( i ) - As . get ( i - 1 ) ) ;
    int x1 = As . get ( i ) - As . get ( i - 1 ) ;
    int x2 = As . get ( i + 1 ) - As . get ( i - 1 ) ;
    if ( x1 * x2 >= 0 && Math . abs ( x1 ) <= Math . abs ( x2 ) ) costs [ i ] = 0 ;
    else if ( x1 * x2 >= 0 && Math . abs ( x1 ) > Math . abs ( x2 ) ) costs [ i ] = 2 * Math . abs ( x2 - x1 ) ;
    else if ( x1 * x2 < 0 ) costs [ i ] = 2 * Math . abs ( x1 ) ;
  }
  total += Math . abs ( As . get ( N + 1 ) - As . get ( N ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) System . out . println ( total - costs [ i ] ) ;
  return costs ;
}
