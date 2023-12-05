public static int [ ] readIntList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] R = new int [ N ] ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    R [ i ] = 0 ;
    L [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    R [ r - 1 ] ++ ;
    L [ l - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    R [ r - 1 ] ++ ;
    L [ l - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    R [ r - 1 ] ++ ;
    L [ l - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    R [ l ] ++ ;
    L [ l - 1 ] ++ ;
  }
  now = 0 ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    now += n ;
    System . out . print ( now % 2 ) ;
    System . out . print ( now % 2 ) ;
    now -= L [ n ] ;
  }
  System . out . println ( ) ;
  return R ;
}
