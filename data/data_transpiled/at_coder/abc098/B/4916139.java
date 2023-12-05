public static void print ( int N ) {
  String S = String . valueOf ( input ( ) ) ;
  int max = 0 ;
  List < String > list_S = new LinkedList < String > ( S ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    List < String > X = list_S . subList ( 0 , i ) ;
    List < String > Y = list_S . subList ( list_S . size ( ) - i , list_S . size ( ) ) ;
    Set < String > result = new HashSet < String > ( X ) ;
    result . addAll ( Y ) ;
    if ( max < result . size ( ) ) {
      max = result . size ( ) ;
    }
  }
  System . out . println ( max ) ;
}
