public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List [ ] pic = new List [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) pic [ i ] = list ( input ) ;
  int [ ] temp = new int [ M ] ;
  int flag = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( flag == 0 ) for ( int j = 0 ;
    j < temp [ j ] ;
    j ++ ) if ( pic [ j ] [ i ] == temp [ j ] ) {
      System . out . println ( "Yes" ) ;
      flag = 1 ;
      break ;
    }
  }
  return pic ;
}
