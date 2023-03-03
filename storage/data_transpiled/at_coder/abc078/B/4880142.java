public static int X , int Y , int Z ;
int ans = 0 ;
int width_sum = 0 ;
while ( true ) {
  if ( width_sum + Y + Z <= X - Z ) {
    width_sum += Y + Z ;
    ans ++ ;
  }
  else {
    break ;
  }
}
System . out . println ( ans ) ;
return ans ;
}
