public static int A , int B , int C , int D ;
int L , R ;
L = A + B ;
R = C + D ;
System . out . println ( [ "Balanced" , "Left" , "Right" ] [ ( R < L ) ? - ( R > L ) : R ] ) ;
return L ;
}
