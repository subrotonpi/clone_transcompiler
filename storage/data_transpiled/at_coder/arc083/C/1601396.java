public static int solve ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > P_list = Lists . newArrayList ( ) ;
  List < Integer > X_list = Lists . newArrayList ( ) ;
  List < List < Integer >> child_list = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    child_list . get ( P_list . get ( i - 2 ) ) . add ( i ) ;
  }
  int [ ] color1 = new int [ N + 1 ] ;
  int [ ] color2 = new int [ N + 1 ] ;
  /* solve knapsack */
  int [ ] L = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    int min_acc = Integer . valueOf ( Math . min ( color1 [ i ] , color2 [ i ] ) ) ;
    if ( min_acc > M ) {
      return - 1 ;
    }
    else {
      int add_can = M - min_acc ;
      Set < Integer > add_set = new HashSet < > ( ) ;
      add_set . add ( 0 ) ;
      for ( int j = 0 ;
      j < L . length ;
      j ++ ) {
        int add_j = Integer . valueOf ( Math . max ( color1 [ j ] , color2 [ j ] ) - Math . min ( color1 [ j ] , color2 [ j ] ) ) ;
        Set < Integer > add_set_ = new HashSet < > ( add_set . size ( ) ) ;
        for ( int s : add_set ) {
          if ( s + add_j <= add_can ) {
            add_set_ . add ( s + add_j ) ;
          }
        }
        add_set = add_set ;
      }
      int total = Integer . valueOf ( Math . min ( color1 [ j ] , color2 [ j ] ) ) ;
      return total - Math . max ( add_set . size ( ) , min_acc ) ;
    }
  }
  String res = "POSSIBLE" ;
  for ( int i = N ;
  i > 0 ;
  i -- ) {
    switch ( child_list . get ( i ) . size ( ) ) {
      case 0 : break ;
      case 1 : int j = child_list . get ( i ) . get ( 0 ) ;
      if ( Integer . valueOf ( Math . min ( color1 [ j ] , color2 [ j ] ) ) > X_list . get ( i - 1 ) ) {
        res = "IMPOSSIBLE" ;
        break ;
      }
      else if ( Integer . valueOf (