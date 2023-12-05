def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            c = [ ]
            for i in range ( 3 ) :
                for j in range ( 3 ) :
                    c [ i ].append ( sc.read ( ) )
        x = [ ]
        y = [ ]
        x.append ( 0 )
        for i in range ( 3 ) :
            y.append ( c [ 0 ] [ i ] - x [ 0 ] )
        for i in range ( 3 ) :
            x.append ( c [ i ] - y [ 0 ] )
        flag = True
        for i in range ( 3 ) :
            for j in range ( 3 ) :
                if x [ i ] + y [ j ] != c [ i ] [ j ] :
                    flag = False
        print ( 'Yes' if flag else 'No' )
