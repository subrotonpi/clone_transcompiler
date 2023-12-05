private static final HashMap < String , HashMap < String , String >> TABLE = new HashMap < String , HashMap < String , String >> ( ) {
  {
    put ( "1" , new HashMap < String , String > ( ) {
      {
        put ( "1" , "+1" ) ;
        put ( "i" , "+i" ) ;
        put ( "j" , "+j" ) ;
        put ( "k" , "+k" ) ;
      }
    }
    ) ;
    put ( "i" , new HashMap < String , String > ( ) {
      {
        put ( "1" , "+i" ) ;
        put ( "i" , "-1" ) ;
        put ( "j" , "+k" ) ;
        put ( "k" , "-j" ) ;
      }
    }
    ) ;
    put ( "j" , new HashMap < String , String > ( ) {
      {
        put ( "1" , "+j" ) ;
        put ( "i" , "-k" ) ;
        put ( "j" , "-1" ) ;
        put ( "k" , "+k" ) ;
      }
    }
    ) ;
    put ( "k" , new HashMap < String , String > ( ) {
      {
        put ( "1" , "+k" ) ;
        put ( "i" , "+j" ) ;
        put ( "j" , "-i" ) ;
        put ( "k" , "-k" ) ;
      }
    }
    ) ;
  }
  private static void main ( String [ ] args ) {
    int num_cases = input . length ( ) ;
    for ( int i = 0 ;
    i < num_cases ;
    i ++ ) {
      int m = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
      int part = input . nextInt ( ) ;
      String answer = possible ( part , m ) ? "YES" : "NO" ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + answer ) ;
    }
  }
  private boolean possible ( int part , int m ) {
    if ( m > 12 ) {
      m = 12 + m % 4 ;
    }
    String s = part * m ;
    int i_block = getBlock ( s , "+i" ) ;
    if ( i_block == 0 ) return false ;
    s = s . substring ( i_block ) ;
    int j_block = getBlock ( s , "+j" ) ;
    if ( j_block == 0 ) return false ;
    s = s . substring ( j_block ) ;
    int