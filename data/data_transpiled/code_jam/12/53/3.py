def main ( args ) :
    import random
    import sys
    class C :
        def func3 ( low , high , constant , slant , xsum ) :
            min_k = ( xsum + high - 1 ) // high
            max_k = xsum
            if not low in range ( N ) :
                max_k = xsum // low
            if max_k < min_k :
                return int ( 1l << 60 )
            K = max_k
            if constant > 0 :
                K = min_k
            return slant * xsum + constant * K
        def func2 ( C , N , price , day , xsum ) :
            low = 0
            init = C
            ans = int ( 1l << 60 )
            while 1 :
                next = - 1
                i = 0
                for i in range ( N ) :
                    if day [ i ] > low :
                        if next == - 1 or price [ i ] < price [ next ] :
                            next = i
                if next == - 1 :
                    break
                tmp = func3 ( low , day [ next ] , init - price [ next ] * low , price [ next ] , xsum )
                if tmp < ans :
                    ans = tmp
                init = init + ( day [ next ] - low ) * price [ next ]
                low = day [ next ]
            return ans
        def func3 ( M , C , N , price , day ) :
            low = 0
            high = int ( 1l << 60 )
            while not high - low in range ( 1 , N ) :
                mid = ( high + low ) // 2
                miny = func2 ( C , N , price , day , mid )
                if miny <= M :
                    low = mid
                else :
                    high = mid
            return low
    C = C
    def main2 ( ) :
        return C
    def func3 ( low , high , constant , slant , xsum ) :
        return C
    def func3 ( low , high , constant , slant , xsum ) :
        return C
    def func3 ( low , high , constant , slant , xsum ) :
        return C
    def func3 ( low , high , constant , slant , xsum ) :
    