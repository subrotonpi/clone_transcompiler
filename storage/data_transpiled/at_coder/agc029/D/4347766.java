public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  int [ ] Y = new int [ N ] ;
  Map < Integer , Set < Integer >> D = new HashMap < Integer , Set < Integer >> ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    Y [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( D . containsKey ( X [ i ] ) ) {
      D . get ( X [ i ] ) . add ( Y [ i ] ) ;
    }
    else {
      D . put ( X [ i ] , new Set < Integer > ( Y [ i ] ) ) ;
    }
  }
  int ans = H ;
  int left = 1 ;
  int right = 1 ;
  for ( int x = 2 ;
  x <= H ;
  x ++ ) {
    if ( ! ( D . containsKey ( x ) ) ) {
      right = Math . min ( right + 1 , W ) ;
    }
    else {
      int first = Math . min ( D . get ( x ) , x ) ;
      if ( left <= first && first <= right ) {
        ans = Math . min ( ans , x - 1 ) ;
        break ;
      }
      if ( first != right + 1 ) {
        right = Math . min ( right + 1 , W ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
