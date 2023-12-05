static final int [ ] args ( int n ) {
  final int div = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int mod = n % 2 ;
  int ans = 0 ;
  if ( mod > 0 ) ans ++ ;
  ans += div ;
  System . out . println ( ans ) ;
  if ( mod > 0 ) System . out . println ( 1 ) ;
  for ( int i = 0 ;
  i < div ;
  i ++ ) {
    System . out . println ( 2 ) ;
  }
  return new int [ ] {
    ans }
    ;
  }
  