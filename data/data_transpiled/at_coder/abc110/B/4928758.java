public static void main ( String input , int n , int m , int x , int y ) {
  int x_li [ ] = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int y_li [ ] = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int ans_f = 0 ;
  for ( int z = x + 1 ;
  z <= y ;
  z ++ ) {
    int x_not_f = 0 ;
    int y_not_f = 0 ;
    for ( int i = 0 ;
    i < x_li . length ;
    i ++ ) {
      if ( z <= x_li [ i ] ) {
        x_not_f = 1 ;
      }
    }
    for ( int i = 0 ;
    i < y_li . length ;
    i ++ ) {
      if ( z > y_li [ i ] ) {
        y_not_f = 1 ;
      }
    }
    if ( x_not_f == 0 && y_not_f == 0 ) {
      ans_f = 1 ;
      break ;
    }
  }
  if ( ans_f == 1 ) {
    System . out . println ( "No War" ) ;
  }
  else {
    System . out . println ( "War" ) ;
  }
}
