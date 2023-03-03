static final int [ ] binarySearch ( int a , int b , int q ) {
  int i , j ;
  int x ;
  int i , j ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  final int INF = 3 * 10 * 10 ;
  S = new int [ a ] ;
  for ( i = 0 ;
  i < a ;
  i ++ ) S [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  S = new int [ S . length ] ;
  S [ i ] = - INF ;
  S [ i ] = INF ;
  for ( j = 0 ;
  j < b ;
  j ++ ) T = new int [ b ] ;
  for ( i = 0 ;
  i < b ;
  i ++ ) T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  T = new int [ T . length ] ;
  for ( j = 0 ;
  j < q ;
  j ++ ) T [ j ] = - INF ;
  for ( ;
  i < q ;
  i ++ ) {
    x = Integer . parseInt ( input . nextLine ( ) ) ;
    i = Arrays . binarySearch ( S , x ) ;
    j = Arrays . binarySearch ( T , x ) ;
    A = new int [ ] {
      Math . max ( S [ i ] - x , T [ j ] - x ) , Math . max ( x - S [ i - 1 ] , x - T [ j - 1 ] ) , S [ i ] - T [ j - 1 ] + Math . min ( S [ i ] - x , x - T [ j - 1 ] ) , T [ j ] - S [ i ] - S [ j ] + Math . min ( x - S [ i - 1 ] , T [ j ] - x ) }
      ;
      System . out . println ( min ( A ) ) ;
    }
    return A ;
  }
  