def _import ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , X , Y ) :
            length = 1
            while 2 * X <= Y :
                X = 2 * X
                length += 1
            print ( length , end = ' ' )
        def solve ( self , X , Y ) :
            return X
    return Main ( )
