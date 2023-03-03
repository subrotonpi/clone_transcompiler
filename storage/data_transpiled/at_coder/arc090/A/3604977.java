public static int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
List < List < Integer >> maze = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  maze . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ) ) ;
}
int ans = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  ans = Math . max ( ans , Math . pow ( maze . get ( 0 ) . get ( i ) , 2 ) + Math . pow ( maze . get ( 1 ) . get ( i ) , 2 ) ) ;
}
System . out . println ( ans ) ;
return ans ;
}
