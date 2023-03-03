public static List < List < Integer >> input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] w = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List < List < Integer >> result = new ArrayList < > ( ) ;
  List < Integer > number = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! number . contains ( i ) ) {
      List < Integer > list = new ArrayList < > ( ) ;
      list . add ( w [ i ] ) ;
      number . add ( i ) ;
      w [ i ] = w [ j ] ;
    }
    result . add ( list ) ;
  }
  return result ;
}
