static final int [ ] getNegativeInstances ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = K / 50 ;
  int b = K % 50 ;
  if ( K == 0 ) {
    System . out . println ( 2 ) ;
    System . out . println ( 0 ) ;
    System . exit ( 0 ) ;
  }
  int Ans [ ] = new int [ b ] ;
  return Ans ;
}
