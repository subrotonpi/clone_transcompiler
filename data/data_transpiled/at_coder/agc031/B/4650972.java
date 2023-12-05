private static void sums = new int [ N ] ;
int [ ] csums = new int [ N ] ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] C = new int [ N ] ;
int lastc = - 1 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( c >= 0 ) && ( c <= 1 ) ) {
    sums [ i ] = sums [ i - 1 ] + csums [ c ] ;
    csums [ c ] += sums [ i - 1 ] ;
  }
}
