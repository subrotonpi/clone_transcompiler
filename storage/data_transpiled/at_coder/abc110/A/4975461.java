public static void aaa ( List < Integer > input ) {
  aaa = list ( map ( Integer . parseInt , input . get ( ) . split ( " " ) ) ) ;
  aaa . sort ( ) ;
  int ans = aaa [ 2 ] * 10 + aaa [ 1 ] + aaa [ 0 ] ;
  System . out . println ( ans ) ;
}
