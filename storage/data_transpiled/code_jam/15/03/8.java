public static int tnum = Integer . parseInt ( in ) {
  {
    String s1 = in . nextLine ( ) ;
    String t1 = in . nextLine ( ) ;
    String s2 = in . nextLine ( ) ;
    String t2 = in . nextLine ( ) ;
    String s = s1 . multiply ( s2 ) ;
    if ( t1 . equals ( "1" ) ) return ( s ) ;
    if ( t2 . equals ( "1" ) ) return ( s ) ;
    if ( t1 . equals ( t2 ) ) return ( - s ) ;
    if ( t2 . equals ( ( char ) ( ( ( int ) ( t1 . charAt ( 0 ) - 'i' + 1 ) % 3 + 'i' ) ) ) ) return ( s ) ;
    else return ( - s ) ;
  }
  private static int powr ( String x , int n ) {
    int res = ( 1 ) ;
    while ( n > 0 ) {
      if ( n % 2 == 1 ) res = mult ( res , x ) ;
      x = mult ( x , x ) ;
      n /= 2 ;
    }
    return res ;
  }
}
