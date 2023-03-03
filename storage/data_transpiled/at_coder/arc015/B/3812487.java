public static int N = Integer . parseInt ( input ) {
  List < Integer > T = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T . add ( Collections . singletonList ( Double . parseDouble ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] days = new int [ 6 ] ;
  for ( int i = 0 ;
  i < days . length ;
  i ++ ) {
    int maxT = T . get ( i ) ;
    int minT = T . get ( i ) ;
    if ( 35 <= maxT ) days [ i ] ++ ;
  }
  return days [ i ] ;
}
