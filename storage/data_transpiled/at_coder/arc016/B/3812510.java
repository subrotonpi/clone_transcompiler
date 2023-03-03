public static void print ( int N ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] X = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = input . nextLine ( ) ;
  }
  int count = 0 ;
  for ( String x : X ) {
    count += x . length ( ) ;
    char b = '\0' ;
    for ( int x_i = 0 ;
    x_i < X . length ;
    x_i ++ ) {
      if ( x_i == 'o' && b != 'o' ) {
        count ++ ;
      }
      b = x_i ;
    }
  }
  System . out . println ( count ) ;
}
