public static void main ( String [ ] args ) {
  List < Pair < Integer , Integer >> inits = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    for ( int j = 0 ;
    j < s . length ( ) ;
    j ++ ) {
      char c = s . charAt ( j ) ;
      if ( c == 'Q' ) {
        inits . add ( new Pair < > ( i , j ) ) ;
      }
    }
  }
  Set < Integer > answer = solve ( inits ) ;
  if ( answer . size ( ) > 0 ) {
    for ( int i = 0 ;
    i < 8 ;
    i ++ ) {
      StringBuilder line = new StringBuilder ( ) ;
      for ( int j = 0 ;
      j < 8 ;
      j ++ ) {
        if ( ( answer . contains ( new Pair < > ( i , j ) ) ) ) {
          line . append ( 'Q' ) ;
        }
        else {
          line . append ( '.' ) ;
        }
      }
      System . out . println ( line . toString ( ) ) ;
    }
  }
  else {
    System . out . println ( "No Answer" ) ;
  }
}
