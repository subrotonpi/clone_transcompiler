@ VisibleForTesting static final Runnable solve = new Runnable ( ) {
  @ Override public void run ( ) {
    for ( int testcase = 1 ;
    testcase <= Integer . MAX_VALUE ;
    testcase ++ ) {
      System . out . println ( fString ( "Case #" + testcase + ": {solve()}" ) ) ;
    }
  }
  private static void solve ( ) {
    int hd_orig = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int ad_orig = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int hk_orig = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int ak_orig = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int buff = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int debuff = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int start_pos = ( hd_orig == 0 ? 0 : hd_orig - 1 ) ;
    int hd = ( int ) ( ( ad_orig == 0 ? 0 : hk_orig - 1 ) - 1 ) ;
    int ad = ( int ) ( ( ad_orig == 0 ? 0 : hk_orig - 1 ) - 1 ) ;
    int hk = ( int ) ( ( ad_orig == 0 ? 0 : hk_orig - 1 ) - 1 ) ;
    int ak = ( int ) ( ( ak_orig == 0 ? 0 : ak_orig - 1 ) - 1 ) ;
    int state = ( int ) ( ( ak_orig == 0 ? 0 : ak_orig - 1 ) - 1 ) ;
    int turn = ( int ) ( ( ak_orig == 0 ? 0 : ak_orig - 1 ) - 1 ) ;
    assert hd <= hd_orig ;
    if ( turn >= 350 ) {
      return ;
    }
    if ( state == AFlag . DEBUFFING ) {
      deq . appendInt ( ( hd , ad , hk , ak , AFlag . DEBUFFING , turn ) ) ;
      if ( ak - debuff >= hd ) {
        deq . appendInt ( ( ( ad_orig == 0 ? 0 : ad_orig - 1 ) - 1 ) - ( ( ad_orig == 0 ? 0 : ad_orig - 1 ) - 1 ) ) ;
      }
      else if ( ad < hk && buff > 0 ) {
        deq . appendInt ( ( ( ad_orig == 0 ? 0 : ad_orig - 1 ) - 1 ) -