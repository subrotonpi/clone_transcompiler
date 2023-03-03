public static int A , int B , int C , int D ;
int X , Y ;
X = A + B ;
Y = C + D ;
if ( X > Y ) {
  System . out . println ( "Left" ) ;
}
else if ( X < Y ) {
  System . out . println ( "Right" ) ;
}
else if ( X == Y ) {
  System . out . println ( "Balanced" ) ;
}
return X ;
}
