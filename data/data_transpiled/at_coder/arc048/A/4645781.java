static final int solve ( ) {
  int A , B ;
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . signum ( A ) == Math . signum ( B ) ) {
    System . out . println ( B - A ) ;
  }
  else {
    System . out . println ( B - A - 1 ) ;
  }
  return A ;
}
