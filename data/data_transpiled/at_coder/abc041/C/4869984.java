@ InputFunction public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  a . clear ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( a . get ( i ) ) ;
  }
  Collections . sort ( a , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( a . get ( i ) . intValue ( ) + 1 ) ;
  }
}
