public static int S = 0 ;
int N = Integer . parseInt ( input ) ;
int [ ] P = new int [ N ] ;
for ( int num = 0 ;
num < N ;
num ++ ) {
  P [ num ] = Integer . parseInt ( input ) ;
}
Arrays . sort ( P , Integer . MIN_VALUE ) ;
P [ 0 ] = P [ 0 ] / 2 ;
for ( int num = 0 ;
num < N ;
num ++ ) {
  S += P [ num ] ;
}
return S ;
}
