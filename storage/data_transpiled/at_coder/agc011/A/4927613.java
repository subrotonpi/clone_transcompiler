@ Function public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int C = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  List < Integer > Ts = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Ts . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  Collections . sort ( Ts ) ;
  int busCT = 0 ;
  boolean inBus = true ;
  int st = Ts . remove ( 0 ) + K ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int Ti = Ts . remove ( i ) ;
    if ( Ti > st ) {
      busCT ++ ;
      inBus = true ;
      st = Ti + K ;
    }
    else if ( Ti <= st ) {
      inBus ++ ;
    }
    if ( inBus ) {
      busCT ++ ;
    }
  }
  System . out . println ( busCT ) ;
}
