public static long s = 0 ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  long a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  s += a * b ;
}
System . out . println ( s / 10 ) ;
return s ;
}
