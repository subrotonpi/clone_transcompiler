public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int L = Integer . parseInt ( input ( ) ) ;
  List < String > keys = new ArrayList < > ( ) ;
  int grundNum = 0 ;
  if ( N == 1 ) {
    System . out . println ( "Alice" ) ;
    exit ( ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input ( ) ;
    while ( s . length ( ) > 0 ) {
      if ( s . charAt ( s . length ( ) - 1 ) == '1' && keys . contains ( s . substring ( 0 , s . length ( ) - 1 ) + '0' ) ) {
        keys . remove ( s . substring ( 0 , s . length ( ) - 1 ) + '0' ) ;
        s = s . substring ( 0 , s . length ( ) - 1 ) ;
      }
      else if ( s . charAt ( s . length ( ) - 1 ) == '0' && keys . contains ( s . substring ( 0 , s . length ( ) - 1 ) + '1' ) ) {
        keys . remove ( s . substring ( 0 , s . length ( ) - 1 ) + '1' ) ;
        s = s . substring ( 0 , s . length ( ) - 1 ) ;
      }
      else {
        if ( s . length ( ) != 0 ) {
          keys . add ( s ) ;
        }
        break ;
      }
    }
    if ( keys . size ( ) > 0 ) {
      keys . sort ( key -> key . compareTo ( key ) ) ;
      List < Integer > grundList = new ArrayList < > ( ) ;
      while ( keys . size ( ) > 0 ) {
        String j = keys . get ( 0 ) ;
        keys . remove ( j ) ;
        List < Integer > tempS = new LinkedList < > ( ) ;
        tempS . add ( Integer . valueOf ( L - j . length ( ) + 1 ) ) ;
        grundList . add ( 1 << tempS . indexOf ( '1' ) ) ;
        if ( j . length ( ) != 0 ) {
          keys . add ( j ) ;
        }
        j = j . length ( ) ;
        while ( j . length ( ) > 0 ) {
          if ( j . charAt ( j . length ( ) - 1 ) == '1' && keys . contains ( j . substring ( 0 , j . length ( ) - 1 ) + '0' ) ) {
            keys . remove ( j ) ;
            j = j . substring ( j