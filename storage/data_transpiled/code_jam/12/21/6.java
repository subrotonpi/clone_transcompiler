static String solve ( List < String > slist ) {
  final double X = sum ( slist ) ;
  double need = 1.0 * ( sum ( slist ) + X ) / len ( slist ) ;
  List < String > sublist = stream ( slist ) . filter ( s -> s . compareTo ( need ) < 0 ) . collect ( toList ( ) ) ;
  need = 1.0 * ( sum ( sublist ) + X ) / len ( sublist ) ;
  List < Integer > left = new ArrayList < > ( slist . size ( ) ) ;
  for ( String s : slist ) left . add ( max ( need - s , 0 ) ) ;
  List < Integer > result = new ArrayList < > ( left . size ( ) ) ;
  for ( int y : left ) result . add ( 100 * y / sum ( left ) ) ;
  return StringUtils . join ( result , " " ) ;
}
