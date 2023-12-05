public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  List < Integer > AB = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    AB . add ( Integer . parseInt ( input ) ) ;
  }
  Collections . sort ( AB ) ;
  String ans ;
  if ( AB . get ( 0 ) . intValue ( ) >= K ) {
    ans = AB . get ( 0 ) . intValue ( ) ;
  }
  else {
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      AB . get ( i ) . intValue ( ) + = AB . get ( i - 1 ) . intValue ( ) ;
      if ( AB . get ( i ) . intValue ( ) >= K ) {
        ans = AB . get ( i ) . intValue ( ) ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
}
