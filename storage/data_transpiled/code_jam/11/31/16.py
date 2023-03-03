def _ import _ , time , exit , sys , args , fmt , * args , ** kwargs ) :
    import locale
    import sys
    import struct
    import random
    import string
    import random
    import string
    import locale
    import sys
    def main ( fmt , * args ) :
        print ( fmt % args , end = '' )
    def readline ( ) :
        while not args :
            s = random.choice ( args )
        return int ( readline ( ) )
    def uniform ( ) :
        return float ( readline ( ) )
    def readline ( ) :
        while not args :
            s = readline ( )
            if not s : return True
            args = [ s ]
        return False
    f = open ( 'input.txt' , 'r' )
    f.write ( '\n' )
    tc = randint ( 1 , tc )
    for tn in range ( 1 , tc + 1 ) :
        n = randint ( 1 , m )
        q = [ ]
        for i in range ( n ) :
            q.append ( readline ( ).decode ( 'utf-8' ) )
        ok = True
        tile :
            min_i , min_j = - 1 , - 1
            find_min :
            for i in range ( n ) :
                for j in range ( m ) :
                    if q [ i ] [ j ] == '#' :
                        min_i = i
                        min_j = j
                        break find_min
                if min_i == - 1 : break
                for i in range ( min_i , min_i + 2 ) :
                    for j in range ( min_j , min_j + 2 ) :
                        if not ( i >= 0 and i < n and j >= 0 and j < m ) or q [ i ] [ j ] != '#' :
                            ok = False
                            break tile
        f.close ( )
        f.close ( )
    def chk ( b ) :
        if b : return
        print ( traceback.format_exc ( ) )
        exit ( 999 )
    def deb ( fmt , * args ) :
        print ( fmt % args , end = '' )
    yield gen ( f )
    f.close ( )
