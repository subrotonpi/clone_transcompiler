public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> AB = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    AB . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Arrays . sort ( AB , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . get ( 0 ) . compareTo ( o2 . get ( 0 ) ) ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i > 0 ) {
      AB . get ( i ) . get ( 1 ) + = AB . get ( i - 1 ) . get ( 1 ) ;
    }
    if ( K <= AB . get ( i ) . get ( 1 ) ) {
      System . out . println ( AB . get ( i ) . get ( 0 ) ) ;
      break ;
    }
  }
  return 0 ;
}
