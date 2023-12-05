public static int A , int B , int C , int D ;
int L ;
int R ;
for ( int i = 0 ;
i < input . length ;
i ++ ) {
  L = A + B ;
  R = C + D ;
  if ( L > R ) {
    System . out . println ( "Left" ) ;
  }
  else if ( L == R ) {
    System . out . println ( "Balanced" ) ;
  }
  else if ( L < R ) {
    System . out . println ( "Right" ) ;
  }
}
return L ;
}
