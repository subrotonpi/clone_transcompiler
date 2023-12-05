def _import ( ) :
    import sys
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            with open ( "/proc/sys/stdin" , "r" ) as sc :
                nestValue = sc.read ( )
            result = 0
            for i in range ( 0 , nestValue ) :
                if maxValue ( i ) >= nestValue :
                    result = i
                    i = nestValue
            print ( result )
        def maxValue ( n ) :
            max = 0
            for i in range ( 1 , n + 1 ) :
                max += i
            return max
    return Main
