static final int inpl ( ) {
  return map . get ( input ( ) ) ;
  int N = input ( ) . intValue ( ) ;
  int Q = input ( ) . intValue ( ) ;
  int [ ] X = new int [ N ] ;
  int [ ] R = new int [ N ] ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = input ( ) . intValue ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int a = input ( ) . intValue ( ) ;
    int b = input ( ) . intValue ( ) ;
    int ha = Math . max ( X [ i ] + H - Math . max ( X [ i ] , a ) , 0 ) ;
    int ra = R [ i ] / H * ha ;
    int hb = Math . max ( X [ i ] + H - Math . max ( X [ i ] , b ) , 0 ) ;
    int rb = R [ i ] / H * hb ;
    System . out . println ( Math . pow ( Math . PI * ra * ra * ha / 3 - Math . PI * rb * rb * hb / 3 , 2 ) ) ;
  }
  return N ;
}
