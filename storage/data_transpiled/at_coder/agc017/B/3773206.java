static final void solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int A = Integer . parseInt ( input . nextLine ( ) ) ;
  final int B = Integer . parseInt ( input . nextLine ( ) ) ;
  final int C = Integer . parseInt ( input . nextLine ( ) ) ;
  final int D = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] chkL = {
    B + D , B + C , B - C , B - D }
    ;
    for ( int i = 0 ;
    i < N - 2 ;
    i ++ ) {
      final int minV = C * ( N - 2 - i ) - D * i + A ;
      final int maxV = D * ( N - 2 - i ) ;
      if ( ( minV <= v ) && ( v <= maxV ) ) {
        System . out . println ( "YES" ) ;
        return ;
      }
    }
    System . out . println ( "NO" ) ;
  }
  