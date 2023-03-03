public static int A , int B , int C ;
int ans ;
for ( String s : input . split ( " " ) ) {
  c1 = C % 2 == 0 ? 0 : A * B ;
  c2 = B % 2 == 0 ? 0 : A * C ;
  c3 = B % 2 == 0 ? 0 : B * C ;
  ans = Math . min ( c1 , c2 , c3 ) ;
}
