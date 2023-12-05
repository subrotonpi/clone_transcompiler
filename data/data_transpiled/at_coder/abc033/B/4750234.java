public static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
}
public int [ ] getIntList ( ) {
  return new int [ ] {
    Integer . parseInt ( input . nextLine ( ) ) }
    ;
  }
  public int [ ] zeros ( int n ) {
    return new int [ n ] ;
  }
  class Debug {
    public void on ( ) {
      debug = true ;
    }
    public void off ( ) {
      debug = false ;
    }
    public void dmp ( int x , String cmt ) {
      if ( debug ) {
        if ( cmt != "" ) System . out . print ( cmt + ":  " ) ;
        System . out . println ( x ) ;
      }
    }
  }
  