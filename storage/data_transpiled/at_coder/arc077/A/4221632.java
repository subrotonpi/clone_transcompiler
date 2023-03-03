public static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
}
public static int [ ] getIntList ( ) {
  return new int [ ] {
    Integer . parseInt ( input . nextLine ( ) ) }
    ;
  }
  public static int [ ] zeros ( int n ) {
    return new int [ n ] ;
  }
  public static void dmp ( String x ) {
    if ( debug ) {
      System . out . println ( x ) ;
    }
  }
  public static void probC_TLE ( ) {
    int N = getInt ( ) ;
    int [ ] A = getIntList ( ) ;
    dmp ( ( N ) , A ) ;
    int [ ] b = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      b [ i ] = A [ i ] ;
      Collections . reverse ( b ) ;
      dmp ( b ) ;
    }
  }
  public static void probC_TLE2 ( ) {
    int N = getInt ( ) ;
    int [ ] A = getIntList ( ) ;
    dmp ( ( N ) , A ) ;
    String [ ] former = new String [ N ] , latter = new String [ N ] ;
    for ( int i = - 1 ;
    i >= - N ;
    i -- ) {
      if ( i % 2 == 0 ) {
        latter = new String [ N ] ;
        System . arraycopy ( A , 0 , former , 0 , i ) ;
      }
      else {
        former [ i ] = A [ i ] ;
      }
      String full = former [ i ] + latter ;
      dmp ( ( N ) , latter , full ) ;
    }
  }
  public static void probC_TLE3 ( ) {
    int N = getInt ( ) ;
    int [ ] A = getIntList ( ) ;
    dmp ( ( N ) , A ) ;
    String former = "" , latter = "" ;
    for ( int i = - 1 ;
    i >= - N ;
    i -- ) {
      if ( i % 2 == 0 ) {
        latter = A [ i ] + " " + latter ;
      }
      else {
        former = former + " " + A [ i ] ;
      }
      dmp ( ( N ) , former , latter ) ;
    }
  }
  public static void probC ( ) {
    int N = getInt ( ) ;
    int [ ] A = getIntList ( ) ;
    dmp ( ( N ) , A ) ;
    int [ ] b = new int [ N ] ;
    for ( int i = - 1 ;
    i >= - N ;
    i -- ) {
      if ( i % 2 == 0 ) {
        b