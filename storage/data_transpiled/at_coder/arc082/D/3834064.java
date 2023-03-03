static final int [ ] inpl ( ) {
  return Arrays . stream ( input . nextInt ( ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] r = new int [ K + 1 ] ;
  r [ 0 ] = inpl ( ) ;
  int [ ] stu = new int [ K + 1 ] ;
  stu [ 0 ] = ( int ) X ;
  for ( int i = 1 , v = r . length ;
  i < v ;
  i += 1 ) {
    int s = stu [ i - 1 ] ;
    int t = stu [ i ] ;
    int u = stu [ i ] ;
    int ap ;
    if ( i % 2 != 0 ) {
      int rs = r [ i - 1 ] - r [ i ] ;
      ap = - rs - t ;
      if ( ap >= s ) stu [ i ] = 0 ;
      else if ( ap >= u ) stu [ i ] = s ;
      else stu [ i ] = t + rs ;
      stu [ i ] = u ;
    }
    else {
      int rs = r [ i ] - r [ i - 1 ] ;
      int ap = X - rs - t ;
      if ( ap >= s ) stu [ i ] = s ;
      else if ( ap >= u ) stu [ i ] = ap ;
      else stu [ i ] = t + rs ;
      stu [ i ] = u ;
    }
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int ti = inpl ( ) ;
    int a = inpl ( ) ;
    int x = Arrays . binarySearch ( r , ti ) ;
    ti -= r [ x - 1 ] ;
    int s = stu [ x - 1 ] ;
    int t = stu [ x - 1 ] ;
    int u = stu [ x - 1 ] ;
    int R ;
    if ( a >= s ) R = s + t ;
    else if ( a >= u ) R = a + t ;
    else R = u + t ;
    if ( x % 2 != 0 ) System . out . println ( max ( 0 , R - ti ) ) ;
    else System . out . println ( min ( X , R + ti ) ) ;
  }
  return stu ;
}
