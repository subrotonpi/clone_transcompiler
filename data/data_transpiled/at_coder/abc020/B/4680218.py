def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.b = 1
        def __call__ ( self , * args ) :
            reader = open ( "/proc/self/" )
            A = reader.read ( )
            B = reader.read ( )
            reader.close ( )
            ans = int ( A + B ) * 2
            print ( ans )
    return Main
