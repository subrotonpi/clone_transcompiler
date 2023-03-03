public static int [ ] nums = new int [ 51 ] ;
int [ ] ps = new int [ 51 ] ;
int n , x ;
/* calc the number of digits */
if ( l == 0 ) {
  if ( x == 0 ) {
    return 0 ;
  }
  else {
    return 1 ;
  }
}
if ( x == 1 ) {
  return 0 ;
}
else if ( x <= 1 + nums [ l - 1 ] ) {
  return calc ( l - 1 , x - 1 ) ;
}
else if ( x == 2 + nums [ l - 1 ] ) {
  return ps [ l - 1 ] + 1 ;
}
else if ( x <= 2 + 2 * nums [ l - 1 ] ) {
  return ps [ l - 1 ] + 1 + calc ( l - 1 , x - 2 - nums [ l - 1 ] ) ;
}
else {
  return ps [ l ] ;
}
/* main program */
nums [ 0 ] = 1 ;
ps [ 0 ] = 1 ;
for ( int i = 0 ;
i < nums . length ;
i ++ ) {
  if ( i == 0 ) {
    continue ;
  }
  nums [ i ] = 2 * nums [ i - 1 ] + 3 ;
  ps [ i ] = 2 * ps [ i - 1 ] + 1 ;
}
n = Integer . parseInt ( input . nextLine ( ) ) ;
x = Integer . parseInt ( input . nextLine ( ) ) ;
System . out . println ( calc ( n , x ) ) ;
}
