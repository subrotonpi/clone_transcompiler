static public Pair < String , Double > parse ( String string ) {
  string = string . trim ( ) . trim ( ) . replaceAll ( "()" , "" ) . trim ( ) ;
  String weight = RPattern . matcher ( string ) . matches ( ) ? "()" : string ;
  double weight = Double . parseDouble ( weight ) ;
  string = RPattern . matcher ( string ) . replaceAll ( "(\\d+(?:\\.\\d+)?)" ) . trim ( ) ;
  if ( string . length ( ) == 0 ) return new Pair < String , Double > ( null , weight , null ) ;
  String feature = RPattern . matcher ( string ) . replaceAll ( "([a-z]+)" ) ;
  string = RPattern . matcher ( string ) . replaceAll ( "([a-z]+)" ) . trim ( ) ;
  int index = 0 , balance = 0 ;
  while ( balance > 0 || index == 0 ) {
    if ( string . charAt ( index ) == '(' ) balance ++ ;
    else if ( string . charAt ( index ) == ')' ) balance -- ;
    index ++ ;
  }
  String ltree = string . substring ( 0 , index ) ;
  String rtree = string . substring ( index ) ;
  return new Pair < String , Double > ( feature , weight , parse ( ltree . trim ( ) ) , parse ( rtree . trim ( ) ) ) ;
}
