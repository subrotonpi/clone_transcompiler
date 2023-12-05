public static int A , int B , int X ;
int X ;
X = Integer . parseInt ( input . nextLine ( ) ) ;
if ( X <= A + B && X >= A ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return X ;
}
