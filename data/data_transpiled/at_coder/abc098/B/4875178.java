public static void input ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  String oriStr = input . nextLine ( ) ;
  int max = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    String former = oriStr . substring ( 0 , i + 1 ) ;
    String latter = oriStr . substring ( i + 1 , n ) ;
    int common = 0 ;
    for ( int j = 0 ;
    j < 26 ;
    j ++ ) {
      if ( former . indexOf ( ( char ) ( j + 97 ) ) != - 1 && latter . indexOf ( ( char ) ( j + 97 ) ) != - 1 ) {
        common ++ ;
      }
    }
    if ( max <= common ) {
      max = common ;
    }
  }
  System . out . println ( max ) ;
}
