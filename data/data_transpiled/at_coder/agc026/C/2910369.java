static final int [ ] getPairs ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final String S = input . nextLine ( ) ;
  int ans = 0 ;
  final Map < Tuple , Integer > L = Maps . newHashMap ( ) ;
  final Map < Tuple , Integer > R = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int seq = i ;
    String T0 = "" ;
    String T1 = "" ;
    String T2 = "" ;
    String T3 = "" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( seq == 0 ) {
        T0 += S . charAt ( i ) ;
        T2 += S . charAt ( S . length ( ) - i - 1 ) ;
      }
      else {
        T1 += S . charAt ( i ) ;
        T3 += S . charAt ( S . length ( ) - i - 1 ) ;
      }
    }
    final int a0 = T0 . length ( ) ;
    final int a1 = T1 . length ( ) ;
    final int a2 = T2 . length ( ) ;
    final int a3 = T3 . length ( ) ;
    if ( ( T0 < a1 ) && ( T1 < a2 ) ) {
      L . put ( new Tuple ( T0 , a1 ) , 1 ) ;
    }
    else {
      L . put ( new Tuple ( T0 , a1 ) , 1 ) ;
    }
    if ( ( T2 < a3 ) && ( T2 < a3 ) ) {
      R . put ( new Tuple ( T2 , a3 ) , 1 ) ;
    }
  }
  for ( Tuple tuple : L . keySet ( ) ) {
    if ( R . containsKey ( tuple ) ) {
      ans += L . get ( tuple ) * R . get ( tuple ) ;
    }
  }
  System . out . println ( ans ) ;
  return L . values ( ) ;
}
