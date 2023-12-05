static final double [ ] range ( int i ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  int [ ] Y = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    X [ j ] = Math . min ( x , y ) ;
    Y [ j ] = Math . max ( x , y ) ;
  }
  double res1 = ( max ( Y ) - min ( Y ) ) * ( max ( X ) - min ( X ) ) ;
  int [ ] x_arg = new int [ N ] ;
  x_arg [ N ] = X ;
  int max_a = max ( X ) ;
  min_a = min ( min_a ) ;
  max_a = max ( max_a ) ;
  return x_arg ;
}
