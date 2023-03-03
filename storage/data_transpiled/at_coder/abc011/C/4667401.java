public static int N1 = Integer . parseInt ( input ) {
  List < Integer > NG_list = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    NG_list . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( NG_list . contains ( N1 ) ) {
    System . out . println ( "NO" ) ;
  }
  else {
    double [ ] dp = new double [ N1 + 1 ] ;
    for ( int i = N1 + 1 ;
    i < dp . length ;
    i ++ ) {
      dp [ i ] = 1e5 ;
    }
    dp [ N1 ] = 0 ;
    for ( int i = N1 ;
    i > 0 ;
    i -- ) {
      if ( NG_list . contains ( i ) ) {
        continue ;
      }
      else {
        for ( int j = 1 ;
        j < 4 ;
        j ++ ) {
          dp [ i - j ] = Math . min ( dp [ i ] + 1 , dp [ i - j ] ) ;
        }
      }
    }
    if ( dp [ 0 ] <= 100 ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  return dp [ 0 ] ;
}
