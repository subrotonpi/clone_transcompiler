public static int N = Integer . parseInt ( input ) {
  List < Integer > lst_a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lst_a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Student > lst_students = new ArrayList < Student > ( ) ;
  for ( int i = 0 ;
  i < lst_a . size ( ) ;
  i ++ ) {
    int h = lst_a . get ( i ) ;
    i ++ ;
    Student t_student = new Student ( i , h ) ;
    lst_students . add ( t_student ) ;
  }
  List < Student > lst_height = new ArrayList < Student > ( lst_students ) ;
  Collections . sort ( lst_height , new Comparator < Student > ( ) {
    @ Override public int compare ( Student t1 , Student t2 ) {
      return t1 . getScore ( ) - t2 . getScore ( ) ;
    }
  }
  ) ;
  for ( Student h : lst_height ) {
    int ans = h . getScore ( ) ;
    System . out . println ( ans ) ;
  }
  return 0 ;
}
