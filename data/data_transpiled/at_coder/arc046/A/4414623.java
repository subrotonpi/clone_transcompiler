static final void init ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = N / 9 + 1 != N ? N / 9 : 9 ;
  int a = N % 9 != 0 ? 9 : 9 ;
  System . out . println ( String . valueOf ( a ) * n ) ;
}
