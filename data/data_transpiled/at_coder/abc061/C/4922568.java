public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > [ ] arr = new List [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    arr [ i ] = new LinkedList < Integer > ( ) ;
  }
  Arrays . sort ( arr ) ;
  int n = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    n += arr [ i ] . intValue ( ) ;
    if ( n >= K ) {
      System . out . println ( arr [ i ] . intValue ( ) ) ;
      break ;
    }
  }
  return n ;
}
