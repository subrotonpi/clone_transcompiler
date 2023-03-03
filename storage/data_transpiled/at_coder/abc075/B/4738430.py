def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , fn ) :
            self.fn = fn
        def __call__ ( self , * args ) :
            return fn ( * args )
    H , W = sys.argv [ 1 : ]
    del sys.argv [ 1 ]
    str = [ ]
    S = [ ]
    for i in range ( H ) :
        for j in range ( W ) :
            s = str [ i ].split ( '' )
            S.append ( s [ j ] )
    for i in range ( H ) :
        for j in range ( W ) :
            if S [ i ] [ j ] == '#' :
                print ( '#' , end = ' ' )
            else :
                print ( minminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminminmin@@