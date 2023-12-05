public static void n ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > L = new ArrayList < > ( Collections . nCopies ( n , Integer . parseInt ( input ( ) ) ) ) ;
  System . out . println ( sum ( L . subList ( 0 , 2 ) ) ) ;
}
