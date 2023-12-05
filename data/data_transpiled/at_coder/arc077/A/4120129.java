public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < String > A = new LinkedList < String > ( ) ;
  A . add ( input ) ;
  List < String > ans = null ;
  String l1 = A . get ( 0 ) ;
  String l2 = A . get ( 1 ) ;
  if ( N % 2 == 0 ) {
    l2 = l2 . substring ( 0 , l2 . length ( ) - 1 ) ;
    ans = l2 + l1 ;
  }
  else {
    l1 = l1 . substring ( 0 , l1 . length ( ) - 1 ) ;
    ans = l1 + l2 ;
  }
}
