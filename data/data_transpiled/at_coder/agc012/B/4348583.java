@ VisibleForTesting static LinkedHashMap < Integer , Integer > createGraph ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] G = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] [ b ] = b - 1 ;
    G [ b - 1 ] [ a ] = a - 1 ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] v = new int [ Q ] ;
  int [ ] d = new int [ Q ] ;
  int [ ] c = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    v [ v . length - i - 1 ] = 0 ;
    d [ v . length - i - 1 ] = 0 ;
    c [ v . length - i - 1 ] = Integer . parseInt ( input . nextLine ( ) ) ;
    v [ v . length - i - 1 ] -- ;
  }
  Queue < Integer > q = new LinkedList < > ( ) ;
  int [ ] color = new int [ N ] ;
  int [ ] dp = new int [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    color [ i ] = 0 ;
  }
  for ( int t = 0 ;
  t < Q ;
  t ++ ) {
    if ( dp [ v [ t ] ] >= d [ t ] ) {
      continue ;
    }
    dp [ v [ t ] ] = d [ t ] ;
    q . add ( new Integer ( v [ t ] ) ) ;
    while ( ( v = q . poll ( ) ) != null ) {
      int vv = q . poll ( ) ;
      int dd = q . poll ( ) ;
      if ( color [ vv ] == 0 ) {
        color [ vv ] = c [ t ] ;
      }
      dd -- ;
      for ( int y : G [ vv ] ) {
        if ( dp [ y ] >= dd ) {
          continue ;
        }
        dp [ y ] = dd ;
        q . add ( new Integer ( y ) ) ;
      }
    }
  }
  for ( int line : color ) {
    System . out . println ( line ) ;
  }
  return G ;
}
