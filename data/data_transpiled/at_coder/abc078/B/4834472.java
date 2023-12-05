public static int X , int Y , int Z ;
int ans = 0 ;
X -= Z ;
while ( Y + Z <= X ) {
  X -= Y + Z ;
  ans ++ ;
}
System . out . println ( ans ) ;
return ans ;
}
