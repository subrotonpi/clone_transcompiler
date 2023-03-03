public static int convertToMinutes ( String T ) throws IOException {
  String h = T . substring ( 0 , T . indexOf ( ":" ) ) ;
  String m = T . substring ( T . indexOf ( ":" ) + 1 ) ;
  return 60 * Integer . parseInt ( h ) + Integer . parseInt ( m ) ;
}
BufferedReader reader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
String N = reader . readLine ( ) ;
for ( int caseIterator = 0 ;
caseIterator < Integer . parseInt ( N ) ;
caseIterator ++ ) {
  List < Pair > A = new ArrayList < > ( ) ;
  List < Pair > B = new ArrayList < > ( ) ;
  int T = Integer . parseInt ( reader . readLine ( ) ) ;
  final String NA = reader . readLine ( ) ;
  final String NB = reader . readLine ( ) ;
  for ( int NA_iterator = 0 ;
  NA_iterator < Integer . parseInt ( NA ) ;
  NA_iterator ++ ) {
    final String T_leave_A = reader . readLine ( ) ;
    final String T_reach_B = reader . readLine ( ) ;
    B . add ( new Pair ( convertToMinutes ( T_reach_B ) + T , - 1 ) ) ;
    A . add ( new Pair ( convertToMinutes ( T_leave_A ) , + 1 ) ) ;
  }
  for ( int NB_iterator = 0 ;
  NB_iterator < Integer . parseInt ( NB ) ;
  NB_iterator ++ ) {
    final String T_leave_B = reader . readLine ( ) ;
    final String T_reach_A = reader . readLine ( ) ;
    A . add ( new Pair ( convertToMinutes ( T_reach_A ) + T , - 1 ) ) ;
    B . add ( new Pair ( convertToMinutes ( T_leave_B ) , + 1 ) ) ;
  }
  List < Pair > list = new ArrayList < > ( A ) ;
  Collections . sort ( list ) ;
  int Atrains = 0 ;
  int count = 0 ;
  for ( Pair pair : list ) {
    count = count + pair . second ;
    if ( count > Atrains ) Atrains = count ;
  }
  list . sort ( ) ;
  int Btrains = 0 ;
  count = 0 ;
  for ( Pair pair : list ) {
    count = count + pair . second ;
    if ( count > Btrains ) Btrains = count ;
  }
  System . out . println ( "Case #" + ( caseIterator + 1 ) + ": " + Atrains + " " + Btrains ) ;
  return 0