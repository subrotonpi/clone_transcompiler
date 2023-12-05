def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A , self.B = sys.stdin.read ( ).split ( '\n' )
        def __call__ ( self , * args ) :
            x = A * B
            if x % 2 :
                print ( 'Yes' )
            elif ( x * 3 ) % 2 :
                print ( 'Yes' )
            else :
                print ( 'No' )
