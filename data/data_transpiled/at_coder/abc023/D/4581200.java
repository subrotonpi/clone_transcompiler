static final Scanner getScanner ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  List < List < Integer >> bal = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    bal . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int l = 0 ;
  int r = 10 * 15 ;
  {
    List < Integer > T = new ArrayList < > ( ) ;
    for ( int h = 0 ;
    h < N ;
    h ++ ) {
      int s = bal . get ( h ) ;
      T . add ( ( mid - h ) / s ) ;
    }
    Arrays . sort ( T ) ;
    if ( Arrays . binarySearch ( T , T ) < 0 ) {
      return true ;
    }
    else {
      return false ;
    }
  }
}
