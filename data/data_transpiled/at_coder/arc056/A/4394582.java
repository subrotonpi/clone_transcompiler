public static int A , int B , int K , int L ;
int tmp ;
tmp = ( K / L ) * B ;
res = min ( ( K - ( K / L ) * L ) * A + tmp , tmp + B ) ;
System . out . println ( res ) ;
return res ;
}
