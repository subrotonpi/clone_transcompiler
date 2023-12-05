def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.main = Main ( )
            with self.open ( '/proc/self/test/' ) as f :
                self.solve ( f )
        def solve ( self ) :
            a , b , c = self.solve ( )
            if a == b :
                print ( c )
            elif a == c :
                print ( b )
            else :
                print ( a )
    return Main
