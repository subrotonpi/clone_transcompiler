public static void foo ( ) {
  abc = list ( map ( Integer . parseInt ( input ( ) ) , 10 ) ) ;
  sorted_list = new ArrayList < > ( abc ) ;
  sorted_list . sort ( ) ;
  System . out . println ( sorted_list . get ( 0 ) * 10 + sorted_list . get ( 1 ) + sorted_list . get ( 2 ) ) ;
}
