static final int ceil ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  return Math . ceil ( sum ( a ) / ( n - a ) ) ;
}
