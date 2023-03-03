static final String [ ] getStrings ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] num = {
    "3" , "5" , "7" }
    ;
    List < String > elements = new ArrayList < > ( ) ;
    for ( int i = 1 ;
    i <= Integer . MAX_VALUE ;
    i ++ ) {
      Iterable < String > options = new ArrayList < > ( ) ;
      for ( String s : options ) {
        String num1 = StringUtils . join ( s , "" ) ;
        elements . add ( num1 ) ;
      }
    }
    int cnt = 0 ;
    for ( int i = 0 ;
    i < elements . size ( ) ;
    i ++ ) {
      if ( Integer . parseInt ( elements . get ( i ) ) <= n ) {
        if ( "3" . equals ( elements . get ( i ) ) && "5" . equals ( elements . get ( i ) ) && "7" . equals ( elements . get ( i ) ) ) {
          cnt ++ ;
        }
      }
      else {
        break ;
      }
    }
    System . out . println ( cnt ) ;
    return elements . toArray ( new String [ 0 ] ) ;
  }
  