def A_as ( ) :
    import locale
    import os
    import sys
    class A_as ( object ) :
        SZ = 6010
        def solve ( self ) :
            with open ( 'A-large.in' , 'r' ) as f :
                with open ( 'A-large.out' , 'w' ) as f :
                    for i , t in enumerate ( f ) :
                        tn = len ( a )
                        for test in range ( tn ) :
                            l = len ( f )
                            dx = [ 0 , 1 , 0 , - 1 ]
                            dy = [ 1 , 0 , - 1 , 0 ]
                            m = [ 1 , 2 , 1 , 2 ]
                            d = 0
                            a = [ ]
                            x = SZ // 2
                            y = SZ // 2
                            for i , s in enumerate ( f ) :
                                t = len ( s )
                                for j in range ( t ) :
                                    for k in range ( len ( s ) ) :
                                        if s [ k ] == 'F' :
                                            a [ x ] [ y ] |= m [ d ]
                                            x += dx [ d ]
                                            y += dy [ d ]
                                        elif s [ k ] == 'L' :
                                            if d == 0 :
                                                x -= 1
                                            elif d == 1 :
                                                break
                                            elif d == 2 :
                                                y += 1
                                            elif d == 3 :
                                                x += 1
                                                y -= 1
                                            d = ( d + 3 ) % 4
                                        elif s [ k ] == 'R' :
                                            if d == 0 :
                                                break
                                            elif d == 1 :
                                                y -= 1
                                            elif d == 2 :
                                                x -= 1
                                                y += 1
                                            elif d == 3 :
                                                x += 1
                                            d = ( d + 1 ) % 4
    return A_as ( )
