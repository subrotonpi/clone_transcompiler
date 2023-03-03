public static int n ( ) {
  int [ ] s = map . get ( input ) . split ( " " ) ;
  int len = s . length ;
  int num = 0 ;
  int ASC = 0 , DES = 1 , EQ = 2 , UND = 3 ;
  int state = UND ;
  if ( len <= 2 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  int i = s [ 0 ] ;
  for ( int j = 1 ;
  j < len ;
  j ++ ) {
    switch ( state ) {
      case UND : if ( i > j ) {
        state = DES ;
      }
      else if ( i < j ) {
        state = ASC ;
      }
      else {
        state = EQ ;
      }
      num ++ ;
      break ;
    }
  }
  return num ;
}
