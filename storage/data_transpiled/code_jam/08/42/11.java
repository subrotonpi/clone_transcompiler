private static String solve ( ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  int M = Integer . parseInt ( readLine ( ) ) ;
  int A = Integer . parseInt ( readLine ( ) ) ;
  for ( int x = 1 ;
  x <= N ;
  x ++ ) {
    for ( int y = 1 ;
    y <= M ;
    y ++ ) {
      if ( x * y < A ) continue ;
      for ( int a = 0 ;
      a <= x ;
      a ++ ) {
        for ( int b = 0 ;
        b <= y ;
        b ++ ) {
          if ( x * y - a * b == A ) {
            return StringUtil . join ( String . valueOf ( i ) , " " , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" , "" "," "," "," "" , "" , "" , "" "," "," "" , "" "," "" , "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "," "" , "" "" , "" " ,