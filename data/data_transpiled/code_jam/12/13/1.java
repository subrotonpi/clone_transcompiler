static final int [ ] [ ] solve ( int m , int n , int [ ] times ) {
  int [ ] [ ] times = new int [ m ] [ n ] ;
  int [ ] [ ] c = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < times . length ;
  i ++ ) {
    int j = times [ i ] [ 0 ] ;
    int t = times [ i ] [ 1 ] ;
    int c_a = j * n + i * 2 ;
    int c_b = j * n + i * 2 ;
    int change = true ;
    for ( int ii = 0 ;
    ii < m ;
    ii ++ ) {
      if ( times [ i ] [ 0 ] == 'L' ) continue ;
      int pos_1 = t * F ( cars [ i ] [ 1 ] , 1 ) + F ( cars [ ii ] [ 1 ] , 1 ) ;
      int pos_2 = t * F ( cars [ i ] [ 2 ] , 1 ) + F ( cars [ ii ] [ 2 ] , 1 ) ;
      if ( pos_1 < pos_2 + F ( cars [ i ] [ 1 ] , 1 ) && pos_2 < pos_1 + F ( cars [ i ] [ 2 ] , 1 ) ) {
        change = false ;
        int t_a = 2 + j * n + ii * 2 + 1 ;
        for ( int x = 0 ;
        x < t ;
        x ++ ) if ( times [ i ] [ x ] >= 0 ) continue ;
        dfs ( x , 0 ) ;
        if ( ! change ) ans = times [ i ] [ k ] ;
        else ok = false ;
        break ;
      }
    }
    if ( ok ) System . out . println ( "Case #%d: Possible" ) ;
    else System . out . println ( "Case #%d: %.10f" , ans . length , ans . length / ans . length ) ;
  }
  for ( int t_t = 1 ;
  t_t <= t_n ;
  t_t ++ ) {
    n = Integer . parseInt ( solve ( times [ i ] [ 1 ] ) ) ;
    cars = new cars [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = solve ( times [ i ] [ 2 ] , times [ j ] [ 1 ] ) ;
      int b = solve ( times [ i ] [ 2 ] , times [ j ] [ 2 ] ) ;
      if ( ( b > 0 ) || t <