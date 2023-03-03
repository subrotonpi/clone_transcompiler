public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] a = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = input . nextLine ( ) ;
  }
  int x = N , y , count = 0 ;
  for ( ;
  y < N ;
  y ++ ) {
    int i = a [ y ] . lastIndexOf ( "." ) ;
    if ( i == - 1 ) {
      x = N ;
    }
    else {
      x = i ;
      count ++ ;
    }
  }
  System . out . println ( count ) ;
  return x ;
}
