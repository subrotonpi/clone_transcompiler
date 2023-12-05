static final int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = n ;
  i >= 0 ;
  i -- ) {
    int num = Math . floor ( Math . sqrt ( i ) ) ;
    if ( num * num == i ) {
      break ;
    }
  }
  System . out . println ( i ) ;
}
