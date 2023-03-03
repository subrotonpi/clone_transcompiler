public static int INF = 10 * * 12 ;
int _T = Integer . parseInt ( readLine ( ) ) ;
for ( int _t = 1 ;
_t <= _T ;
++ _t ) {
  int Hd = Integer . parseInt ( readLine ( ) ) ;
  int Ad = Integer . parseInt ( readLine ( ) ) ;
  int Hk = Integer . parseInt ( readLine ( ) ) ;
  int Ak = Integer . parseInt ( readLine ( ) ) ;
  int B = Integer . parseInt ( readLine ( ) ) ;
  int D = Integer . parseInt ( readLine ( ) ) ;
  int res = INF ;
  int Bmax = 1 ;
  int Dmax = 101 - Ad ;
  if ( D == 0 ) Dmax = 1 ;
  else Dmax = Ak + 1 ;
  for ( int bs = 0 ;
  bs < Bmax ;
  ++ bs ) {
    for ( int ds = 0 ;
    ds < Dmax ;
    ++ ds ) {
      int hd = Hd , ad = Ad , hk = Hk , ak = Ak ;
      int b = 0 , d = 0 ;
      HashSet < Integer > S = new HashSet < Integer > ( ) ;
      int n = 0 ;
      while ( hd > 0 && hk > 0 && ! S . contains ( new Integer ( hd ) ) ) {
        S . add ( new Integer ( hd ) ) ;
        S . add ( new Integer ( ad ) ) ;
        S . add ( new Integer ( hk ) ) ;
        S . add ( new Integer ( ak ) ) ;
        ++ n ;
        if ( ad >= hk ) {
          hk = 0 ;
          break ;
        }
        if ( d < ds ) {
          if ( ak - D >= hd ) {
            hd = Hd - ak ;
          }
          else {
            ak = Math . max ( ak - D , 0 ) ;
            hd -= ak ;
            ++ d ;
          }
          continue ;
        }
        if ( ak >= hd ) {
          hd = Hd - ak ;
          continue ;
        }
        if ( b < bs ) {
          ad += B ;
          hd -= ak ;
          ++ b ;
          continue ;
        }
        hk -= ad ;
        hd -= ak ;
      }
      if ( hk <= 0 ) {
        res = Math . min ( res , n ) ;
      }
    }
  }
  if ( res >= INF ) {
    res = "IMPOSSIBLE" ;
  }
  System . out . println ( "Case #" + _t + ": " + res ) ;
  return res ;
}
