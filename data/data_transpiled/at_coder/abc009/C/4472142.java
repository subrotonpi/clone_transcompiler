@ VisibleForTesting static String from ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  String s = new LinkedList < > ( ) ;
  s = new LinkedList < > ( ) ;
  s . add ( input ) ;
  s . add ( input ) ;
  ArrayList < String > sSort = new ArrayList < > ( s ) ;
  sSort . sort ( ) ;
  String t = "" ;
  int diff = 0 ;
  Counter < String > counter = new Counter < > ( s . substring ( 0 , 1 ) ) ;
  int counts = Integer . valueOf ( counter . values ( ) . length ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( String c : sSort ) {
      int diff1 = diff + ( c != s . charAt ( i ) ) ? 1 : 0 ;
      int diff2 = counts - ( counter . getCount ( c ) > 0 ? counter . getCount ( c ) : 0 ) ;
      if ( diff1 + diff2 <= k ) {
        t += c ;
        sSort . remove ( c ) ;
        diff = diff1 ;
        counter = new Counter < > ( s . substring ( 0 , i + 2 ) ) - new Counter < > ( t ) ;
        counts = Integer . valueOf ( counter . getCount ( c ) ) ;
        break ;
      }
    }
  }
  System . out . println ( t ) ;
  return t ;
}
