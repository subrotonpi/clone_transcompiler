public static Set < Integer > n = Integer . parseInt ( input ) ;
Set < Integer > ans = new HashSet < > ( ) ;
for ( int i : map . get ( ) . split ( " " ) ) {
  while ( i % 2 == 0 ) {
    i /= 2 ;
  }
  ans . add ( i ) ;
}
System . out . println ( ans . size ( ) ) ;
return ans ;
}
