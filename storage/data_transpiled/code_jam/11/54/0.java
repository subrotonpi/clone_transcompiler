@ Nullable public static String print ( String q , String m ) {
  int ans = 0 ;
  int j = 0 ;
  for ( int i : xrange ( q . length ( ) ) ) {
    if ( q . charAt ( i ) >= '01' ) {
      ans = 2 * ans + Integer . parseInt ( q . substring ( i ) ) ;
    }
    else {
      ans = 2 * ans + m . charAt ( j ++ ) ;
    }
  }
  int oldans = ans ;
  int badtrials = 0 ;
  while ( ( ans * ans <= lgst ) && ( check ( ans * ans , S ) ) ) {
    ans = ans << 1 ;
  }
  int lgst = 0 ;
  for ( int i = 0 ;
  i < xrange ( q2 ) ;
  i ++ ) {
    int m1 = ( ( ans >> i ) & 1 ) ;
    int res = 1 << n2 ;
    if ( ( qfl & 1 ) != 1 ) {
      continue ;
    }
    int stu = 8 ;
    for ( int w = 0 ;
    w < sz ;
    w ++ ) {
      int m1 = ( ( ans >> i ) & 1 ) ;
      int qfl = fill ( rt , m1 ) ;
      int res = 1 << n2 ;
      if ( ( qfl & 1 ) != 1 ) {
        continue ;
      }
      int lgst = 2 * lgst + 1 ;
      if ( ( qfl & 1 ) != 1 ) {
        return output ( k + 1 , ans * ans ) ;
      }
      badtrials ++ ;
      if ( badtrials > recbadtrials ) {
        badtrials = recbadtrials ;
      }
    }
  }
  for ( int i = 0 ;
  i < xrange ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  i ++ ) {
    String S = stdin . readLine ( ) . trim ( ) ;
    System . err . println ( ">>> " + k + ": " + S . length ( ) ) ;
    System . err . println ( "Case #" + ( k + 1 ) + ": " + f ( S ) ) ;
  }
  System . err . println ( "Case #" + recbadtrials + ": " + f ( S ) ) ;
}
