public static List < String > recoverSlip ( List < List < String >> slips ) {
  Map < String , Integer > found = new HashMap < String , Integer > ( ) ;
  List < String > ret = new ArrayList < String > ( ) ;
  for ( List < String > s : slips ) {
    for ( String h : s ) {
      if ( ! found . containsKey ( h ) ) {
        found . put ( h , 0 ) ;
      }
      found . get ( h ) ++ ;
    }
  }
  for ( String h : found . keySet ( ) ) {
    if ( found . get ( h ) % 2 == 1 ) {
      ret . add ( h ) ;
    }
  }
  return new ArrayList < String > ( ret ) ;
}
int T_max = Integer . parseInt ( scanner . nextLine ( ) ) ;
for ( int T = 0 ;
T < T_max ;
T ++ ) {
  String out = "Case #" + ( T + 1 ) + ": " ;
  int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
  List < String > slips = new ArrayList < String > ( ) ;
  for ( int r = 0 ;
  r < 2 * N - 1 ;
  r ++ ) {
    slips . add ( Integer . parseInt ( scanner . nextLine ( ) ) ) ;
  }
  out += Arrays . toString ( recoverSlip ( slips ) ) ;
  System . out . println ( out ) ;
}
