public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    i = Integer . parseInt ( input . nextLine ( ) ) ;
    s . add ( i ) ;
  }
  List < Integer > l = new LinkedList < Integer > ( s ) ;
  l . sort ( Collections . reverseOrder ( l ) ) ;
  System . out . println ( l . get ( 1 ) ) ;
}
