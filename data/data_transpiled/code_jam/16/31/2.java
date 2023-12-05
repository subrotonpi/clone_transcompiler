private static String f = "a-sample.in" ;
f = "A-small-attempt0.in" ;
f = "A-large.in" ;
List < String > in = CollectionUtils . toList ( Collections . nCopies ( 1 , "a-sample.in" ) ) ;
Function < Integer , Character > let = n -> ( char ) ( 'A' + n - 1 ) ;
/* solve the two strings */
List < String > vals = Stream . of ( Integer . valueOf ( 1 ) , Integer . valueOf ( 2 ) ) . map ( s -> s . substring ( 1 , s . length ( ) - 1 ) ) . collect ( toList ( ) ) ;
Collections . sort ( vals , Collections . reverseOrder ( ) ) ;
StringBuilder evac = new StringBuilder ( ) ;
evac . append ( ( vals . get ( 0 ) . charAt ( 0 ) - vals . get ( 1 ) . charAt ( 0 ) ) * 2 ) . append ( let . apply ( vals . get ( 0 ) . charAt ( 1 ) ) ) ;
evac . append ( let . apply ( p ) ) ;
evac . append ( let . apply ( vals . get ( 1 ) ) + let . apply ( vals . get ( 1 ) . charAt ( 1 ) ) ) . append ( let . apply ( vals . get ( 1 ) ) ) . append ( let . apply ( vals . get ( 1 ) ) ) ;
evac . append ( ' ' ) ;
evac . append ( evac . toString ( ) ) ;
int t = 1 ;
while ( in . size ( ) > 0 ) {
  N = Integer . parseInt ( in . remove ( 0 ) ) ;
  String [ ] vals = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) vals [ i ] = in . remove ( i ) . split ( " " ) ;
  System . out . println ( "Case #" + t + ": " + solve ( vals ) ) ;
  t ++ ;
}
return evac . toString ( ) ;
}
