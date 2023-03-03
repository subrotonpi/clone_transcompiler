public static void input ( ) {
  String s = input . nextLine ( ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < String > keys = new ArrayList < > ( ) ;
  for ( int start = 0 ;
  start < s . length ( ) ;
  start ++ ) {
    for ( int end = start + 1 ;
    end <= Math . min ( start + 6 , s . length ( ) + 1 ) ;
    end ++ ) {
      String key = s . substring ( start , end ) ;
      if ( keys . contains ( key ) ) {
        continue ;
      }
      if ( keys . size ( ) < 5 ) {
        keys . add ( key ) ;
        Collections . sort ( keys ) ;
        keys = keys . subList ( 0 , keys . size ( ) - 1 ) ;
      }
    }
  }
  System . out . println ( keys . get ( k - 1 ) ) ;
}
