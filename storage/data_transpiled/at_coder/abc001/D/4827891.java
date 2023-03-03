public static int N = Integer . parseInt ( input ) {
  String rForward = String . valueOf ( Integer . parseInt ( input ) - Integer . parseInt ( input ) % 5 ) . replaceAll ( " " , "" ) ;
  String rBackward = String . valueOf ( Integer . parseInt ( input ) + 4 - ( Integer . parseInt ( input ) - 1 ) % 5 ) . replaceAll ( " " , "" ) ;
  String ret = String . valueOf ( Integer . parseInt ( string ) + 4 - ( Integer . parseInt ( string ) - 1 ) % 5 ) . replaceAll ( " " , "" ) ;
  if ( ret . substring ( 2 ) . equals ( "6" ) ) {
    ret = ( String . valueOf ( Integer . parseInt ( ret . substring ( 0 , 2 ) ) + 1 ) + "00" ) . replaceAll ( " " , "" ) ;
  }
  return ret ;
}
List < String > timeArr = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < 24 ;
i ++ ) {
  for ( int j = 0 ;
  j < 12 ;
  j ++ ) {
    timeArr . add ( String . valueOf ( i ) . replaceAll ( " " , "" ) + String . valueOf ( j * 5 ) . replaceAll ( " " , "" ) ) ;
  }
}
timeArr . add ( "2400" ) ;
List < List < Integer >> rained = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  rained . add ( new LinkedList < > ( ) ) ;
}
for ( int i = 0 ;
i < N ;
i ++ ) {
  String st_ = input . substring ( i , i + 1 ) ;
  String end_ = input . substring ( i , i + 1 ) ;
  for ( int idx = timeArr . indexOf ( rForward ) ;
  idx < timeArr . indexOf ( rBackward ) ;
  idx ++ ) {
    rained . get ( idx ) . add ( 1 ) ;
  }
}
int prev = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  String st_ = input . substring ( i , i + 1 ) ;
  String st_ = input . substring ( i , i + 1 ) ;
  String end_ = input . substring ( i , i + 1 ) ;
  for ( int idx = timeArr . indexOf ( rBackward ) ;
  idx < timeArr . indexOf ( end_ ) ;
  idx ++ ) {
    