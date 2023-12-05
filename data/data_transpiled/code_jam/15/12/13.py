def round1a ( t ) :
    import time
    class B ( object ) :
        def __init__ ( self , times ) :
            self.times = times
        def started ( self , t ) :
            ret = 0
            for i in range ( len ( times ) ) :
                ret += 1 + t // times [ i ]
            return ret
        def main ( self ) :
            with open ( "test.txt" , "r" ) as f :
                cases = f.readlines ( )
                for caze in range ( 1 , cases + 1 ) :
                    B , N = B.split ( " " )
                    times = [ time.split ( " " ) [ 0 ] for time in f.readlines ( ) ]
    for caze in range ( 1 , cases + 1 ) :
        B , N = B.split ( " " )
        times = [ time.split ( " " ) [ 0 ] for time in times ]
        ret = - 1
        if B >= N :
            ret = N
        if ret == - 1 :
            left , right = 0 , N * 1000000
            while left + 1 < right :
                med = ( left + right ) / 2
                if started ( med ) < N :
                    left , right = med , left
                else :
                    right = med
            dif = N - started ( left )
            for i in range ( len ( times ) ) :
                if right % times [ i ] == 0 :
                    dif -= 1
                if dif == 0 :
                    ret = i + 1
                    break
        print ( "Case #{}: {}".format ( caze , ret ) )
