public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  List < Integer > a = new ArrayList < > ( Collections . nCopies ( N , input ) ) ;
  a . sort ( ) ;
  int Alice = 0 ;
  int Bob = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      Alice += a . get ( i ) ;
    }
    else {
      Bob += a . get ( i ) ;
    }
  }
  System . out . println ( Alice - Bob ) ;
}
