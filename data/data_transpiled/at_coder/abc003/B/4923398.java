public static void input ( Scanner in ) {
  String hoge = in . nextLine ( ) ;
  String huga = in . nextLine ( ) ;
  int ans = 0 ;
  String c = "atcoder" ;
  for ( int i = 0 ;
  i < hoge . length ( ) ;
  i ++ ) {
    String a = hoge . substring ( i , i + 1 ) ;
    String b = huga . substring ( i , i + 1 ) ;
    if ( ( a . equals ( b ) ) && ( c . indexOf ( a ) == - 1 ) ) {
      ans += 0 ;
    }
    else {
      if ( ( c . indexOf ( a ) == - 1 ) && ( b . equals ( "@" ) ) ) {
        ans += 0 ;
      }
      else if ( ( c . indexOf ( b ) == - 1 ) && ( a . equals ( "@" ) ) ) {
        ans += 0 ;
      }
      else {
        ans += 1 ;
      }
    }
  }
  if ( ( ans == 0 ) && ( c . indexOf ( "@" ) == - 1 ) ) {
    System . out . println ( "You can win" ) ;
  }
  else {
    System . out . println ( "You will lose" ) ;
  }
}
