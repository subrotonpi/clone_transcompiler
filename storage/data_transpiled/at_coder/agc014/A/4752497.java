public static int A , B , C ;
int ans = Integer . parseInt ( input ) ;
if ( A == B == C ) {
  if ( A % 2 != 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
else {
  ans = 0 ;
  do {
    if ( A % 2 != 0 || B % 2 != 0 || C % 2 != 0 ) {
      break ;
    }
    else {
      A = ( B + C ) / 2 ;
      B = ( A + C ) / 2 ;
      C = ( A + B ) / 2 ;
      ans ++ ;
    }
  }
  while ( true ) ;
  System . out . println ( ans ) ;
}
return ans ;
}
