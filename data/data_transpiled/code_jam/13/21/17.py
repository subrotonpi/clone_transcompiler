def main ( ) :
    import random
    import sys
    from math import ceil
    from time import sleep
    from itertools import chain
    def process_input ( input ) :
        scan = input
        task_count = len ( input )
        dp = [ [ 0 for i in range ( 101 ) ] for _ in range ( 201 ) ]
        for task_index in range ( 1 , task_count + 1 ) :
            A = next ( scan )
            N = next ( scan )
            arr = chain ( [ A ] , [ A ] )
            arr.sort ( )
            for i in range ( 0 , N ) :
                for j in range ( 0 , 200 ) :
                    dp [ i ] [ j ] = - 1
            dp [ 0 ] [ 0 ] = A
            for i in range ( 1 , N ) :
                current = arr [ i - 1 ]
                for j in range ( 0 , 200 ) :
                    if dp [ i - 1 ] [ j ] == - 1 :
                        continue
                    dp [ i ] [ j + 1 ] = max ( dp [ i ] [ j + 1 ] , dp [ i - 1 ] [ j ] )
                    if dp [ i - 1 ] [ j ] <= 1 :
                        continue
                    temp = dp [ i - 1 ] [ j ]
                    add = 0
                    while temp <= current :
                        temp += temp - 1
                        add += 1
                    dp [ i ] [ j + add ] = max ( dp [ i ] [ j + add ] , temp + current )
            res = - 1
            for i in range ( 0 , 200 ) :
                if dp [ N ] [ i ] >= 0 :
                    res = i
                    break
            print ( 'Case #%d: %d' % ( task_index , res ) )
