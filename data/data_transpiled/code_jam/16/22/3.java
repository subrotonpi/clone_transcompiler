private static void solve ( ) {
  String a , b ;
  int l = Integer . parseInt ( readLine ( ) ) ;
  ans = new String [ ] {
    10 * 18 , "" , "" }
    ;
    int t = a . length ( ) ;
    Map < String , String > prev = new HashMap < String , String > ( ) ;
    for ( int i = 0 ;
    i < xrange ( T ) ;
    i ++ ) {
      System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
      solve ( ) ;
    }
    Map < String , String > nex = new HashMap < String , String > ( ) ;
    for ( int i = 0 ;
    i < xrange ( T ) ;
    i ++ ) {
      System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
      ans = new String [ ] {
        String . valueOf ( i ) , String . valueOf ( i + 1 ) }
        ;
      }
      {
        int i ;
        int na ;
        int cb ;
        int t ;
        int i ;
        int j ;
        int t ;
        int j ;
        int j ;
        j = a . length ( ) ;
        j = b . length ( ) ;
        for ( j = 0 ;
        j < t ;
        j ++ ) {
          if ( j == l ) {
            tdif = Math . abs ( Integer . parseInt ( ca ) - Integer . parseInt ( cb ) ) ;
            if ( ans . compareTo ( new String [ ] {
              tdif , ca , cb }
              ) > 0 ) ans = new String [ ] {
                tdif , ca , cb }
                ;
                return ;
              }
              if ( j == 0 ) {
                if ( a . charAt ( i ) == '?' ) {
                  go ( j + 1 , 0 , ca + '0' , cb + '0' ) ;
                  go ( j + 1 , - 1 , ca + '0' , cb + '1' ) ;
                  go ( j + 1 , 1 , ca + '1' , cb + '0' ) ;
                }
                else if ( a . charAt ( i ) == '?' ) {
                  go ( j + 1 , 0 , ca + a . charAt ( i ) , cb + a . charAt ( i ) ) ;
                  if ( b . charAt ( i ) > '0' ) go ( j + 1 , - 1 , ca + a . charAt ( i ) , cb + prev . get ( a . charAt ( i ) ) ) ;
                  if ( a . charAt ( i ) < '9' ) go ( j + 1 , - 1 , ca + a