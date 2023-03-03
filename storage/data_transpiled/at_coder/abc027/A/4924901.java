public static int rect ( @ IntRange ( from = 0 , to = 100 ) int l1 , @ IntRange ( from = 0 , to = 100 ) int l2 , @ IntRange ( from = 0 , to = 100 ) int l3 ) {
  if ( l1 == l2 ) return l3 ;
  if ( l1 == l3 ) return l2 ;
  return l1 ;
}
if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
  l1 = Integer . parseInt ( input . nextLine ( ) ) ;
  l2 = Integer . parseInt ( input . nextLine ( ) ) ;
  l3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = rect ( l1 , l2 , l3 ) ;
  System . out . println ( ans ) ;
}
