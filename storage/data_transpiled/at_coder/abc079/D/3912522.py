def import sys , costcheck , costcheck , costcheck , select , cost , ceiling ) :
    from collections import defaultdict
    c = defaultdict ( list )
    def main ( ) :
        with open ( '/proc/cpuinfo' , 'r' ) as sc :
            h , w = sc.readline ( ).split ( )
            for i in range ( 10 ) :
                for j in range ( 10 ) :
                    c [ i ] [ j ].append ( sc.readline ( ) )
        arr = [ ]
        for i in range ( 10 ) :
            if i == 1 :
                continue
            ceiling = c [ i ] [ 1 ]
            for j in range ( 10 ) :
                if j == i or j == 1 :
                    continue
                ret = costcheck ( j , c [ i ] [ j ] , ceiling )
                if ret < ceiling :
                    ceiling = ret
            arr.append ( ceiling )
        total = 0
        for i in range ( h ) :
            for j in range ( w ) :
                x = random.choice ( arr )
                if x != - 1 :
                    total += arr [ x ]
        print ( total )
    def costcheck ( select , cost , ceiling ) :
        direct = c [ select ] [ 1 ] + cost
        for i in range ( 0 , 9 ) :
            if i != 1 and i != select :
                if direct > c [ select ] [ i ] + cost and cost + c [ select ] [ i ] < ceiling :
                    ret = costcheck ( i , cost + c [ select ] [ i ] , ceiling )
                    if ret < direct :
                        direct = ret
        if direct < ceiling :
            return direct
        else :
            return ceiling
    return main
