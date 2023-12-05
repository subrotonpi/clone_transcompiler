def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a , self.b , self.c , self.d = sys.stdin.read ( ).decode ( ).decode ( ).split ( '\n' )
        def __call__ ( self , * args , ** kwargs ) :
            if self.a == self.c or self.a == self.d or self.b == self.c or self.b == self.d :
                print ( 'YES' )
            else :
                print ( 'NO' )
    return Main ( )
