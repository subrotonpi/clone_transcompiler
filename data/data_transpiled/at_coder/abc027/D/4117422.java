@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  String S = input . next ( ) ;
  int N = S . length ( ) ;
  int M_cnt = S . indexOf ( 'M' ) ;
  List < Integer > cnt_plus = Lists . accumulate ( ( s == '+' ? 1 : 0 ) , ( s == '-' ? 1 : 0 ) ) . subList ( 0 , S . length ( ) - 1 ) ;
  List < Integer > cnt_minus = Lists . accumulate ( ( s == '-' ? 1 : 0 ) , ( s == '+' ? 1 : 0 ) ) . subList ( 0 , S . length ( ) - 1 ) ;
  List < Integer > p = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == 'M' ) {
      p . add ( cnt_plus . get ( i ) - cnt_minus . get ( i ) ) ;
    }
  }
  Collections . sort ( p ) ;
  int ans = sum ( p , M_cnt / 2 ) - sum ( p , 0 , M_cnt / 2 ) ;
  System . out . println ( ans ) ;
  return p ;
}
