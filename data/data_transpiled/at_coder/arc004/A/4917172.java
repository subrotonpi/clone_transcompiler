@ GwtIncompatible ( "java.util.Scanner" ) public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> pp = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    pp . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      if ( i == j ) continue ;
      res = Math . max ( res , ( pp . get ( i ) . get ( 0 ) - pp . get ( j ) . get ( 0 ) ) * ( pp . get ( i ) . get ( j ) - pp . get ( j ) . get ( 0 ) ) + ( pp . get ( i ) . get ( j ) . get ( j ) ) * ( pp . get ( i ) . get ( j ) . get ( j ) - pp . get ( j ) . get ( j ) ) ) ;
    }
  }
  System . out . println ( Math . sqrt ( res ) ) ;
}
