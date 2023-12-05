public static void input ( Scanner input , int N , int K ) {
  List < List < Integer >> sushi = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List < Integer > s = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) s . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    sushi . add ( s ) ;
  }
  Collections . sort ( sushi , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . get ( 1 ) . compareTo ( o2 . get ( 1 ) ) ;
    }
  }
  ) ;
  int point = 0 ;
  Set < Integer > netaSet = new HashSet < > ( ) ;
  List < Integer > removableIdx = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    List < Integer > s = sushi . get ( i ) ;
    point += s . get ( 1 ) ;
    if ( ! netaSet . contains ( s . get ( 0 ) ) ) netaSet . add ( s . get ( 0 ) ) ;
    removableIdx . clear ( ) ;
    if ( point > maxPoint ) maxPoint = point ;
  }
  System . out . println ( maxPoint ) ;
}
