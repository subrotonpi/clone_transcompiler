public static void input ( ) {
  String sd = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int lsd = sd . length ( ) ;
  int lt = t . length ( ) ;
  for ( int i = lsd - lt ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j < lt ;
    j ++ ) {
      if ( sd . charAt ( i + j ) != '?' && sd . charAt ( i + j ) != t . charAt ( j ) ) {
        break ;
      }
    }
    else {
      System . out . println ( ( sd . substring ( 0 , i ) + t + sd . substring ( i + lt ) ) . replace ( "?" , "a" ) ) ;
      break ;
    }
  }
  else {
    System . out . println ( "UNRESTORABLE" ) ;
  }
}
