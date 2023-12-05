public static int moveCount ( int G , int l ) {
  int R = Math . abs ( G + l - 1 ) ;
  int L = Math . abs ( l ) ;
  if ( l > 0 ) {
    return ( R + 1 ) * R / 2 - ( L - 1 ) * L / 2 ;
  }
  else if ( G >= L ) {
    return ( R + 1 ) * R / 2 + ( L + 1 ) * L / 2 ;
  }
  else {
    return ( L + 1 ) * L / 2 - ( R - 1 ) * R / 2 ;
  }
  /* main program */
  Scanner input = new Scanner ( System . in ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int G = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  R = Math . max ( R , B ) ;
  B = Math . min ( R , B ) ;
  int ans ;
  if ( ( ( ( R - 1 ) / 2 + ( G - 1 ) / 2 ) <= 100 ) && ( ( G - 1 ) / 2 ) <= 100 ) {
    int RL = - ( R / 2 ) ;
    int GL = - ( G - 1 ) / 2 ;
    int BL = - ( B - 1 ) / 2 ;
    ans = moveCount ( R , RL ) + moveCount ( G , GL ) + moveCount ( B , BL ) ;
  }
  else {
    int Lmin = - ( R + G ) - 100 ;
    ans = 10 * 9 ;
    for ( int i = Lmin ;
    i < 1000 ;
    i ++ ) {
      int RL = i + 100 ;
      int GL = i + R ;
      int BL = Math . max ( ( GL + G ) - 100 , - ( B - 1 ) / 2 ) ;
      int comp = moveCount ( R , RL ) + moveCount ( G , GL ) + moveCount ( B , BL ) ;
      ans = Math . min ( ans , comp ) ;
    }
  }
  System . out . println ( ans ) ;
  if ( className == null ) {
    main ( ) ;
  }
  return ans ;
}
