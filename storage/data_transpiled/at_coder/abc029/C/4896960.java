static final int [ ] getStrings ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] A = {
    'a' , 'b' , 'c' }
    ;
    List < String > X = new LinkedList < String > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      X . add ( A [ i ] ) ;
    }
    X . sort ( ) ;
    for ( String s : X ) {
      System . out . println ( s ) ;
    }
    return X . toArray ( new String [ X . size ( ) ] ) ;
  }
  