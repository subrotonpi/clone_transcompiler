static final int input ( ) {
  int X = Integer . parseInt ( input ( ) ) ;
  int Y = Integer . parseInt ( input ( ) ) ;
  int r = 0 ;
  int R = Y / X ;
  while ( R >= 2 ) {
    R /= 2 ;
    r ++ ;
  }
  System . out . println ( r + 1 ) ;
}
