public static int X , int Y , int Z ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
N = 0 ;
while ( N * Y + ( N + 1 ) * Z <= X ) {
  N ++ ;
}
return N - 1 ;
}
