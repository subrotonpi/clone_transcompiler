def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
        def __call__ ( self , * args ) :
            print ( 'Yes' if self.a % 10 % 111 == 0 or self.a % 1000 % 111 == 0 else 'No' )
    return Main ( )
