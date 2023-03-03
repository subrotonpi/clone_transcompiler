public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int ma = Integer . parseInt ( input . nextLine ( ) ) ;
  int mb = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] , b = new int [ n ] , c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ia = Integer . parseInt ( input . nextLine ( ) ) ;
    int ib = Integer . parseInt ( input . nextLine ( ) ) ;
    int ic = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = ia ;
    b [ i ] = ib ;
    c [ i ] = ic ;
  }
  int sa = Integer . parseInt ( a ) ;
  int sb = Integer . parseInt ( b ) ;
  int INF = 10 * 5 ;
  int [ ] [ ] [ ] dp = new int [ sa + 1 ] [ sb + 1 ] [ sb + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ i ] [ 0 ] [ 0 ] = INF ;
    for ( int i = 0 ;
    i < sa + 1 ;
    i ++ ) {
      dp [ i ] [ 0 ] [ 0 ] = 0 ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int ca = 0 ;
      ca < sa ;
      ca ++ ) {
        for ( int cb = 0 ;
        cb < sb ;
        cb ++ ) {
          if ( dp [ i ] [ ca ] [ cb ] == INF ) continue ;
          dp [ i + 1 ] [ ca ] [ cb ] = Math . min ( dp [ i + 1 ] [ ca ] [ cb ] , dp [ i ] [ ca ] [ cb ] ) ;
          dp [ i + 1 ] [ ca + a [ i ] ] [ cb + b [ i ] ] = Math . min ( dp [ i + 1 ] [ ca + a [ i ] ] [ cb + b [ i ] ] , dp [ i ] [ ca ] [ cb ] + c [ i ] ) ;
        }
      }
    }
    int res = INF ;
    for ( int ca = 1 ;
    ca < sa ;
    ca ++ ) {
      for ( int cb = 1 ;
      cb < sb ;
      cb ++ ) {
        if ( ca * mb == cb * ma ) {
          res = Math . min ( res , dp [ n ] [ ca ] [ cb ]