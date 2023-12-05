public static int x = 0 ;
int ans = 10 * 10 ;
for ( int i : ContainerUtil . newArrayList ( ) ) {
  x = ( x * 10 ) % 1000 + i ;
  ans = Math . min ( Math . abs ( x - 753 ) , ans ) ;
}
return ans ;
}
