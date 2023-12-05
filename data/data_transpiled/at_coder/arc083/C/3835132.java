public static int [ ] inpl ( ) {
  return Arrays . stream ( input . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  @ SuppressWarnings ( "resource" ) LinkedHashMap < Integer , Integer > Chi = new LinkedHashMap < Integer , Integer > ( ) ;
  LinkedHashMap < Integer , Integer > F = new LinkedHashMap < Integer , Integer > ( ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] Par = new int [ N ] ;
  for ( int i = 0 ;
  i < Par . length ;
  i ++ ) Par [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] Dis = new int [ N ] ;
  int [ ] X = inpl ( ) ;
  LinkedHashMap < Integer , Integer > Col = new LinkedHashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Chi . put ( Par [ i ] , i ) ;
  }
  Queue < Integer > Q = new LinkedList < Integer > ( ) ;
  int ctr = 0 ;
  while ( ctr < N ) {
    Integer st = Q . remove ( ) ;
    if ( Chi . get ( st ) == null ) continue ;
    for ( int j : Chi . get ( st ) ) {
      Dis [ j ] = Dis [ st ] + 1 ;
      ctr ++ ;
      Q . add ( j ) ;
    }
  }
  Chi . remove ( 0 ) ;
  int mD = max ( Dis ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) F . put ( Dis [ i ] , i ) ;
  for ( int d = mD ;
  d >= 0 ;
  d -- ) {
    for ( int i : F . get ( d ) ) {
      if ( Chi . get ( i ) == null ) {
        Col . put ( i , new Integer ( 0 ) ) ;
        continue ;
      }
      int Su = 0 ;
      Map < Integer , Integer > H = new TreeMap < Integer , Integer > ( ) ;
      H . put ( 0 , 0 ) ;
      for ( int j : Chi . get ( i ) ) {
        int a = Col . get ( j ) ;
        int b = Col . get ( j ) ;
        Su += a + b ;
        Map < Integer , Integer > G = new TreeMap < Integer , Integer > ( ) ;
        for ( int k : H . keySet ( ) ) {
          if ( a