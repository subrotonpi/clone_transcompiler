public static void input ( ) {
  String s = input . nextLine ( ) ;
  List < String > A = new ArrayList < String > ( ) ;
  List < String > X = new ArrayList < String > ( ) ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i += 2 ) {
    X . add ( s . charAt ( i - 1 ) ) ;
    if ( s . charAt ( i ) == '+' ) {
      A . add ( X ) ;
      X . clear ( ) ;
    }
    if ( i == s . length ( ) - 2 ) {
      X . add ( s . charAt ( i ) ) ;
    }
  }
  int cnt = 0 ;
  for ( String s : A ) {
    if ( ! s . contains ( "0" ) ) cnt ++ ;
  }
  if ( s . length ( ) == 1 && s . charAt ( 0 ) != '0' ) cnt ++ ;
  System . out . println ( cnt ) ;
}
