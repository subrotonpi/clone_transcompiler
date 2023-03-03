public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < Integer > P_Y_i = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) P_Y_i . add ( Integer . parseInt ( input ) ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) P_Y_i . add ( Integer . parseInt ( input ) ) ;
  List < List < Integer >> Ken_index = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Ken_index . add ( new ArrayList < > ( ) ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) Ken_index . get ( P_Y_i . get ( i ) . intValue ( ) - 1 ) . add ( P_Y_i . get ( i ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) if ( Ken_index . get ( i ) . size ( ) != 0 ) Ken_index . get ( i ) . sort ( Comparator . comparingInt ( Integer :: intValue ) ) ;
  List < String [ ] > Ken_Update = new ArrayList < > ( ) ;
  for ( List < Integer > Ken : Ken_index ) for ( int i = 0 ;
  i < Ken . size ( ) ;
  i ++ ) Ken_Update . add ( new String [ ] {
    Ken . get ( i ) . intValue ( ) + "" + ( i + 1 ) , Ken . get ( i ) . intValue ( ) }
    ) ;
    Ken_Update . sort ( Comparator . comparingInt ( Integer :: intValue ) ) ;
    for ( int i = 0 ;
    i < Ken_Update . size ( ) ;
    i ++ ) System . out . println ( Ken_Update . get ( i ) . intValue ( ) ) ;
  }
  