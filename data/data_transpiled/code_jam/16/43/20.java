static final String print ( String input ) {
  final int N = input . length ( ) ;
  final Map < String , String > love = Maps . newHashMap ( ) ;
  class IO {
    public String get ( Reader reader ) {
      return reader . get ( input . trim ( ) ) ;
    }
    public String get ( Reader reader , char delim ) {
      return reader . get ( "\n" ) + ( ans == null ? "IMPOSSIBLE" : "\n" . join ( row ) ) ;
    }
    public void print ( String v ) {
      System . err . println ( ( String ) v ) ;
    }
    public void print ( String s , Writer writer ) {
      int TT = Integer . parseInt ( input . substring ( 0 , TT ) ) ;
      for ( int i = 1 ;
      i <= TT ;
      i ++ ) {
        printerr ( "Case " + ( TT ++ ) + ".." ) ;
        ans = once ( ) ;
        System . err . println ( "Case #" + ( TT ++ ) + ": " + show ( ans ) ) ;
      }
    }
  }
  {
    String msg ;
    int r = 0 ;
    int c = 0 ;
    int i ;
    {
      int x = p ;
      int y = p ;
      return x >= 0 && x < r && y >= 0 && y < c ;
    }
    private int [ ] conv ( int i ) {
      i -- ;
      if ( i < c ) return new int [ ] {
        - 1 , i }
        ;
        else if ( i < c + r ) return new int [ ] {
          i - c , c }
          ;
          else if ( i < c + r ) return new int [ ] {
            i - c , c }
            ;
            else if ( i < c + r + c ) return new int [ ] {
              r , c + c + r - i - 1 }
              ;
              else if ( i < c + r + c ) return new int [ ] {
                i - c + r , c }
                ;
              }
              private int [ ] conv ( int i ) {
                int [ ] p = conv ( i ) ;
                int [ ] d = new int [ ] {
                  i }
                  ;
                  return Arrays . copyOf ( p , i ) ;
                }
                private boolean isConnected ( Map < String , int [ ] > maze , String src , String tar ) {
                  int [ ] p = conv ( src ) ;
                  int [ ] t = conv ( tar ) ;
                  int [ ] p = p ;
                  do {
                    if ( Arrays . equals ( p , t ) ) return true ;
                    