def _import ( ) :
    import sys
    import os
    import sys
    import os
    import shlex
    import sys
    class Main ( object ) :
        def __init__ ( self , args ) :
            super ( Main , self ).__init__ ( )
            self.args = args
        def __next__ ( self ) :
            sc = shlex.shlex
            h = sc.__next__ ( )
            w = sc.__next__ ( )
            board = [ ]
            for i in range ( h ) :
                if board [ i ] [ j ] != '#' :
                    break
            if self.match :
                print ( 'possible' )
                for i in range ( h ) :
                    for j in range ( w ) :
                        print ( '#' , i )
            else :
                print ( 'impossible' )
    class FastReader ( ) :
        def __init__ ( self ) :
            self.args = [ ]
        def __next__ ( self ) :
            sc = shlex.shlex
            h = sc.__next__ ( )
            w = sc.__next__ ( )
            board = [ ]
            for i in range ( h ) :
                if board [ i ] [ j ] == '#' :
                    flag = True
                    if i > 0 :
                        if j > 0 and board [ i - 1 ] [ j - 1 ] == '.' :
                            flag = False
                        if j < w - 1 and board [ i - 1 ] [ j + 1 ] == '.' :
                            flag = False
                        if board [ i - 1 ] [ j ] == '.' :
                            flag = False
                    if flag and i < h - 1 :
                        if j > 0 and board [ i + 1 ] [ j - 1 ] == '.' :
                            flag = False
                        if j < w - 1 and board [ i ] [ j + 1 ] == '.' :
                            flag = False
                    if flag :
                        black_original [ i ] [ j ] = True
    reproduceBoard = [ ]
    for arr in reproduceBoard :
        arr.append ( '#' )
    return True
