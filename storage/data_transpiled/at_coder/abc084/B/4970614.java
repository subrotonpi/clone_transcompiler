public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = new String ( input . nextLine ( ) ) ;
  List < String > suji = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i <= 10 ;
  i ++ ) {
    suji . add ( String . valueOf ( i ) ) ;
  }
  try {
    int a = Integer . parseInt ( new String ( S . substring ( 0 , A ) ) ) ;
    int b = Integer . parseInt ( new String ( S . substring ( B ) ) ) ;
    if ( ( suji . contains ( S . substring ( A , B ) ) ) == false ) {
      System . out . println ( "No" ) ;
    }
    else {
      System . out . println ( "Yes" ) ;
    }
  }
  catch ( Exception e ) {
    System . out . println ( "No" ) ;
  }
  return a ;
}
