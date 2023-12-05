def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.name = ''
        def __repr__ ( self ) :
            return 'SAME' if os.name.lower ( self.name ) % 1111 == 0 else 'DIFFERENT'
    return Main ( )
