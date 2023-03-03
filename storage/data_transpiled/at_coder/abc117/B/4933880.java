public static void print ( int N ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  Collections . sort ( L , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  if ( L [ 0 ] < Integer . MAX_VALUE ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
