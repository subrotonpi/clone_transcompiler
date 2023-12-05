public static void input ( ) {
  String s = input . nextLine ( ) ;
  int l = s . length ( ) ;
  l -- ;
  if ( l % 2 > 0 ) {
    l -- ;
  }
  for ( int i = l ;
  i >= 1 ;
  i -= 2 ) {
    int j = i / 2 ;
    if ( s . substring ( 0 , j ) . equals ( s . substring ( j , j * 2 ) ) ) {
      System . out . println ( i ) ;
      break ;
    }
  }
}
