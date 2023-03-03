public static int sum = 0 ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  sum += ( int ) ( ( n * m ) / 10 ) ;
}
return sum ;
}
