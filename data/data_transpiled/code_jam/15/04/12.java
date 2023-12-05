/*
DESCRIPTION="
*/
public static void main ( String [ ] args ) {
  final String msg = "" ;
  final int T = Integer . parseInt ( msg ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    Arrays . fill ( args , ( char ) Integer . parseInt ( msg ) ) ;
    System . err . flush ( ) ;
  }
  final String pinfo = "" ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    Arrays . fill ( args , ( char ) Integer . parseInt ( msg ) ) ;
    System . out . printf ( "Case #%d: %s\n" , i , solve ( X , R , C ) ) ;
  }
  if ( null != args ) {
    args = new String [ ] {
      "" }
      ;
    }
    final HelpFormatter formatter = new HelpFormatter ( ) ;
    formatter . printHelp ( USAGE , null , args ) ;
  }
  