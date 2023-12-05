def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        n = sc.randint ( 1 , 10000 )
        m = sc.randint ( 1 , 10000 )
        a = [ ]
        for i in range ( n ) :
            a.append ( sc.read ( n ).decode ( 'utf-8' ) )
        b = [ ]
        for i in range ( m ) :
            b.append ( sc.read ( m ).decode ( 'utf-8' ) )
        F = False
        loop :
        for i in range ( n - m + 1 ) :
            for j in range ( n - m + 1 ) :
                temp = True
                for x in range ( m ) :
                    for y in range ( m ) :
                        if a [ i + x ] [ j + y ] != b [ x ] [ y ] :
                            temp = False
                if temp is True :
                    F = True
                    break loop
        print ( 'Yes' if F else 'No' )
    def printChar2Array ( c ) :
        for i in range ( len ( c ) ) :
            for j in range ( len ( c [ 0 ] ) ) :
                print ( c [ i ] [ j ] , end = ' ' )
            print ( )
        print ( )
