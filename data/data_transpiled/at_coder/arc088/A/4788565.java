static final int input ( ) {
  int X , Y ;
  int count = 1 ;
  while ( ( Y = X * Y ) != 0 ) {
    if ( ( Y < 2 * X ) ) break ;
    X = X * 2 ;
    count ++ ;
  }
  System . out . println ( count ) ;
}
