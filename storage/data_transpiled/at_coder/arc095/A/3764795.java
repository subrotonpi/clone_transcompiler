public static void print ( int N ) {
  int [ ] X = Integer . parseInt ( input ( ) ) ;
  List < Integer > s = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  s . add ( X [ N ] ) ;
  int a = s . get ( N / 2 - 1 ) ;
  int b = s . get ( N / 2 ) ;
  for ( int x : X ) {
    if ( x <= a ) {
      print ( b ) ;
    }
    else {
      print ( a ) ;
    }
  }
}
