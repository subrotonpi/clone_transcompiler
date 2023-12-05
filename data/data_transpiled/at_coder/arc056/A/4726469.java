public static int A , int B , int K , int L ;
int s1 = K * A ;
int s2 = ( K / L ) * B + ( K % L ) * A ;
int s3 = ( K / L + 1 ) * B ;
System . out . println ( min ( s1 , s2 , s3 ) ) ;
return s1 ;
}
