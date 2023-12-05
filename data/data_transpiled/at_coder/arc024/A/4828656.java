public static void a ( int a , int b ) {
  List < Integer > L = new LinkedList < Integer > ( ) ;
  List < Integer > R = new LinkedList < Integer > ( ) ;
  R . add ( a ) ;
  R . add ( b ) ;
  int cnt = 0 ;
  for ( Integer l : L ) {
    if ( R . contains ( l ) ) {
      cnt ++ ;
      R . remove ( l ) ;
    }
  }
  System . out . println ( cnt ) ;
}
