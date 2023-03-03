public static int point = 0 ;
for ( int i = 0 ;
i <= 3 ;
i ++ ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int e = Integer . parseInt ( input . nextLine ( ) ) ;
  point += s * e / 10 ;
}
return ( int ) point ;
}
