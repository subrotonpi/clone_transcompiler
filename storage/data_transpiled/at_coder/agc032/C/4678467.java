@ Sys public static void setRecursionLimit ( ) {
  setRecursionLimit ( 10 * 9 ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  E = new int [ n + 1 ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    E [ i ] = new int [ n + 1 ] ;
  }
  used [ n ] = false ;
  IN = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    E [ a ] [ b ] = new int [ b ] ;
    E [ b ] [ a ] = new int [ b ] ;
    E [ b ] [ a ] = new int [ b ] ;
    IN [ a ] [ b ] = 1 ;
    IN [ b ] [ a ] ++ ;
  }
  int cnt_4 = 0 ;
  int cnt_6 = 0 ;
  int [ ] v_4 = new int [ 2 ] ;
  for ( int j = 1 , i = 0 ;
  j < IN [ 0 ] ;
  j ++ ) {
    if ( i % 2 == 1 || i == 0 ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
    if ( i >= 4 ) {
      cnt_4 ++ ;
      v_4 [ 0 ] = j + 1 ;
    }
    if ( i >= 6 ) cnt_6 ++ ;
  }
  /* if (v == 0) return v_4[0]; if (v == 0) return v_4[1]; for (int e = 0; e < E[v]; e++) {
  if (e == 0) continue;
  return;
  }*/
  if ( cnt_4 > 2 || cnt_6 >= 1 ) {
    System . out . println ( "Yes" ) ;
  }
  else if ( cnt_4 == 2 ) {
    if ( Arrays . equals ( v_4 , E [ 0 ] ) ) {
      System . out . println ( "No" ) ;
    }
    else {
      System . out . println ( "Yes" ) ;
    }
  }
  else {
    System . out . println ( "No" )