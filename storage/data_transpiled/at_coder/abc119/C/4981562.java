public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > bamBoos = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    bamBoos . add ( l ) ;
  }
  final List < BitSet > dfs = new ArrayList < > ( ) ;
  {
    if ( i == bamBoos . size ( ) ) {
      if ( ! bs . getA ( ) . isEmpty ( ) || ! bs . getB ( ) . isEmpty ( ) || ! bs . getC ( ) . isEmpty ( ) ) {
        return Collections . emptyList ( ) ;
      }
      return Arrays . asList ( bs ) ;
    }
    List < BitSet > ret = new ArrayList < > ( ) ;
    BitSet tmp = new BitSet ( ) ;
    tmp . set ( 0 , B ) ;
    tmp . set ( 0 , C ) ;
    ret . addAll ( dfs ) ;
    tmp . set ( 0 , B ) ;
    tmp . set ( 0 , C ) ;
    ret . addAll ( dfs ) ;
    tmp . set ( 0 , C ) ;
    tmp . set ( 0 , D ) ;
    tmp . set ( 0 , D ) ;
    ret . addAll ( dfs ) ;
    return ret . size ( ) ;
  }
  final BitSet ABC = new BitSet ( A ) ;
  ABC . set ( B ) ;
  ABC . set ( C ) ;
  final List < BitSet [ ] > bs_comb = dfs . get ( 0 , new BitSet [ ] {
    A , B , C }
    ) ;
    final List < BitSet [ ] > bs_comb = dfs . get ( 0 , new BitSet [ ] {
      B , C }
      ) ;
      final int ans = Integer . MAX_VALUE ;
      for ( BitSet [ ] bs : bs_comb ) {
        int cost = 0 ;
        for ( int abc : new int [ ] {
          A , B , C }
          ) {
            cost += ( bs [ abc ] . size ( ) - 1 ) * 10 ;
            cost += Math . abs ( sum ( bs [ abc ] ) - ABC . get ( abc ) ) ;
          }
          ans = Math . min ( ans , cost ) ;
        }
        System . out . println ( ans ) ;
        return ans ;
      }
      