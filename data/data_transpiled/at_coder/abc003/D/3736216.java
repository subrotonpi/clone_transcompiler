public static int [ ] getR ( int R , int C ) {
  int X = R ;
  int Y = C ;
  int D = R - 1 ;
  int iD = R - 1 ;
  int iMax = X * Y ;
  int [ ] aM = new int [ iMax + 1 ] ;
  for ( int i = 0 ;
  i < iMax ;
  i ++ ) {
    aM [ i ] = aM [ i - 1 ] * i % iD ;
  }
  int [ ] aInvM = new int [ iMax + 1 ] ;
  aInvM [ iMax ] = Math . pow ( aM [ iMax ] , iD - 2 , iD ) ;
  for ( int i = iMax ;
  i > 0 ;
  i -- ) {
    aInvM [ i - 1 ] = aInvM [ i ] * i % iD ;
  }
  /* if (N > 0) {
  System.out.println(N > 0);
  System.out.println(N > 0);
  }*/
  int dxy = ( R - X + 1 ) * ( C - Y + 1 ) ;
  int NCR = nCr ( iMax , D ) ;
  if ( X * Y == D + L ) {
    System . out . println ( NCR * dxy % iD ) ;
  }
  else {
    if ( X * Y - D - L < Math . min ( X , Y ) ) {
      System . out . println ( NCR * nCr ( iMax - D , L ) * dxy % iD ) ;
    }
    else {
      int A = NCR * nCr ( iMax - D , L ) % iD ;
      A -= nCr ( ( X - 1 ) * ( Y ) , D ) * nCr ( ( X - 1 ) * ( Y - D ) , L ) * 2 % iD ;
      A -= nCr ( ( X - 2 ) * ( Y - 1 ) , D ) * nCr ( ( X - 2 ) * ( Y - 1 ) , L ) * 2 % iD ;
      A += nCr ( ( X - 2 ) * ( Y - 1 ) , D ) * nCr ( ( X - 2 ) * ( Y - 1 ) , L ) * 2 % iD ;
      A += nCr ( ( X - 2 ) * ( Y - 1 ) , D ) * 2 %