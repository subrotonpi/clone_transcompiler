def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            s = [ ]
            for i in range ( 4 ) :
                s.append ( sc.readline ( ).split ( ) )
    ans = [ ]
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            ans.append ( s [ 3 - i ] [ 3 - j ] )
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            if j == 3 :
                print ( ans [ i ] [ j ] )
            else :
                print ( ans [ i ] [ j ] , end = ' ' )
                print ( ' ' , end = ' ' )
