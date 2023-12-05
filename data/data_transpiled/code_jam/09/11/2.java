@ String ( file = "A-small-attempt0" ) public static void main ( String [ ] args ) throws IOException {
  BufferedReader in = new BufferedReader ( new FileReader ( file + ".in" ) ) ;
  final int b = in . read ( ) ;
  {
    int n = b ;
    int sumd = 0 ;
    while ( n > 0 ) {
      sumd += ( n % b ) * ( n % b ) ;
      n /= b ;
    }
    return sumd ;
  }
  private boolean happy ( int num , int b , boolean [ ] hp ) {
    if ( hp [ num ] ) return hp [ num ] ;
    if ( num == 1 ) return true ;
    int ds = dsum ( num , b ) ;
    hp [ num ] = false ;
    if ( happy ( ds , b , hp ) ) hp [ num ] = true ;
    return hp [ num ] ;
  }
  for ( int it = 1 ;
  it < args . length ;
  it ++ ) {
    String case = in . readLine ( ) ;
    int bases = Integer . parseInt ( case ) ;
    HashMap < Integer , Integer > hps = new HashMap < Integer , Integer > ( ) ;
    for ( int i = 0 ;
    i < 11 ;
    i ++ ) hps . put ( i , new Integer ( i ) ) ;
    for ( int num = 2 ;
    num < 10000000 ;
    num ++ ) {
      if ( Arrays . equals ( bases , hps . get ( b ) ) ) break ;
    }
    System . out . println ( "Case #" + ( it + 1 ) + ": " + num ) ;
  }
}
