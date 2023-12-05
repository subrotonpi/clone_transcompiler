static final Scanner IO = new Scanner ( System . in ) {
  private BufferedReader fin = null ;
  private String sstrip = "" ;
  private long t0 ;
  private long sum ( ) {
    String s = sstrip ;
    StringBuilder st = new StringBuilder ( ) ;
    int res = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      char c = s . charAt ( i ) ;
      if ( st . length ( ) > 0 && c == st . charAt ( st . length ( ) - 1 ) ) {
        res += 10 ;
        st . deleteCharAt ( st . length ( ) - 1 ) ;
      }
      else st . append ( c ) ;
    }
    res += st . length ( ) / 2 * 5 ;
    return res ;
  }
  public static void main ( String [ ] args ) {
    String fname = "test.in" ;
    if ( args . length > 0 ) fname = args [ 0 ] ;
    int i ;
    fin = new BufferedReader ( new FileReader ( fname ) ) ;
    fout = new PrintWriter ( new FileWriter ( fname + ".out" ) ) ;
    t0 = new Date ( ) ;
    int t = Integer . parseInt ( fin . readLine ( ) ) ;
    for ( i = 0 ;
    i < t ;
    i ++ ) {
      fout . printf ( "Case #%d: " , i + 1 ) ;
      fout . printf ( "%s\n" , solve ( ) ) ;
    }
    System . out . println ( "Time = %s" , new Date ( ) . getTime ( ) - t0 ) ;
    fin . close ( ) ;
    fout . close ( ) ;
  }
  public static int [ ] nums ( ) {
    return new int [ ] {
      Integer . parseInt ( fin . readLine ( ) ) }
      ;
    }
    public static float [ ] fnums ( ) {
      return new float [ ] {
        Float . parseFloat ( fin . readLine ( ) ) }
        ;
      }
      public static int num ( ) {
        return Integer . parseInt ( fin . readLine ( ) ) ;
      }
      public static String sstrip ( ) {
        return fin . readLine ( ) . trim ( ) ;
      }
      public static String [ ] strs ( ) {
        return fin . readLine ( ) . split ( " " ) ;
      }
      public static String arrstr ( String [ ] a , String sep ) {
        return sep . join ( Arrays . asList ( a ) ) ;
      }
    }
    