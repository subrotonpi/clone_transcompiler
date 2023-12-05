public static void main ( String [ ] args ) {
  if ( __name__ . equals ( "__main__" ) ) {
    int islandsCount = Integer . parseInt ( input . nextLine ( ) ) ;
    int demandsCount = Integer . parseInt ( input . nextLine ( ) ) ;
    List < List < Integer >> demands = new ArrayList < > ( ) ;
    int breakCount = 0 ;
    for ( int i = 0 ;
    i < demandsCount ;
    i ++ ) {
      List < Integer > demand = new LinkedList < > ( ) ;
      for ( int j = 0 ;
      j < islandsCount ;
      j ++ ) demand . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
      demands . add ( demand ) ;
    }
    Collections . sort ( demands , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        return o1 . compareTo ( o2 ) ;
      }
    }
    ) ;
    int westEdge = 0 ;
    for ( List < Integer > demand : demands ) {
      if ( demand . get ( 0 ) >= westEdge ) {
        breakCount ++ ;
        westEdge = demand . get ( 1 ) ;
      }
    }
    System . out . println ( breakCount ) ;
  }
}
