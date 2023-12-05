public static final String getLevenshteinString ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int n = Integer . parseInt ( input ) ;
  final List < List < Integer >> lis = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis . add ( Collections . singletonList ( Integer . parseInt ( input . replaceAll ( " " , "" ) ) ) ) ;
  Collections . sort ( lis ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    lis . set ( i , lis . get ( i ) . get ( 0 ) - lis . get ( i ) . get ( 0 ) % 5 ) ;
    if ( ( lis . get ( i ) . get ( 1 ) % 5 != 0 ) ) lis . set ( i , lis . get ( i ) . get ( 1 ) - lis . get ( i ) . get ( 1 ) % 5 + 5 ) ;
    final double tmp2 = lis . get ( i ) . get ( 1 ) / 100 ;
    if ( ( tmp2 - ( int ) tmp2 ) > 0.59999 ) lis . set ( i , ( ( int ) tmp2 + 1 ) * 100 ) ;
    if ( ( lis . get ( i ) . get ( 1 ) >= 2360 ) ) lis . set ( i , 2400 ) ;
  }
  final List < List < Integer >> ans1 = new ArrayList < > ( ) ;
  ans1 . add ( lis . get ( 0 ) ) ;
  List < Integer > aaaa = ans1 . get ( 0 ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( ( aaaa . get ( 1 ) < lis . get ( i ) . get ( 0 ) ) ) {
      ans1 . add ( lis . get ( i ) ) ;
      aaaa = ans1 . get ( ans1 . size ( ) - 1 ) ;
    }
    else {
      if ( ( aaaa . get ( 1 ) < lis . get ( i ) . get ( 1 ) ) ) ans1 . set ( ans1 . size ( ) - 1 , lis . get ( i ) . get ( 1 ) ) ;
    }
  }
  for ( int i = 0 ;
  i < ans1 . size ( ) ;
  i ++ ) {
    final String start = String . valueOf ( ans1 . get ( i ) . get ( 0 ) ) ;
    final String end = String . valueOf ( ans1 .