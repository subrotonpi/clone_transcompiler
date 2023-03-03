public static int N = Integer . parseInt ( input ) ;
if ( N / 3600 > 0 ) {
  int hh = N / 3600 ;
  N -= hh * 3600 ;
}
else {
  hh = 0 ;
}
int ss = N ;
return ss ;
}
