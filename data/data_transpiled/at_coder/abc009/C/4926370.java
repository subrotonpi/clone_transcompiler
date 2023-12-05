@ VisibleForTesting static String from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  Set < String > R = new TreeSet < > ( S ) ;
  String T = "" ;
  int diff = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Map < String , Integer > counter = new TreeMap < > ( S . substring ( 0 , i + 1 ) ) - new TreeMap < > ( T ) ;
    for ( String r : R ) {
      int diff1 = diff + ( r != S . charAt ( i ) ) ;
      int diff2 = Integer . valueOf ( counter . values ( ) . length - ( counter . get ( r ) > 0 ) ) ;
      if ( diff1 + diff2 <= K ) {
        T += r ;
        R . remove ( r ) ;
        diff = diff1 ;
        break ;
      }
    }
  }
  System . out . println ( T ) ;
  return T ;
}
