public static void n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > W = new LinkedList < String > ( ) ;
  W . add ( input . nextLine ( ) ) ;
  String [ ] word = {
    "TAKAHASHIKUN" , "Takahashikun" , "takahashikun" , "TAKAHASHIKUN." , "Takahashikun." , "takahashikun." }
    ;
    int cnt = 0 ;
    for ( String w : W ) {
      if ( w . contains ( word [ n ] ) ) {
        cnt ++ ;
      }
    }
    System . out . println ( cnt ) ;
  }
  