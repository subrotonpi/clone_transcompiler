public static int N = Integer . parseInt ( input ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 1 , l = 0 , count = 1 , set = a [ 0 ] ;
  Method add = set . add , remove = set . remove ;
  for ( int n = 1 ;
  n < a . length ;
  n ++ ) {
    while ( set . contains ( a [ l ] ) ) {
      remove . invoke ( a [ l ] ) ;
      count -- ;
      l ++ ;
    }
    add . invoke ( a [ n ] ) ;
    count ++ ;
    if ( ans < count ) ans = count ;
  }
  return ans ;
}
