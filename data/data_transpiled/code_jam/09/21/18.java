public static double do ( Pair < String , String > decisionTree , String animal , Set < String > features ) {
  double probability = 1.0 ;
  while ( decisionTree . second != null ) {
    probability *= decisionTree . first ;
    if ( features . contains ( decisionTree . second ) ) {
      decisionTree = decisionTree . second ;
    }
    else {
      decisionTree = decisionTree . first ;
    }
  }
  probability *= decisionTree . first ;
  return probability ;
  /* Parse the decision tree */
  String [ ] decisions = decisionTree . first . replace ( "(" , " ( " ) . replace ( ")" , " ) " ) . split ( " " ) ;
  /* Parse the decision tree */
  assert decisions [ 0 ] . equals ( "(" ) ;
  decisions [ 0 ] = Double . parseDouble ( decisions [ 0 ] ) ;
  double weight = Double . parseDouble ( decisions [ 0 ] ) ;
  if ( decisions [ 0 ] . equals ( ")" ) ) {
    decisions [ 0 ] = Double . parseDouble ( decisions [ 0 ] ) ;
    return weight ;
  }
  String feature = decisions [ 0 ] ;
  String tree1 = decisions [ 1 ] ;
  String tree2 = decisions [ 2 ] ;
  assert decisions [ 0 ] . equals ( ")" ) ;
  decisions [ 2 ] = Double . parseDouble ( decisions [ 2 ] ) ;
  decisions [ 3 ] = Double . parseDouble ( decisions [ 3 ] ) ;
  return weight ;
}
