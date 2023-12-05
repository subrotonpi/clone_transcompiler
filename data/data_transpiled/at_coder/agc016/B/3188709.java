public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( ( max ( a ) - min ( a ) ) > 1 ) {
    System . out . println ( "No" ) ;
    return ;
  }
  int minor = a . stream ( ) . mapToInt ( Integer :: parseInt ) . max ( ) . getAsInt ( ) ;
  if ( n != minor ) {
    int major = n - minor ;
    int mini = minor + 1 ;
    int maxi = minor + ( major / 2 ) ;
    if ( mini <= max ( a ) && max ( a ) <= maxi || max ( a ) == n - 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
