public static void main ( String [ ] args ) {
  int A = Integer . parseInt ( input ( ) ) ;
  int B = Integer . parseInt ( input ( ) ) ;
  int C = Integer . parseInt ( input ( ) ) ;
  int X = Integer . parseInt ( input ( ) ) ;
  int Y = Integer . parseInt ( input ( ) ) ;
  int total = 0 ;
  if ( A + B <= 2 * C ) {
    total += X * A + Y * B ;
  }
  else {
    if ( A <= 2 * C && B <= 2 * C ) {
      if ( X == Y ) {
        total += ( X + Y ) * C ;
      }
      else if ( X < Y ) {
        total += 2 * X * C ;
        total += ( Y - X ) * B ;
      }
      else if ( X > Y ) {
        total += 2 * Y * C ;
        total += ( X - Y ) * A ;
      }
    }
    else if ( A <= 2 * C && B > 2 * C ) {
      if ( X == Y ) {
        total += ( X + Y ) * C ;
      }
      else if ( X < Y ) {
        total += 2 * Y * C ;
      }
      else if ( X > Y ) {
        total += 2 * Y * C ;
        total += ( X - Y ) * A ;
      }
    }
    else if ( B <= 2 * C && A > 2 * C ) {
      if ( X == Y ) {
        total += ( X + Y ) * C ;
      }
      else if ( X > Y ) {
        total += 2 * X * C ;
      }
      else if ( X < Y ) {
        total += 2 * X * C ;
        total += ( Y - X ) * B ;
      }
    }
    else if ( A > 2 * C && B > 2 * C ) {
      total += Math . max ( X , Y ) * 2 * C ;
    }
  }
  System . out . println ( total ) ;
}
