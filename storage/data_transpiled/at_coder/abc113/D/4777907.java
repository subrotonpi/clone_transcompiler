public static boolean valid ( int x ) {
  int evenMask = 85 ;
  int odMask = 170 ;
  return ( x & odMask ) >> 1 & ( x & evenMask ) == 0 && ( x & odMask ) << 1 & ( x & evenMask ) == 0 ;
}
