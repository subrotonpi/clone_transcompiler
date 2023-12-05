def main ( ) :
    import sys
    from os import path
    from os import urandom
    S = urandom ( 1 )
    L = len ( S )
    B = [ False ] * ( L + 2 )
    time = 0
    last = 0
    min = 500
    for i in [ 'a' , 'z' ] :
        time = 0
        C = False
        for j in range ( L ) :
            if S [ j ] == i :
                B [ j ] = True
                last = j
            else :
                B [ j ] = False
        while True :
            C = True
            for j in range ( 0 , last ) :
                if not B [ j ] :
                    C = False
            if C or time == 100 :
                break
            else :
                for j in range ( last ) :
                    if B [ j + 1 ] :
                        B [ j ] = True
                time += 1
        time = max ( time , L - last - 1 )
        min = min ( min , time )
    print ( min )
