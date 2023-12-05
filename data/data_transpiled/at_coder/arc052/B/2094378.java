static final double [ ] [ ] C = new double [ N ] [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int [ ] X = new int [ N ] ;
  int [ ] R = new int [ N ] ;
  int [ ] H = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    X [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    R [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    H [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] A = new int [ Q ] ;
  int [ ] B = new int [ Q ] ;
  for ( int j = 0 ;
  j < Q ;
  j ++ ) {
    A [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    B [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int MAX_X = 3 * 10 * 4 ;
  double [ ] V = new double [ MAX_X ] ;
  for ( int x = 0 ;
  x < MAX_X ;
  x ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( X [ i ] > x || X [ i ] + H [ i ] < x ) {
        continue ;
      }
      else {
        double Rleft = ( X [ i ] + H [ i ] - x ) * R [ i ] / H [ i ] ;
        double Rright = Math . max ( 0 , ( X [ i ] + H [ i ] - ( x + 1 ) ) * R [ i ] / H [ i ] ) ;
        double Vleft = Math . PI * Rleft * Rleft * ( X [ i ] + H [ i ] - x ) / 3 ;
        double Vright = Math . PI * Rright * Rright * ( X [ i ] + H [ i ] - ( x + 1 ) ) / 3 ;
        V [ x ] += Vleft - Vright ;
      }
    }
  }
  double [ ] cumSum = new double [ MAX_X + 1 ] ;
  for ( int x = 0 ;
  x < MAX_X ;
  x ++ ) {
    cumSum [ x + 1 ] = V [ x ] + cumSum [ x ] ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    double res = cumSum [ B [ i ] ] - cumSum [ A [ i ] ]