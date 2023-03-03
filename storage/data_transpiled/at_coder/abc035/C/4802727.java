@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] b = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    b [ i ] = 0 ;
    b [ i ] = a [ i ] ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    b [ i ] = a [ i ] ;
  }
  String ans = "" ;
  for ( int x = list . accumulate ( b ) . length - 1 ;
  x >= 0 ;
  x -- ) {
    if ( x % 2 == 0 ) {
      ans += "0" ;
    }
    else {
      ans += "1" ;
    }
  }
  System . out . println ( ans ) ;
  return a ;
}
