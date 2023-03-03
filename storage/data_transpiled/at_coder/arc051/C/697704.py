def power ( a , b ) :
    from math import ceil
    mod = 1000000007
    def power ( a , b ) :
        ret = 1
        for i in range ( 30 , - 1 , - 1 ) :
            ret = ceil ( 1 ) * ret * ret % mod
            if b & ( 1 << i ) :
                ret = ceil ( 1 ) * ret * a % mod
        return int ( ret )
    def main ( ) :
        sc = sys.stdin
        N , A , B = sc.regs [ 0 ]
        a = [ ]
        c = [ ]
        for i in range ( N ) :
            a.append ( sc.read ( ) )
        if A == 1 :
            B = 0
        while B != 0 :
            pos = 0
            for j in range ( 1 , N ) :
                if a [ pos ] > a [ j ] :
                    pos = j
            a [ pos ] *= A
            c [ pos ] += 1
            B -= 1
            flag = 0
            for j in range ( N ) :
                if c [ j ] == 0 :
                    flag = 1
                    break
            if not flag :
                break
        a = [ a [ i ] for i in range ( N ) ]
        p = power ( A , B // N )
        for i in range ( B % N ) :
            print ( a [ i ] % mod ** p % mod )
        for i in range ( B % N ) :
            print ( a [ i ] % mod ** p % mod ** A % mod )
    return int ( a )
