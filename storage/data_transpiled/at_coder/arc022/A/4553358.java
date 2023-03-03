public static void input ( ) {
  s = input . readLine ( ) ;
  int f = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( f ) {
      case 0 : case 'i' : case 'I' : f ++ ;
      break ;
      case 1 : case 'c' : case 'C' : f ++ ;
      break ;
      case 2 : case 't' : case 'T' : f ++ ;
      break ;
    }
    if ( f == 3 ) {
      break ;
    }
  }
  if ( f == 3 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
