public static int res = 0 ;
int A = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
/* res = 1; while res*2 <= x < B */
if ( A == B ) {
  res ++ ;
}
while ( A < B ) {
  int C = pow2FloorLog2 ( B ) ;
  if ( A < C ) {
    res += C - A ;
    if ( B > C ) {
      int B_ = C + pow2FloorLog2 ( B - C ) * 2 - 1 ;
      if ( B > C ) {
        B_ = C ;
      }
      if ( C + A <= B_ ) {
        res += C ;
        break ;
      }
      else {
        res += ( C - A ) + ( B_ - C + 1 ) ;
        break ;
      }
    }
    else {
      A -= C ;
      B -= C ;
    }
  }
}
System . out . println ( res ) ;
return res ;
}
