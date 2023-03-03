@ VisibleForTesting static void solve ( final int n , final int r , final int p , final int s ) {
  final boolean verbose = true ;
  final InputStream inputstream = new InputStream ( ) {
    int N , R , P , S ;
    @ Override public int [ ] read ( ) throws IOException {
      return new int [ ] {
        N , R , P , S }
        ;
      }
      @ Override public void generate ( int n , String winner ) throws IOException {
        P = ( int ) ( n * 2 ) ;
        R = ( int ) ( n * 2 ) ;
        S = ( int ) ( n * 2 ) ;
        int [ ] count ;
        if ( winner . equals ( "P" ) ) count = {
          1 , 0 , 0 }
          ;
          else if ( winner . equals ( "R" ) ) count = {
            0 , 1 , 0 }
            ;
            else if ( winner . equals ( "S" ) ) count = {
              0 , 0 , 1 }
              ;
              else assert false ;
              int [ ] res = winner ;
              for ( final int i = 0 ;
              i < n ;
              i ++ ) {
                count = new int [ ] {
                  count [ P ] + count [ S ] , count [ R ] + count [ P ] , count [ S ] + count [ R ] }
                  ;
                  res = Arrays . copyOf ( res , i + 1 ) ;
                  if ( res [ i ] == "PR" ? "RS" : "PS" , res [ i ] == "S" ? ":null);}returntuple(count);}@Overridepublicint[]order(int[]res){finalintl=res.length;if(l==1)returnres;int[]a=newint[l/2];int[]b=newint[l/2];for(inti=0;i<l;i++){a[i]=res[i];b[i]=res[i];}returna;}@Overridepublicint[]solve(intn,intr,intp,ints){int[]count=newint[]{p,r,s};List<Integer>res=newArrayList<Integer>();for(finalStringwinner:" PRS " . toCharArray ( ) ) { int [ ] countP = generate ( n , winner ) ; int [ ] resP = test ( n , winner ) ; if ( countP == count