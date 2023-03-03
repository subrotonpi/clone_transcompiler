private static void print ( int n , int m ) {
  List < List < Integer >> py = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    py . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  List < List < Integer >> py_sorted = new ArrayList < > ( py ) ;
  py_sorted . sort ( Comparator . comparing ( List :: get ) ) ;
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( List < Integer > pyi : py_sorted ) {
    if ( ! map . containsKey ( pyi . get ( 0 ) ) ) {
      map . put ( pyi . get ( 0 ) , 1 ) ;
    }
    else {
      map . put ( pyi . get ( 0 ) , 1 ) ;
    }
    pyi . set ( 2 , map . get ( pyi . get ( 0 ) ) ) ;
  }
  for ( List < Integer > pyi : py ) {
    System . out . println ( pyi . get ( 0 ) . toString ( ) . replaceAll ( " " , "" ) + pyi . get ( 2 ) . toString ( ) . replaceAll ( " " , "" ) ) ;
  }
}
