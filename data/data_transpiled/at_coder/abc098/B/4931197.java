public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s1 = "" ;
  String s2 = "" ;
  int max = 0 ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    HashMap < String , Integer > count = new HashMap < String , Integer > ( ) ;
    s1 = s . substring ( 0 , i ) ;
    s2 = s . substring ( i ) ;
    for ( int j = 0 ;
    j < s1 . length ( ) ;
    j ++ ) {
      if ( s2 . indexOf ( s1 . charAt ( j ) ) >= 1 ) {
        count . put ( s1 . charAt ( j ) , 1 ) ;
      }
    }
    List list = new LinkedList ( count . keySet ( ) ) ;
    if ( list . size ( ) > max ) {
      max = list . size ( ) ;
    }
  }
  System . out . println ( max ) ;
}
