static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * * 9 + 7 ;
{
  int n = INF ;
  int k = MOD ;
  {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
  }
  {
    int LI_ = MOD ;
    {
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        LI_ = Integer . parseInt ( System . console ( ) . readLine ( ) ) - 1 ;
      }
    }
  }
  {
    int LS = System . console ( ) . readLine ( ) ;
    int II = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  }
  {
    int SI = input . nextInt ( ) ;
  }
  {
    int n = INF ;
    int k = MOD ;
    int [ ] A = LI ;
    int [ ] C = new int [ n ] ;
    int [ ] C2 = new int [ n ] ;
    for ( int a = 0 ;
    a < A . length ;
    a ++ ) {
      C [ a ] = C [ a ] + a ;
      if ( a < 0 ) a = 0 ;
      C2 [ a ] = ( C2 [ a ] - 1 ) + a ;
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ans = Math . max ( ans , Math . max ( C [ i + k ] - C [ i ] , 0 ) + C2 [ i ] + C2 [ i - 1 ] - C2 [ i + k ] ) ;
    }
    return ans ;
  }
}
