static final int K = ( int ) input ( ) {
  int K = Integer . parseInt ( input ( ) ) ;
  if ( K % 2 == 0 ) {
    System . out . println ( ( ( int ) ( K / 2 ) * ( Math . pow ( K , 2 ) ) ) ) ;
  }
  else {
    System . out . println ( ( int ) ( Math . round ( K / 2 ) * ( Math . round ( K / 2 ) - 1 ) ) ) ;
  }
  return K ;
}
