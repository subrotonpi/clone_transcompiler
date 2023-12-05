@ GwtIncompatible ( "java.util.Scanner" ) public static void solve ( String s ) {
  {
    Map < Integer , List < String >> a = new HashMap < > ( ) ;
    for ( int x : xrange ( 1 , s . length ( ) + 1 ) ) {
      for ( List < String > c : combinations ( s , x ) ) {
        int t = Integer . valueOf ( c . size ( ) ) ;
        if ( ! a . containsKey ( t ) ) {
          a . put ( t , c ) ;
        }
        else {
          System . out . println ( StringUtils . toString ( a . get ( t ) ) ) ;
          System . out . println ( StringUtils . toString ( c ) ) ;
          return ;
        }
      }
    }
    System . out . println ( "Impossible" ) ;
  }
  for ( int testCase : xrange ( 1 , Integer . parseInt ( scanner . nextLine ( ) ) + 1 ) ) {
    List < String > s = new ArrayList < > ( ) ;
    for ( String d : scanner . nextLine ( ) . split ( " " ) ) {
      s . add ( Integer . valueOf ( d ) ) ;
    }
    System . out . printf ( "Case #%d:\n" , testCase ) ;
    solve ( s ) ;
  }
}
