public static int Q , int H , int S , int D ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
return Math . min ( Math . min ( Q * 4 , H * 2 , S ) , N % 2 ) ;
}
