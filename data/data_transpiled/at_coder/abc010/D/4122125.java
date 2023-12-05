static final int [ ] [ ] G = new int [ 101 ] [ 101 ] ;
for ( int i = 0 ;
i < 101 ;
i ++ ) {
  G [ i ] [ 0 ] = i ;
}
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int g = Integer . parseInt ( input . nextLine ( ) ) ;
int e = Integer . parseInt ( input . nextLine ( ) ) ;
for ( String s : input . split ( " " ) ) {
  int pi = Integer . parseInt ( s ) ;
  G [ pi ] [ 100 ] = G [ 100 ] [ pi ] = 1 ;
}
for ( int i = 0 ;
i < e ;
i ++ ) {
  int ai = Integer . parseInt ( input . nextLine ( ) ) ;
  int bi = Integer . parseInt ( input . nextLine ( ) ) ;
  G [ ai ] [ bi ] = G [ bi ] [ ai ] = 1 ;
}
return new int [ ] [ ] {
  n , g , e }
  ;
}
