@ org . python . Method ( __doc__ = "" ) public static org . python . Object __main__ ( ) {
  String input = System . getProperty ( "input" ) ;
  int tc = Integer . parseInt ( input ) ;
  int R = 100 ;
  for ( int t = 1 ;
  t <= tc ;
  t ++ ) {
    System . out . print ( "Case #" + t + ": " ) ;
    int Hd = Integer . parseInt ( input ) ;
    int Ad = Integer . parseInt ( input ) ;
    int Hk = Integer . parseInt ( input ) ;
    int Ak = Integer . parseInt ( input ) ;
    int B = Integer . parseInt ( input ) ;
    int D = Integer . parseInt ( input ) ;
    int b ;
    if ( B == 0 ) {
      b = 0 ;
    }
    else {
      int b1 = Integer . parseInt ( input ) ;
      int b2 = b1 + 1 ;
      if ( ( Hk + b1 * B + Ad - 1 ) / ( b1 * B + Ad ) + b1 <= ( Hk + b2 * B + Ad - 1 ) / ( b2 * B + Ad ) + b2 ) {
        b = b1 ;
      }
      else {
        b = b2 ;
      }
    }
    int a = ( Hk + b * B + Ad - 1 ) / ( b * B + Ad ) ;
    int ab = a + b ;
    int hi = Hd ;
    int minturn = 10 ;
    if ( ab <= ( Hd - 1 ) / Ak + 1 ) {
      minturn = ab ;
    }
    else if ( D == 0 ) {
      int u = ( Hd - Ak - 1 ) / Ak ;
      if ( u <= 0 && Hk > Ad ) {
        minturn = 10 ;
      }
      else {
        int w = ab - ( Hd - 1 ) / Ak ;
        minturn = ( Hd - 1 ) / Ak + w + ( w + u - 2 ) / u ;
      }
    }
    else if ( Hk > Ad && Ak - D >= Hd ) {
      minturn = 10 ;
    }
    else {
      int z = 0 ;
      boolean lastWasHeal = false ;
      int Hi = Hd ;
      int lastu = - 1 ;
      while ( Ak > 0 ) {
        int u = ( Hd - Ak - 1 ) / Ak ;
        if ( ab <= ( Hi - 1 ) / Ak + 1 ) {
          minturn = Math . min ( minturn , z + ab ) ;
        }
        else if ( u >