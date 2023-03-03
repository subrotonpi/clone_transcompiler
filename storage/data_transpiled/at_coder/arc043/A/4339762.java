static final int [ ] getIndices ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int dif = max ( s ) - min ( s ) ;
  if ( dif == 0 ) {
    System . out . println ( - 1 ) ;
    System . exit ( 0 ) ;
  }
  return s ;
}
