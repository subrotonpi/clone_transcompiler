def _ _ main _ _ ( ) :
    import sys
    import math
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.MOD = long ( 1e9 + 7 )
        def __call__ ( self ) :
            sc = random.choice ( self.MOD )
            s = sc.next ( )
            x = sc.randint ( 0 , 1 )
            y = sc.randint ( 0 , 1 )
            lst = [ [ ] for i in range ( 2 ) ]
            c = 0
            first = True
            for i in range ( len ( s ) ) :
                j = i
                cnt = 0
                while j < len ( s ) and s [ j ] == 'F' :
                    cnt += 1
                    j += 1
                if first :
                    x = abs ( x - cnt )
                    first = False
                else :
                    lst [ c ].append ( cnt )
                i = j
                c ^= 1
            x = abs ( x )
            y = abs ( y )
            if x > 8000 or y > 8000 :
                print ( "No" )
                return
            dp = [ [ True ] * 2 , [ False ] * 2 , [ False ] * 2 , [ False ] * 2 ]
            for i in range ( len ( lst [ 0 ] ) ) :
                for j in range ( 0 , 8000 ) :
                    dp [ ( i % 2 ) ^ 1 ] [ j ] = False
                for j in range ( 0 , 8000 + len ( lst [ 0 ] ) ) :
                    if dp [ ( i % 2 ) ] [ j ] :
                        dp [ ( i % 2 ) ^ 1 ] [ j + lst [ 0 ] [ i ] ] = True
                        dp [ ( i % 2 ) ^ 1 ] [ abs ( j - lst [ 0 ] [ i ] ) ] = True
            if not dp [ len ( lst [ 0 ] ) % 2 ] [ x ] :
                print ( "No" )
                return
            dp = [ [ False ] * 2 , [ False ] * 2 , [ False ] * 2 ]
            dp [ 0 ] [ x ] = True
            dp [ len ( lst [ 0 ] ) % 2 ] [ y ] = True
    return Main
