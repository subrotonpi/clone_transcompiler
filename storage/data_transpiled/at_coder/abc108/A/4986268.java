public static int K = Integer . parseInt ( input ) {
  if ( ( K % 2 ) == 0 ) {
    System . out . println ( ( int ) ( ( K / 2 ) * ( K / 2 ) ) ) ;
  }
  else {
    System . out . println ( ( int ) ( ( ( K - 1 ) / 2 ) * ( ( K + 1 ) / 2 ) ) ) ;
  }
  return K ;
}
