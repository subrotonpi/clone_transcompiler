public static void n ( int k ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  l = Arrays . asList ( n ) ;
  l . sort ( Collections . reverseOrder ( ) ) ;
  System . out . println ( sum ( l , 0 , k ) ) ;
}
