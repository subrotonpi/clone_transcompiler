public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] S = list ( input . nextLine ( ) ) . toCharArray ( ) ;
  int [ ] W_num = new int [ N ] ;
  int w_num = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    W_num [ i ] = w_num ;
    if ( ( S [ i ] == 'W' ) && ( S [ i ] == 'E' ) ) w_num ++ ;
  }
  int e_num = 0 ;
  double min_cost = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int j = N - 1 - i ;
    int tmp = W_num [ j ] + e_num ;
    min_cost = Math . min ( tmp , min_cost ) ;
    if ( ( S [ j ] == 'E' ) && ( S [ i ] == 'E' ) ) e_num ++ ;
  }
  System . out . println ( min_cost ) ;
}
