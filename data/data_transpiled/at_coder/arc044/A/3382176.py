def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.out = sys.stdout
        def __call__ ( self ) :
            return sys.stdin
    N , sum , tmp , i = sys.getrecursionlimit ( )
    if N == 1 :
        print ( "Not Prime" )
    else :
        for i in range ( 2 , int ( math.sqrt ( N ) ) + 1 ) :
            if N % i == 0 :
                break
        if i == int ( math.sqrt ( N ) + 1 ) :
            print ( "Prime" )
        else :
            tmp = N
            while True :
                sum += tmp % 10
                tmp /= 10
                if N % 10 % 2 != 0 and N % 10 != 5 and sum % 3 != 0 :
                    print ( "Prime" )
                else :
                    print ( "Not Prime" )
