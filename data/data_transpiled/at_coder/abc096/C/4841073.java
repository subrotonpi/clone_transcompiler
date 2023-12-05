public static void che ( int h , int w ) {
  int i , j ;
  String s ;
  a = new String [ h ] ;
  for ( i = 0 ;
  i < h ;
  i ++ ) {
    a [ i ] = input . next ( ) ;
  }
  {
    switch ( i ) {
      case 0 : if ( a [ i + 1 ] . charAt ( j ) == '#' ) return ;
      break ;
      case h - 1 : if ( a [ i - 1 ] . charAt ( j ) == '#' ) return ;
      break ;
      default : if ( a [ i - 1 ] . charAt ( j ) == '#' || a [ i + 1 ] . charAt ( j ) == '#' ) return ;
    }
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
}
