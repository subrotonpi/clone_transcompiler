public static int A , int B , int C , int D , int E , int F = Integer . parseInt ( input . readLine ( ) ) ;
int ans = 100 * A , 0 ;
Set < Integer > w = new HashSet < > ( ) ;
for ( int a = 0 ;
a <= F + 1 ;
a += 100 * A ) for ( int b = 0 ;
b <= F - a + 1 ;
b += 100 * B ) if ( a + b > 0 ) w . add ( a + b ) ;
Set < Integer > s = new HashSet < > ( ) ;
for ( int c = 0 ;
c <= F + 1 ;
c += C ) for ( int d = 0 ;
d <= F + 1 - c ;
d += D ) s . add ( c + d ) ;
for ( int wi : w ) for ( int sj : s ) if ( wi + sj <= F && 100 * sj / wi <= E ) ans = Math . max ( ans , ( wi + sj ) , sj ) ;
return ans ;
}
