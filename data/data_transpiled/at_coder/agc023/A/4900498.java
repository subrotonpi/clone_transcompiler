static final int open ( ) {
  int a = 0 ;
  int s = 0 ;
  d = new HashMap ( 0 , 1 ) ;
  for ( String i : t . split ( " " ) ) s += Integer . parseInt ( i ) ;
  t = d . get ( s ) ;
  a += t ;
  d . put ( s , t + 1 ) ;
  return a ;
}
