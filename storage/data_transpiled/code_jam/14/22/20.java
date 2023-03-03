@ functools . VisibleForTesting static void solve ( ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
  BufferedWriter ouf = new BufferedWriter ( new OutputStreamWriter ( ouf ) ) ;
  Function < String , String > input = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return inf . readLine ( ) . trim ( ) ;
    }
  }
  ;
  Function < String , String > print = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return input ;
    }
  }
  ;
  private String [ ] genNums ( String input ) {
    String [ ] nums = new String [ input . length ( ) ] ;
    int xLen = input . length ( ) ;
    for ( int i = 0 ;
    i < input . length ( ) ;
    i ++ ) {
      if ( input . charAt ( i ) == '1' ) {
        nums [ i ] = input . substring ( 0 , i ) + "0" + "?" ;
      }
    }
    return nums ;
  }
  private int [ ] getWays ( String a , String b , String k ) {
    int n = a . length ( ) ;
    int res = 1 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( k . charAt ( i ) == '?' ) {
        if ( a . charAt ( i ) == '?' ) {
          res *= 2 ;
        }
        if ( b . charAt ( i ) == '?' ) {
          res *= 2 ;
        }
      }
      else {
        int kc = Integer . parseInt ( k . charAt ( i ) ) ;
        int [ ] aVars = a . charAt ( i ) != '?Integer.parseInt(a.substring(i)):newint[]{0,1};int[]bVars=b.charAt(i)!=' ? Integer . parseInt ( b . substring ( i ) ) : new int [ ] {
          0 , 1 }
          ;
          int tr = 0 ;
          for ( int ac : aVars ) {
            for ( int bc : bVars ) {
              tr += ( ac & bc == kc ? 1 : 0 ) ;
            }
          }
          res *= tr ;
        }
      }
      return res ;
    }
    ;
    private int [ ] solve ( ) {
      String a = Integer . parseInt ( input . substring ( 2 ) ) ;
      String b = Integer . parseInt ( input . substring ( 2 ) ) ;
      String k = Integer . parseInt ( input . substring ( 3 ) ) ;
      