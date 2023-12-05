public static int n ( Scanner input ) {
  String hoge = input . next ( ) ;
  if ( ( hoge . length ( ) % 2 ) == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else if ( ( hoge . indexOf ( "a" ) + hoge . indexOf ( "b" ) + hoge . indexOf ( "c" ) ) != hoge . length ( ) ) {
    System . out . println ( - 1 ) ;
  }
  else if ( ( hoge . charAt ( hoge . length ( ) / 2 ) != 'b' ) ) {
    System . out . println ( - 1 ) ;
  }
  else {
    char [ ] hoge_r = hoge . toCharArray ( ) ;
    int flag = 0 ;
    for ( int i = 0 ;
    i < hoge . length ( ) / 2 ;
    i ++ ) {
      if ( ( hoge . charAt ( i ) == 'a' ) && ( hoge_r [ i ] == 'c' ) ) {
        flag ++ ;
      }
      else if ( ( hoge . charAt ( i ) == 'b' ) && ( hoge_r [ i ] == 'b' ) ) {
        flag ++ ;
      }
      else if ( ( hoge . charAt ( i ) == 'c' ) && ( hoge_r [ i ] == 'a' ) ) {
        flag ++ ;
      }
      else {
        flag ++ ;
      }
    }
    if ( ( flag != 0 ) && ( flag != 0 ) ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( hoge . length ( ) / 2 ) ;
    }
  }
  return flag ;
}
