def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.readline ( ).strip ( )
            M = sc.readline ( ).strip ( )
            x = sc.readline ( ).strip ( )
            y = sc.readline ( ).strip ( )
            mas1 = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
            mas2 = [ sc.readline ( ).strip ( ) for i in range ( M ) ]
            ans = 0
            for i in range ( N ) :
                mas1 [ i ] = sc.readline ( ).strip ( )
            for i in range ( M ) :
                mas2 [ i ] = sc.readline ( ).strip ( )
            mas1 = [ sc.readline ( ).strip ( ) for i in mas1 ]
            mas2 = [ sc.readline ( ).strip ( ) for i in mas2 ]
            for i in range ( x + 1 , y + 1 ) :
                if i > mas1 [ N - 1 ] and i <= mas2 [ 0 ] :
                    ans = 1
                    break
            if ans == 1 :
                sys.stdout.write ( 'No War\n' )
            else :
                sys.stdout.write ( 'War\n' )
