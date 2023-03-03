public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> ls = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ls . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Map < Integer , Integer > maps = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    maps . put ( i , 0 ) ;
  }
  for ( List < Integer > load : ls ) {
    maps . put ( load . get ( 0 ) , 1 ) ;
    maps . put ( load . get ( 1 ) , 1 ) ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . println ( maps . get ( i ) ) ;
  }
  return M ;
}
