static final int K = Integer . parseInt ( input . readLine ( ) ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < String >> src = Arrays . asList ( input . readLine ( ) . split ( " " ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] ptn = new int [ 4 ] ;
    for ( int j = 0 ;
    j < ptn . length ;
    j ++ ) {
      int [ ] d = new int [ K ] ;
      for ( List < String > v : src ) {
        int w = v . get ( j ) . split ( " " ) ;
        int i = 0 ;
        for ( char c : v ) {
          int ci = Integer . parseInt ( c ) - 1 ;
          if ( i + ptn [ ci ] > w . length ) break ;
          if ( d [ ci ] == 0 ) {
            d [ ci ] = w . substring ( i , i + ptn [ ci ] ) ;
          }
          else {
            if ( d [ ci ] != w . substring ( i , i + ptn [ ci ] ) ) break ;
          }
          i += ptn [ ci ] ;
        }
      }
      else {
        if ( i == w . length ) continue ;
      }
      break ;
    }
  }
  else {
    System . out . println ( ( String ) d ) ;
    exit ( ) ;
  }
  return N ;
}
