def import _logging
import sys
import logging
class Main ( object ) :
    def __init__ ( self , low , high ) :
        self.low = low
        self.high = high
    def __lt__ ( self , o ) :
        return self.high - o.low
    def __main__ ( self ) :
        with open ( "../" ) as f :
            task = f.read ( )
    current = 1
    while task :
        N = len ( sys.argv )
        arr = [ ]
        status = [ ]
        finished = 0
        star = 0
        for i in range ( N ) :
            arr.append ( Level ( sys.argv [ i ] , sys.argv [ i + 1 ] ) )
        arr.sort ( )
        result = 0
        while finished < N :
            for i in range ( N ) :
                if status [ i ] == 2 :
                    continue
                if star >= arr [ i ].high :
                    star += 2 - status [ i ]
                    status [ i ] = 2
                    finished += 1
                    result += 1
            if finished == N :
                break
            select = - 1
            max = - 1
            for i in range ( N ) :
                if status [ i ] >= 1 :
                    continue
                if star >= arr [ i ].low :
                    if arr [ i ].high > max :
                        select = i
                        max = arr [ i ].high
            if select == - 1 :
                result = - 1
                break
            else :
                result += 1
                status [ select ] = 1
                star += 1
        print ( "Case #{}: {}".format ( current , "Too Bad" if result == - 1 else result ) )
        current += 1
