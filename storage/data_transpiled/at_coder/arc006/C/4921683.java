public static int N = Integer . parseInt ( input ) {
  List < Integer > upperNums = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int newNum = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( upperNums . size ( ) == 0 ) {
      upperNums . add ( newNum ) ;
      break ;
    }
    else {
      upperNums . add ( newNum ) ;
    }
  }
  return upperNums . size ( ) ;
}
