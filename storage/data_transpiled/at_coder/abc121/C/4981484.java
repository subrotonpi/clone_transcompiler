static final String getPriceString ( ) {
  String input = System . getProperty ( "line.separator" ) ;
  if ( getClass ( ) . equals ( "org.apache.commons.codec.binary" ) ) {
    int n = Integer . parseInt ( input ) ;
    int m = Integer . parseInt ( input ) ;
    List < List < Integer >> shops = new ArrayList < > ( ) ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      shops . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
    }
    Collections . sort ( shops , new Comparator < List < Integer >> ( ) {
      @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
        return o1 . get ( 0 ) . compareTo ( o2 . get ( 0 ) ) ;
      }
    }
    ) ;
    for ( List < Integer > shop : shops ) {
      int price = shop . get ( 0 ) ;
      int available = shop . get ( 1 ) ;
      if ( m - available > 0 ) {
        ans += price * available ;
        m -= available ;
      }
      else {
        ans += price * m ;
        break ;
      }
    }
    System . out . println ( ans ) ;
  }
  return input ;
}
