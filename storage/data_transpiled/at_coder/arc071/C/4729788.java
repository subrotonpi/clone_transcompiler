public static void input ( Scanner scanner ) {
  String S = scanner . next ( ) ;
  String T = scanner . next ( ) ;
  int q = Integer . parseInt ( scanner . nextLine ( ) ) ;
  int [ ] SA = new int [ S . length ( ) ] ;
  int [ ] SB = new int [ SB . length ] ;
  int [ ] TA = new int [ TA . length ] ;
  int [ ] TB = new int [ TB . length ] ;
  int sa = 0 ;
  int sb = 0 ;
  int ta = 0 ;
  int tb = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case 'A' : sa ++ ;
      break ;
      case 'B' : sb ++ ;
      break ;
    }
    SA [ i ] = sa ;
    SB [ i ] = sb ;
  }
  for ( int i = 0 ;
  i < T . length ( ) ;
  i ++ ) {
    switch ( T . charAt ( i ) ) {
      case 'A' : ta ++ ;
      break ;
      case 'B' : tb ++ ;
      break ;
    }
    TA [ i ] = ta ;
    TB [ i ] = tb ;
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int a = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int b = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int c = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int d = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int sa_num = SA [ b ] - SA [ a - 1 ] ;
    int sb_num = SB [ b ] - SB [ a - 1 ] ;
    int ta_num = TA [ d ] - TA [ c - 1 ] ;
    int tb_num = TB [ d ] - TB [ c - 1 ] ;
    if ( ( sa_num + 2 * sb_num ) % 3 == ( ta_num + 2 * tb_num ) % 3 ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
}
