public static int tot = 0 ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  tot += a * b * 0.1 ;
}
return ( int ) tot ;
}
