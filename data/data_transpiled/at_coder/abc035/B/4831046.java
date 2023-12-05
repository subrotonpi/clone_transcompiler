public static void hoge ( ) {
  String t = input . nextLine ( ) ;
  int kyori_1 = Math . abs ( hoge . indexOf ( "U" ) - hoge . indexOf ( "D" ) ) ;
  int kyori_2 = Math . abs ( hoge . indexOf ( "R" ) - hoge . indexOf ( "L" ) ) ;
  int hatena = hoge . indexOf ( "?" ) ;
  if ( ( t . equals ( "1" ) ) && ( hoge . length ( ) == 1 ) ) {
    System . out . println ( kyori_1 + kyori_2 + hatena ) ;
  }
  else if ( ( t . equals ( "2" ) ) && ( hatena > kyori_1 + kyori_2 ) ) {
    System . out . println ( hoge . length ( ) % 2 ) ;
  }
  else {
    System . out . println ( kyori_1 + kyori_2 - hatena ) ;
  }
}
