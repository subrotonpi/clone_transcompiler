public static void input ( Scanner in ) {
  int N = in . nextInt ( ) ;
  int K = Integer . parseInt ( in . nextLine ( ) ) ;
  List < String > L = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < 5 ;
    j ++ ) {
      if ( i + j < N ) {
        L . add ( in . nextLine ( ) ) ;
      }
    }
  }
  Collections . sort ( L ) ;
  String sub = "" ;
  int x = 0 ;
  for ( String i : L ) {
    if ( sub != i ) {
      sub = i ;
      x ++ ;
    }
    if ( x == K ) {
      System . out . println ( sub ) ;
      break ;
    }
  }
}
