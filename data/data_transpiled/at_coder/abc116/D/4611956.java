@ VisibleForTesting static void heapSort ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    heapSort ( H , - d , t ) ;
  }
  int [ ] sorted = new int [ k ] ;
  BitSet used = new BitSet ( ) ;
  int dsum = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ! used . get ( t ) ) {
      used . set ( t ) ;
      int m = Integer . parseInt ( input . nextLine ( ) ) ;
      dsum = dsum - m - d ;
      ans = Math . max ( ans , used . cardinality ( ) * 2 + dsum ) ;
    }
  }
  System . out . println ( ans ) ;
}
