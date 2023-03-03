public static int p ( int n ) {
  System . out . println ( "? " + n ) ;
  String a = input . nextLine ( ) ;
  if ( a . equals ( "Y" ) ) {
    return 1 ;
  }
  else {
    return 0 ;
  }
  boolean ans = p ( 2 ) ;
  if ( ans ) {
    n = 1 ;
    while ( ans ) {
      n *= 10 ;
      if ( n == 10 * 10 ) {
        n = 10 ;
        break ;
      }
      ans = p ( n ) ;
    }
    n = ( int ) ( n / 10 ) ;
  }
  else {
    n = 1 ;
  }
  return n ;
}
