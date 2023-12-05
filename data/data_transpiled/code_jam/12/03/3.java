public static void main ( Scanner ri ) {
  int n = Integer . parseInt ( ri . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange . size ( ) ;
  i ++ ) {
    int a = Integer . parseInt ( ri . nextLine ( ) ) ;
    int b = Integer . parseInt ( ri . nextLine ( ) ) ;
    int k = 0 ;
    for ( ;
    n < xrange . size ( ) ;
    n ++ ) {
      String s = Integer . toString ( n ) ;
      Set < String > z = new HashSet < String > ( ) ;
      for ( int t : xrange . get ( 1 , s . length ( ) ) ) {
        String ss = s . substring ( t ) + s . substring ( 0 , t ) ;
        if ( ss . charAt ( 0 ) != '0' && n < Integer . parseInt ( ss ) && ss . length ( ) <= b ) {
          z . add ( ss ) ;
        }
      }
      k += z . size ( ) ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + k ) ;
  }
}
