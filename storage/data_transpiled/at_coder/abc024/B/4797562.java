public static int N ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) . split ( " " ) [ 0 ] ) ;
  long time = Long . parseLong ( input . nextLine ( ) ) ;
  long total = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    long nexttime = Long . parseLong ( input . nextLine ( ) ) ;
    long dif = nexttime - time ;
    total += dif ;
    if ( dif - T > 0 ) total -= dif - T ;
    time = nexttime ;
  }
  return total + T ;
}
