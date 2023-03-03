public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> li = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    li . add ( new ArrayList < > ( ) ) ;
  }
  li . add ( new ArrayList < > ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    li . add ( new ArrayList < > ( ) ) ;
  }
  Collections . sort ( li , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . get ( o2 . get ( o1 . size ( ) - o2 . get ( o1 . size ( ) ) ) ) . compareTo ( o2 . get ( o2 . size ( ) - o2 . get ( o1 . size ( ) ) ) ) ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( li . get ( i ) . get ( 0 ) ) ;
  }
}
