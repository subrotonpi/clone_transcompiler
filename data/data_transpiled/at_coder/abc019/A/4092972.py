def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self , * args ) :
            return self.sc.readline ( )
    abc = [ ]
    for i in range ( 3 ) :
        abc.append ( i )
    abc.sort ( )
    print ( abc [ 1 ] )
