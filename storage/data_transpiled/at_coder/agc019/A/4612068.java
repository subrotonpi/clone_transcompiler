public static int Q , int H , int S , int D ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
return N / 2 * min ( Q * 8 , H * 4 , S * 2 , D ) + N % 2 * min ( Q * 4 , H * 2 , S ) ;
}
