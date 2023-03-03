static final double opt ( int K , List < List < Integer >> pancakes ) {
  final double ret = Math . pow ( pancakes . get ( pancakes . size ( ) - 1 ) . get ( ) , 2 ) + 2 * pancakes . get ( pancakes . size ( ) - 1 ) . get ( ) * pancakes . get ( pancakes . size ( ) - 1 ) . get ( ) ;
  Arrays . sort ( pancakes , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return - 2 * o1 . get ( 0 ) * o2 . get ( 1 ) ;
    }
  }
  ) ;
  ret += Math . pow ( 2 * pancakes . get ( 0 ) . get ( ) * pancakes . get ( 1 ) . get ( ) , 2 ) ;
  return ret ;
}
