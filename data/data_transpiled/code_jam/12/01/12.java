/**
* y qee
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv
*/
public static void main ( String [ ] args ) {
  String sampleOut = "a zoo" ;
  HashMap < Character , String > key = new HashMap < Character , String > ( ) ;
  Set < Character > keys = new HashSet < Character > ( ) ;
  Set < Character > values = new HashSet < Character > ( ) ;
  assert sampleIn . length == sampleOut . length ( ) ;
  for ( int i = 0 ;
  i < sampleIn . length ;
  i ++ ) {
    char ch = sampleIn [ i ] . charAt ( 0 ) ;
    key . put ( ch , sampleOut [ i ] ) ;
    keys . add ( ch ) ;
    values . add ( sampleOut [ i ] ) ;
  }
  Set < Character > alpha = new HashSet < Character > ( ) ;
  for ( int i = Character . MIN_VALUE ;
  i <= Character . MAX_VALUE ;
  i ++ ) {
    alpha . add ( ( char ) i ) ;
  }
  Set < Character > nonkeys = alpha . keySet ( ) ;
  if ( nonkeys . size ( ) > 0 ) {
    assert nonkeys . size ( ) == 1 ;
    Set < Character > nonvalues = alpha . keySet ( ) ;
    assert nonvalues . size ( ) == 1 ;
    key . put ( nonkeys . iterator ( ) . next ( ) , nonvalues . iterator ( ) . next ( ) ) ;
  }
  final Scanner scanner = new Scanner ( System . in ) ;
  for ( int num = 0 ;
  num < args . length ;
  num ++ ) {
    String line = scanner . nextLine ( ) ;
    if ( num == 0 ) continue ;
    System . out . println ( "Case #" + num + ": " + StringUtils . toString ( key . get ( line ) ) ) ;
  }
}
