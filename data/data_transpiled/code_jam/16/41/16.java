static final Scanner IO = new Scanner ( System . in ) {
  private InputStream fin = null ;
  private String [ ] [ ] nums = new String [ 3 ] [ 3 ] ;
  {
    int n = nums [ 0 ] ;
    int r = nums [ 1 ] ;
    int p = nums [ 2 ] ;
    int s = nums [ 3 ] ;
    char [ ] f = {
      'R' , 'S' , 'P' , 'R' }
      ;
      {
        int lev = nums [ 0 ] . length ;
        int a = nums [ 1 ] . charAt ( 0 ) ;
        int b = nums [ 2 ] . charAt ( 0 ) ;
        if ( lev == 0 ) {
          return new String [ ] {
            s }
            ;
          }
          int a = nums [ 0 ] . charAt ( 0 ) ;
          int b = nums [ 1 ] . charAt ( 0 ) ;
          if ( a < b ) {
            return new String [ ] {
              a , b }
              ;
            }
            return new String [ ] {
              b , a }
              ;
            }
            private int cnt ( String s , char x ) {
              int res = 0 ;
              for ( char c : s ) {
                if ( c == x ) {
                  res ++ ;
                }
              }
              return res ;
            }
          }
          ;
          for ( String base : "RPS" . toCharArray ( ) ) {
            int t = nums [ 0 ] . length ;
            if ( cnt ( s , base ) != r ) {
              continue ;
            }
            if ( cnt ( s , base ) != p ) {
              continue ;
            }
            if ( cnt ( s , base ) != s ) {
              continue ;
            }
            int res = Math . min ( res , t ) ;
            if ( res == 'Z' ) {
              res = "IMPOSSIBLE" ;
            }
            return new String [ ] {
              res }
              ;
            }
            public static void main ( String [ ] args ) {
              String fname = "test.in" ;
              if ( args . length > 1 ) {
                fname = args [ 1 ] ;
              }
              int t ;
              fin = new FileInputStream ( fname ) ;
              FileOutputStream fout = new FileOutputStream ( fname + ".out" ) ;
              long t0 = new Date ( ) . getTime ( ) ;
              t = Integer . parseInt ( fin . readLine ( ) ) ;
              for ( int i = 0 ;
              i < t ;
              i ++ ) {
                fout . write ( "Case #" + ( i + 1 ) + ": " ) ;
                fout . write ( solve ( ) . toString ( ) ) ;
              }
              System . out . println ( "Time = " + ( new Date