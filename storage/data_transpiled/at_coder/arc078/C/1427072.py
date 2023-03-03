def ask ( number ) :
    import sys
    import os
    import sys
    class Main ( object ) :
        def ask ( number ) :
            print ( "? " + number )
        def answer ( number ) :
            print ( "? " + number )
        def answer ( number ) :
            print ( "! " + number )
        def dec ( k ) :
            a = 1
            for i in range ( k ) :
                a *= 10
            return a
        def main ( ) :
            with open ( "/proc/stdin" , "r" ) as sc :
                digit = - 1
                for i in range ( 0 , 10 ) :
                    ask ( dec ( i ) )
                    if sc.read ( ) == "N" :
                        digit = i
                        break
                if digit == - 1 :
                    for i in range ( 0 , 10 ) :
                        ask ( 2 * dec ( i ) )
                        if sc.read ( ) == "Y" :
                            answer ( dec ( i ) )
                            sys.exit ( )
                else :
                    min = dec ( digit - 1 )
                    max = dec ( digit ) - 1
                    while min < max :
                        next = ( min + max ) / 2
                        ask ( next * 10 )
                        if sc.read ( ) == "Y" :
                            max = next
                        else :
                            min = next + 1
                    answer ( min )
                    sys.exit ( )
    return Main ( )
