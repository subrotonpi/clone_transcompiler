public static int getDistance ( int L , int X , int Y , int S , int D ) {
  int tmp1 , tmp2 ;
  if ( D - S > 0 ) {
    tmp1 = ( D - S ) / ( X + Y ) ;
    tmp2 = 10 * 10 ;
    if ( Y > X ) tmp2 = ( S + ( L - D ) ) / ( Y - X ) ;
    System . out . println ( Math . min ( tmp1 , tmp2 ) ) ;
  }
  else {
    tmp1 = ( ( L - S ) + D ) / ( X + Y ) ;
    tmp2 = 10 * 10 ;
    if ( Y > X ) tmp2 = ( S - D ) / ( Y - X ) ;
    System . out . println ( Math . min ( tmp1 , tmp2 ) ) ;
  }
  return tmp1 ;
}
