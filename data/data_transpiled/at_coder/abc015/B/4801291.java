static final int sum ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  return - ( - sum ( a ) / ( n - a ) ) ;
}
