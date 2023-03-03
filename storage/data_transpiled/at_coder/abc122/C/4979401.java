public static int N = Integer . parseInt ( ( input . nextLine ( ) ) ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int [ ] Count = new int [ N ] ;
  Arrays . fill ( Count , 0 ) ;
  int count = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( S . substring ( i - 1 , i + 1 ) . equals ( "AC" ) ) {
      count ++ ;
      Count [ i ] = count ;
    }
    else {
      Count [ i ] = count ;
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( Count [ r - 1 ] - Count [ l - 1 ] ) ;
  }
  return count ;
}
