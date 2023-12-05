def main ( ) :
    import sys
    from time import sleep
    scn = sys.stdin
    N = scn.read ( )
    time = [ ]
    for i in range ( N - 1 ) :
        C = scn.read ( )
        S = scn.read ( )
        F = scn.read ( )
        for j in range ( 0 , i ) :
            if time [ j ] < S :
                time.append ( S )
            if time [ j ] % F != 0 :
                time [ j ] += F - time [ j ] % F
            time [ j ] += C
    for i in range ( N ) :
        print ( time [ i ] )
